package jp.inw.bbs.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.inw.bbs.domain.service.EntryService;
import jp.inw.bbs.web.form.EntryForm;

@Controller
public class EntryController {

	@Autowired
	private EntryService entryService;
	
	@RequestMapping(path="/entry")
	public String index(@ModelAttribute EntryForm form) {
		entryService.getAll(form);
		return "entry";
	}
	
	@RequestMapping(path="/entry/doComment")
	public String doComment(@ModelAttribute EntryForm form, HttpSession session) {
		entryService.doComment(form, session);
		
		// indexメソッドを実行する。
		return index(form);
	}
	
}
