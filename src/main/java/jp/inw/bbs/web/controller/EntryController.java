package jp.inw.bbs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntryController {

	@RequestMapping("/entry")
	public String index() {
		return "entry";
	}
	
}
