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
	
	/**
	 * 登録処理
	 * @param form
	 */
	public boolean doRegist(UserForm form) {
		System.out.println("UserService.doRegist");
		
		// 重複チェック
		boolean isExists = userRepository.existsById(form.getUserId());
		if(isExists) {
			return false;
		}
		
		User user = new User();
		user.setUserid(form.getUserId());
		user.setDisplaynm(form.getDisplayNm());
		user.setPassword(form.getPassword());

		// 現在日時の取得
		Date date = new Date();
		user.setEntdt(date);
		user.setUpddt(date);
		
		// データベース更新
		userRepository.save(user);
		
		return true;
	}
	
	
	
	
	
//	public boolean doRegist(UserForm form) {
//		
//		
//		// 存在チェック
//		boolean isExists = userRepository.existsById(form.getUserId());
//		if (isExists) {
//			return false;
//		}
//		
//		User user = new User();
//		user.setUserid(form.getUserId());
//		user.setDisplaynm(form.getDisplayNm());
//		user.setPassword(form.getPassword());
//		Date date = new Date();
//		user.setEntdt(date);
//		user.setUpddt(date);
//
//		// データベース更新
//		userRepository.save(user);
//		return true;
//	}
	
}
