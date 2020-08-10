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
	
	@RequestMapping(path="/user/regist")
	public String index() {
		return "user";
	}
	
    @RequestMapping(path="/user/doRegist")
	public String doRegist(UserForm form) {
		System.out.println("doRegist");
		System.out.println(form.getDisplayNm());
		
		boolean isResult = userService.doRegist(form);
		
		if (isResult) {
			// 登録が成功した場合
			return "redirect:/";
		} else {
			// 登録が失敗した場合
			return "user";
		}
		
	}
	
}
