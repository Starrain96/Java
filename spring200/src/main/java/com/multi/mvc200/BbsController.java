package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //스프링에서 제어하는 역활로 등록
public class BbsController {
	
	@Autowired
	BbsDao dao;
	
	@Autowired
	ReplyDAO dao2;
	
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
	public void one(int no,Model model) {
		BbsVO bag = dao.one(no);
		
		System.out.println(bag);
		
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("one6")
	public void one6(int no,Model model) {
		BbsVO bag = dao.one(no);
		
		System.out.println(bag);
		
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list2.multi")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
	