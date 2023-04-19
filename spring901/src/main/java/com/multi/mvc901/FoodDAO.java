package com.multi.mvc901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(FoodVO bag) {
		int result = my.insert("food.create", bag);
		return result;
	}

	public int update(FoodVO bag) {
		int result = my.update("food.up", bag);
		return result;
	}

	public int delete(String id) {
		int result = my.delete("food.del", id);
		return result;
	}
	
	public FoodVO one(String id) {
		FoodVO bag = my.selectOne("food.one", id);
		return bag;
	}
	
	public List<FoodVO> list() {
		List<FoodVO> list = my.selectList("food.all");
		return list;
	}
	/*
	 * public BookDTO one(int id) {
	 * 
	 * ResultSet rs = null; // 항목명이랑 결과를 담고 있는 테이블이다. BookDTO bag = new BookDTO();
	 * 
	 * try { // 1. 오라클 11g와 연결할 부품 설정 Class.forName("com.mysql.cj.jdbc.Driver");
	 * System.out.println("1. mySQL과 자바 연결할 부품 설정 성공."); // 2. 오라클 11g에 연결해보자. JAVA
	 * ------ Oracle // String url = "jdbc:mysql://localhost:3306:multi"; String url
	 * = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC"; String user =
	 * "root"; String password = "1234"; Connection con =
	 * DriverManager.getConnection(url, user, password);
	 * System.out.println("2. mySQL 연결 성공.");
	 * 
	 * String sql = "select * from multi.book where id=?"; PreparedStatement ps =
	 * con.prepareStatement(sql); ps.setInt(1, id);
	 * System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
	 * 
	 * rs = ps.executeQuery();
	 * 
	 * System.out.println("4. SQL문 오라클로 보내기 성공.");
	 * 
	 * if (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
	 * System.out.println("검색결과 있음 성공!"); int id2 = rs.getInt(1); String name =
	 * rs.getString(2); String url2 = rs.getString(3); String img = rs.getString(4);
	 * System.out.println(id2 + "  " + name + "  " + url + "  " + img);
	 * 
	 * bag = new BookDTO(); bag.setId(id2); bag.setName(name); bag.setUrl(url2);
	 * bag.setImg(img);
	 * 
	 * } System.out.println("검색 결과 없음.");
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return bag; }
	 * 
	 * public ArrayList<BookDTO> list() {
	 * 
	 * ResultSet rs = null; // 항목명이랑 결과를 담고 있는 테이블이다. BookDTO bag = new BookDTO();
	 * 
	 * // 가방들 넣어줄 큰 컨테이너 역활을 부품이 필요하다. // ArrayList
	 * 
	 * ArrayList<BookDTO> list = new ArrayList<>();
	 * 
	 * try { // 1. 오라클 11g와 연결할 부품 설정 Class.forName("com.mysql.cj.jdbc.Driver");
	 * System.out.println("1. mySQL과 자바 연결할 부품 설정 성공."); // 2. 오라클 11g에 연결해보자. JAVA
	 * ------ Oracle // String url = "jdbc:mysql://localhost:3306:multi"; String url
	 * = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC"; String user =
	 * "root"; String password = "1234"; Connection con =
	 * DriverManager.getConnection(url, user, password);
	 * System.out.println("2. mySQL 연결 성공.");
	 * 
	 * String sql = "select * from multi.book"; PreparedStatement ps =
	 * con.prepareStatement(sql);
	 * 
	 * System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
	 * 
	 * rs = ps.executeQuery();
	 * 
	 * System.out.println("4. SQL문 오라클로 보내기 성공.");
	 * 
	 * while (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false //
	 * System.out.println("검색결과 있음 성공!"); int id2 = rs.getInt(1); String name =
	 * rs.getString(2); String url2 = rs.getString(3); String img = rs.getString(4);
	 * // System.out.println(id2 + " " + pw + " " + name + " " + tel);
	 * 
	 * bag = new BookDTO(); bag.setId(id2); bag.setName(name); bag.setUrl(url2);
	 * bag.setImg(img);
	 * 
	 * list.add(bag); } System.out.println("검색 결과 없음.");
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return list; }
	 */
}