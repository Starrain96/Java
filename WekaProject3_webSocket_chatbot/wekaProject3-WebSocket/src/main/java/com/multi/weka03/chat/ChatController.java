package com.multi.weka03.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

	@RequestMapping("chat/chat2")
	public void send() {
		System.out.println("welcome!!");
	}

}
