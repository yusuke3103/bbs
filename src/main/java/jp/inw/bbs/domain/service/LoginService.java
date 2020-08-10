package jp.inw.bbs.domain.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.inw.bbs.domain.entity.User;
import jp.inw.bbs.domain.repository.UserRepository;
import jp.inw.bbs.web.form.LoginForm;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepository;
	
	public boolean doLogin(LoginForm form, HttpSession session) {
		System.out.println("LoginService.doLogin");
		System.out.println(form.getUserId());
		
		// ユーザIDを元にユーザを取得する。
		User user = userRepository.getOne(form.getUserId());
		
		if (user.getPassword().equals(form.getPassword())) {
			session.setAttribute("userid", form.getUserId());
			return true;
		}else {
			return false;
		}
	}
}
