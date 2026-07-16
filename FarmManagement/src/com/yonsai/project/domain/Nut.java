package com.yonsai.project.domain;

// 견과류도 농작물이다!
public class Nut extends Crop{

	// 견과류는 원산지
	String origin;
	public Nut(String name, int stock, String origin) {
		super(name, stock);
		this.origin = origin;
	}
}
