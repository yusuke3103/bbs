package jp.inw.bbs.domain.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.inw.bbs.domain.entity.User;
import jp.inw.bbs.domain.repository.UserRepository;
import jp.inw.bbs.web.form.UserForm;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean doRegist(UserForm form) {

		if (form.getPassword().equals(form.getRePassword()) == false) {
			return false;
		}

		User user = new User();
		user.setUserid(form.getUserId());
		user.setPassword(form.getPassword());
		user.setDisplaynm(form.getDisplayNm());
		Date now = new Date();
		user.setEntdt(now);
		user.setUpddt(now);
		if (userRepository.existsById(form.getUserId())) {
			return false;
		}

		userRepository.save(user);
		return true;
	}

}
