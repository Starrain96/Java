package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3.multi")
	public void insert(BookDTO bag) {
		dao.insert(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(String id) {
		dao.delete(id);
		System.out.println(dao);
	}
	
	@RequestMapping("update3.multi")
	public void update(BookDTO bag) {
		dao.update(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id,Model model) {
		BookDTO dto = dao.one(id);
		
		model.addAttribute("dto", dto);
		
	}
	
	@RequestMapping("list3.multi")
	public void list(Model model) {
		ArrayList<BookDTO> list = dao.list();
		
		model.addAttribute("list", list);
		
	}

}
