package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MemberVO bag) {
		
		int result = my.insert("member.create", bag);
		return result;
	}

	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}

	public int delete(String id) {
		int result = my.delete("member.del", id);
		return result;
	}

	/*
	 * public MemberVO one(String id) { return bag; }
	 * 
	 * public int update(MemberVO bag) { return result; }
	 * 
	 * public int delete(String id) { return result; }
	 * 
	 * 
	 * public int login(MemberVO bag) { return result; }
	 * 
	 * public ArrayList<MemberVO> list() { return list; }
	 */
}
