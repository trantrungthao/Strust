package com.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.project.model.FormLogin;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FormLogin formlogin = (FormLogin) form;
		if ("ABC".equals(formlogin.getUsername()) && "123".equals(formlogin.getPassword())) {
			return mapping.findForward("success");
		} else {
			request.setAttribute("errorlogin", "Tai khoan hoac mat khau khong dung");
			return mapping.findForward("fail");
		}
	}
}
