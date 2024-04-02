package com.javaex.vo;

public class AttentionVo {

	//필드
	private String name;
	private String save_name;
	private int price;
	private int no;
	private int count;
	private String category;
	
	//생성자
	public AttentionVo() {
		super();
	}

	public AttentionVo(String name, String save_name, int price, int no, int count, String category) {
		super();
		this.name = name;
		this.save_name = save_name;
		this.price = price;
		this.no = no;
		this.count = count;
		this.category = category;
	}

	//메소드-gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSave_name() {
		return save_name;
	}

	public void setSave_name(String save_name) {
		this.save_name = save_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "AttentionVo [name=" + name + ", save_name=" + save_name + ", price=" + price + ", no=" + no + ", count="
				+ count + ", category=" + category + "]";
	}







	
	

	
	
}
