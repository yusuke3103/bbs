package jp.inw.bbs.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.inw.bbs.domain.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer>{

}
