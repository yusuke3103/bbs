package jp.inw.bbs.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.inw.bbs.domain.service.LoginService;
import jp.inw.bbs.web.form.LoginForm;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("Debug");
		return "session/login";
	}
	
	@RequestMapping(path = "/login/doLogin", method = RequestMethod.POST)
	public String doLogin(LoginForm form, HttpSession session) {
		System.out.println(form.getUserId());
		boolean result = loginService.doLogin(form,session);
		if (result) {
			return "redirect:/";
		}
		
		return "session/login";
	}
	
	
}
