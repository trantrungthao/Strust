package com.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
//import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.project.model.User;

public class UserAction extends MappingDispatchAction{
	//
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//
		return mapping.findForward("adduser");
	}
	//
	public ActionForward User(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = (User)form;
		user.setUsername(username);
		user.setPassword(password);
		request.setAttribute("errorlogin", "Tai khoan hoac mat khau khong dung");
		return mapping.findForward("user");
	}
	//
	public ActionForward editUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//
		return mapping.findForward("edituser");
	}
	//
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//
		return mapping.findForward("deleteuser");
	}
}
