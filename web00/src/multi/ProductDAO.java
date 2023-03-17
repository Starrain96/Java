package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {

	public int update(MemberVO bag) {
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

			String sql = "UPDATE member set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(2, bag.getId());
			ps.setString(1, bag.getTel());
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

			String sql = "delete from member where id=?";
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

	public int insert(ProductVO bag) {
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

			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getId());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);

		} catch (Exception e) {
			// result = 0;
			// System.out.println(result);
			e.printStackTrace();
		}
		return result;

	}

	public ProductVO one(String id) {

		ResultSet rs = null; // 항목명이랑 결과를 담고 있는 테이블이다.
		ProductVO bag = new ProductVO();

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

			String sql = "select * from product where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();

			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				System.out.println("검색결과 있음 성공!");
				String id2 = rs.getString("id");
				String name = rs.getString("name");
				String content = rs.getString("content");
				int price = rs.getInt("price");
				String company = rs.getString("company");
				String img = rs.getString("img");

				bag = new ProductVO();
				bag.setId(id);
				bag.setName(name);;
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);

			}
			System.out.println("검색 결과 없음.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	public int login(MemberVO bag) {

		int result = 0; // 항목명이랑 결과를 담고 있는 테이블이다.

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

			String sql = "select * from product where id=? and pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ResultSet rs = ps.executeQuery();

			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				System.out.println("검색결과 있음 성공!");
				result = 1;
			}
			System.out.println("검색 결과 없음.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<ProductVO> list() {

		ResultSet rs = null; // 항목명이랑 결과를 담고 있는 테이블이다.
		ProductVO bag = new ProductVO();

		// 가방들 넣어줄 큰 컨테이너 역활을 부품이 필요하다.
		// ArrayList

		ArrayList<ProductVO> list = new ArrayList<>();

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

			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();

			System.out.println("4. SQL문 오라클로 보내기 성공.");

			while (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				// System.out.println("검색결과 있음 성공!");
				String id2 = rs.getString("id");
				String name = rs.getString("name");
				String content = rs.getString("content");
				int price = rs.getInt("price");
				String company = rs.getString("company");
				String img = rs.getString("img");
				// System.out.println(id2 + " " + pw + " " + name + " " + tel);

				bag = new ProductVO();
				bag.setId(id2);
				bag.setName(name);;
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);
				

				list.add(bag);
			}
			System.out.println("검색 결과 없음.");
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
