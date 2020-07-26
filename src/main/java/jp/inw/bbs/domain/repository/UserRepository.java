package jp.inw.bbs.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.inw.bbs.domain.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	
	
}
