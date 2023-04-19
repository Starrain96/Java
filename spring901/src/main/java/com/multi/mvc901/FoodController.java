package com.multi.mvc901;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	
	@Autowired
	FoodDAO dao;
	
	@RequestMapping("insert.food")
	public void insert(FoodVO bag) {
		dao.insert(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("delete.food")
	public void delete(String id) {
		dao.delete(id);
		System.out.println(dao);
	}
	
	@RequestMapping("update.food")
	public void update(FoodVO bag) {
		dao.update(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("one.food")
	public void one(String id, Model model) {
		System.out.println("insert 요청됨.");
		FoodVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list.food")
	public void list(Model model) {
		List<FoodVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
