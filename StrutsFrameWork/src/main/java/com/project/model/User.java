package com.project.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class User extends ActionForm{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if(getUsername()==""||getUsername()==null) {
			actionErrors.add("error.username", new ActionMessage("error.username"));
		}
		if(getPassword()==""||getPassword()==null) {
			actionErrors.add("error.password", new ActionMessage("error.password"));
		}
		return actionErrors;
	}
}
