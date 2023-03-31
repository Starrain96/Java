package com.multi.mvc01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AirportController {
	
	@Autowired
	AirportDAO dao;
	
	@RequestMapping("insert4.multi")
	public void insert(AirportVO bag) {
		dao.insert(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("delete4.multi")
	public void delete(String code) {
		dao.delete(code);
		System.out.println(dao);
	}
	
	@RequestMapping("update4.multi")
	public void update(AirportVO bag) {
		dao.update(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("update41.multi")
	public void update2(AirportVO bag) {
		dao.update(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("one4.multi")
	public void one(String code,Model model) {
		AirportVO bag = dao.one(code);
		
		model.addAttribute("bag", bag);
		
	}
	
	@RequestMapping("list4.multi")
	public void list(Model model) {
		ArrayList<AirportVO> list = dao.list();
		
		model.addAttribute("list", list);
		
	}
	
	@RequestMapping("back.multi")
	private String redirectUrl(HttpServletRequest request) {
		  if (request.getHeader("Referer") != null) {
		    return "redirect:" + request.getHeader("Referer");
		  } else {
		    return "redirect:/main";
		  }
		}

}
