package jp.inw.bbs.domain.service;

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
		
		User user = userRepository.getOne(form.getUserId());
		
		if (user != null && user.getPassword().equals(form.getPassword())){
			session.setAttribute("userid", user.getUserid());
			session.setAttribute("displaynm", user.getDisplaynm());
			return true;
		}else {
			return false;
		}
	}
	
}
