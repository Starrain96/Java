package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


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
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("update2 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
		
	}
	
	@RequestMapping("one2.multi")
	public void one(int no,Model model) {
		BbsVO bag = dao.one(no);
		
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list2.multi")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
	