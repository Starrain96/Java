package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("movie")
	public void movie(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo", vo);
		
	}
	
	@RequestMapping("fruit")
	public void fruit( Model model) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("사과");
		fruit.add("딸기");
		fruit.add("바나나");
		fruit.add("수박");
		fruit.add("참외");
		model.addAttribute("fruit", fruit);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> tour = new ArrayList<String>();
		tour.add("미국");
		tour.add("캐나다");
		tour.add("스위스");
		tour.add("일본");
		tour.add("우즈벡키스탄");
		tour.add("중국");
		model.addAttribute("tour", tour);
		
	}
}
