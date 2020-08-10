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
	
	@RequestMapping(path="/login")
	public String index() {
		return "login";
	}

	@RequestMapping(path="/login/doLogin", method=RequestMethod.POST)
	public String doLogin(LoginForm form, HttpSession session) {
			
		boolean isLogin = loginService.doLogin(form,session);
		if (isLogin) {
			return "redirect:/";
		}else {
			return "login";
		}
		
	}
	
}