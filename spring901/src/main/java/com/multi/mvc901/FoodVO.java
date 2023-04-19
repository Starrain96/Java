package com.multi.mvc901;

public class FoodVO {
	// MemberVo 가방에 넣은 데이터는 Member 테이블에 들어갈 예정
	// 각 칼럼과 일치시켜 줌.

	private String id;
	private String pw;
	private String name;
	private String favorite;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	@Override
	public String toString() {
		return "FoodVO [id=" + id + ", pw=" + pw + ", name=" + name + ", favorite=" + favorite + "]";
	}
	
	
	//가방에 어떤 값들이 들어있는지 String 으로 다 찍어볼 수 있다.
	
}
