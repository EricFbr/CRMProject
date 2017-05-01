package com.hw.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.Employee;
import com.hw.entity.ResetPass;
import com.hw.entity.Rights;
import com.hw.service.EmployeeBiz;
import com.hw.service.ReqResetPassBiz;
import com.hw.service.RightBiz;
import com.hw.service.impl.EmployeeBizImpl;

@Controller
public class LoginController {
	@Resource
	private EmployeeBiz ebi;
	@Resource
	private RightBiz rb;
	@Resource
	private ReqResetPassBiz rpb;

	@RequestMapping(value = "login", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public String login(HttpSession session, String username, String pass) {
		Employee user = ebi.login(username, pass);
		int jobInfoId = 0;
		try {
			jobInfoId = user.getJobInfoId();
		} catch (Exception e) {
			return "0";
		}
		// System.out.println(user);

		List<Rights> rights = rb.rightsSelect(jobInfoId);
		if (user != null) {
			session.setAttribute("user", user);
			session.setAttribute("rights", rights);
			return "1";
		} else {
			return "0";
		}

	}

	@RequestMapping(value = "logout", method = { RequestMethod.POST, RequestMethod.GET })
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		session.removeAttribute("rights");
		return "login";

	}

	@RequestMapping(value = "reqResetPass", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public String reqResetPass(ResetPass resetPass) {

		int reqResetPass = rpb.reqResetPass(resetPass);
		if (reqResetPass > 0) {
			return "1";
		}
		return "0";
	}

	@RequestMapping(value = "querRestRequest", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public List<ResetPass> querRestRequest() {

		List<ResetPass> querRestRequest = rpb.querRestRequest();

		return querRestRequest;
	}
}
