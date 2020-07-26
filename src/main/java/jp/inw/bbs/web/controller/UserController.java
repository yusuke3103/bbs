package jp.inw.bbs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.inw.bbs.domain.service.UserService;
import jp.inw.bbs.web.form.UserForm;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/user")
	public String user() {
		return "user";
	}
	
	@RequestMapping(path="/user/regist",method = RequestMethod.POST)
	public String regist(UserForm form) {
		boolean result = userService.doRegist(form);
		if (result) {
			return "redirect:/";
		}
		return "/user";
	}
	
}
