package jp.inw.bbs.domain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.inw.bbs.domain.entity.Entry;
import jp.inw.bbs.domain.entity.User;
import jp.inw.bbs.domain.repository.EntryRepository;
import jp.inw.bbs.web.form.EntryForm;
import jp.inw.bbs.web.form.EntryItem;

@Service
public class EntryService {

	@Autowired
	private EntryRepository entryRepository;
	
	public void doComment(EntryForm form, HttpSession session) {
		
		System.out.println("EntryService.doComment");
		
		Entry entry = new Entry();
		entry.setComment(form.getComment());
		
		User user = new User();
		user.setUserid(session.getAttribute("userid").toString());
		entry.setUser(user);
		
		Date date = new Date();
		entry.setEntdt(date);
		entry.setUpddt(date);
		
		entryRepository.save(entry);
		
		
	}
	
	public void getAll(EntryForm form) {
		
		// formに設定するリスト
		List<EntryItem> items = new ArrayList<EntryItem>();
		
		// 全件取得
		List<Entry> entries = entryRepository.findAll();
		
		for (Entry entry : entries) {
			// 取得結果をform用に変換
			EntryItem item = new EntryItem();
			
			// ユーザID
			item.setUserId(entry.getUser().getUserid());
			// 表示名
			item.setDisplayNm(entry.getUser().getDisplaynm());
			// コメント
			item.setComment(entry.getComment());
			// 更新日
			item.setUpdDt(entry.getUpddt());
			// form用に変換したものをリストに格納
			items.add(item);
		}
		
		// 作成したリストをformに設定
		form.setEntries(items);
	}
	
}
