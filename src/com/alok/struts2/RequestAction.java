package com.alok.struts2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.alok.to.EmployeeTO;
import com.alok.to.RequestTO;

public class RequestAction extends ALOKBaseAction {
	private String priority;
	private String description;
	private int rid;

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public void validate() {
		if (priority == null || priority.length() == 0) {
			addFieldError("priority", "Priority is required");
		}
		if (description == null || description.length() == 0) {
			addFieldError("description", "Description is required");
		}
	}

	public String execute() {
		System.out.println(priority);
		System.out.println(description);
		RequestTO rto = new RequestTO();
		rto.setPriority(priority);
		rto.setDescription(description);
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session = req.getSession();
		EmployeeTO eto = (EmployeeTO) session.getAttribute("ETO");
		rto.setEmpId(eto.getEmpId());
		rto.setStatus("New");
		int rid = requestService.postRequest(rto);
		req.setAttribute("RID", rid);

		return SUCCESS;
	}
}
