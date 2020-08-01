package jp.inw.bbs.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.inw.bbs.domain.service.UserService;
import jp.inw.bbs.web.form.UserForm;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/user")
	public String user(@ModelAttribute UserForm form) {
		return "user";
	}
	
	@RequestMapping(path="/user/regist",method = RequestMethod.POST)
	public String regist(@Valid@ModelAttribute UserForm form, BindingResult result) {
		
		if (result.hasErrors()) {
			return user(form);
		}
		
		
		boolean res = userService.doRegist(form);
		if (res) {
			return "redirect:/";
		}
		return "user";
	}
	
}
