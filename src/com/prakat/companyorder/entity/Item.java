package com.prakat.companyorder.entity;

public class Item {
	private String desc;
	private double rate;

	public Item(String desc, double rate) {
		super();
		this.desc = desc;
		this.rate = rate;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
