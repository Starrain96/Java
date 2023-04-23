package com.multi.weka03.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //BbsController bbsController = new BbsController();
public class BbsController {

	@RequestMapping("insert")
	public void send() {
		System.out.println("welcome!!");
	}

}
