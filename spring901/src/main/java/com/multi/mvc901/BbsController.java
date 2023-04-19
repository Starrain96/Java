package com.multi.mvc901;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller //스프링에서 제어하는 역활로 등록
public class BbsController {
	
	@Autowired
	BbsDao dao;
	
	
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		System.out.println("insert2 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("delete2 요청됨.");
		System.out.println(dao);
		dao.delete(no);
	}
	
	@RequestMapping("delete2")
	public void delete2(int no) {
		System.out.println("delete2 요청됨.");
		System.out.println(dao);
		dao.delete(no);
	}
	
	
	@RequestMapping("update2")
	public void update2(int no, String content) {
		BbsVO bag = new BbsVO();
		bag.setContent(content);
		bag.setNo(no);
		System.out.println("update2 요청됨.");
		
		System.out.println("no : " + no);
		System.out.println("content : " + content);
		dao.update(bag);
		System.out.println("c");
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		BbsVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
	
}
	