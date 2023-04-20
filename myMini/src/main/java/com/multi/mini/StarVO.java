package com.multi.mini;

public class StarVO {
	// MemberVo 가방에 넣은 데이터는 Member 테이블에 들어갈 예정
	// 각 칼럼과 일치시켜 줌.

	private String hosiptal_name;
	private String id;
	private String date;
	private String content;
	private float kind;
	private float explain;
	private float treat;
	private float facilities;
	private float price;
	private int star_no;
	public String getHosiptal_name() {
		return hosiptal_name;
	}
	public void setHosiptal_name(String hosiptal_name) {
		this.hosiptal_name = hosiptal_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getKind() {
		return kind;
	}
	public void setKind(float kind) {
		this.kind = kind;
	}
	public float getExplain() {
		return explain;
	}
	public void setExplain(float explain) {
		this.explain = explain;
	}
	public float getTreat() {
		return treat;
	}
	public void setTreat(float treat) {
		this.treat = treat;
	}
	public float getFacilities() {
		return facilities;
	}
	public void setFacilities(float facilities) {
		this.facilities = facilities;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStar_no() {
		return star_no;
	}
	public void setStar_no(int star_no) {
		this.star_no = star_no;
	}
	@Override
	public String toString() {
		return "StarVO [hosiptal_name=" + hosiptal_name + ", id=" + id + ", date=" + date + ", content=" + content
				+ ", kind=" + kind + ", explain=" + explain + ", treat=" + treat + ", facilities=" + facilities
				+ ", price=" + price + ", star_no=" + star_no + "]";
	}
	
	
}
