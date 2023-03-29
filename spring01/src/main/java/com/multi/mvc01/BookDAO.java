package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {

	public int insert(BookDTO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "insert into multi.book values (null, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("입력 성공!");
			}
			// System.out.println(result);

		} catch (Exception e) {
			// result = 0;
			// System.out.println(result);
			e.printStackTrace();
		}
		return result;

	}

	public int update(BookDTO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "UPDATE multi.book set name = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(2, bag.getId());
			ps.setString(1, bag.getName());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("회원정보 수정 성공!");
			}

		} catch (Exception e) {
			System.out.println("잘못된 아이디입니다.");
			e.printStackTrace();
		}
		return result;
	}

	public int delete(String id) {
		int result = 0;
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "delete from multi.book where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("회원탈퇴 성공!");
			}

		} catch (Exception e) {
			System.out.println("잘못된 아이디입니다.");
			e.printStackTrace();
		}
		return result;
	}
	
	public BookDTO one(int id) {

		ResultSet rs = null; // 항목명이랑 결과를 담고 있는 테이블이다.
		BookDTO bag = new BookDTO();

		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from multi.book where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();

			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				System.out.println("검색결과 있음 성공!");
				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				System.out.println(id2 + "  " + name + "  " + url + "  " + img);

				bag = new BookDTO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);

			}
			System.out.println("검색 결과 없음.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public ArrayList<BookDTO> list() {

		ResultSet rs = null; // 항목명이랑 결과를 담고 있는 테이블이다.
		BookDTO bag = new BookDTO();

		// 가방들 넣어줄 큰 컨테이너 역활을 부품이 필요하다.
		// ArrayList

		ArrayList<BookDTO> list = new ArrayList<>();

		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from multi.book";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();

			System.out.println("4. SQL문 오라클로 보내기 성공.");

			while (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				// System.out.println("검색결과 있음 성공!");
				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				// System.out.println(id2 + " " + pw + " " + name + " " + tel);

				bag = new BookDTO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);

				list.add(bag);
			}
			System.out.println("검색 결과 없음.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}