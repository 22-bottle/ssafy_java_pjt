package com.ssafy.festival;

public class Festival {
	private int num;
	private String location;
	private String name;
	private String date;
	private String place;
	
	public Festival(int num, String location, String name, String date, String place) {
		super();
		this.num = num;
		this.location = location;
		this.name = name;
		this.date = date;
		this.place = place;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public String toString() {
		return "Festival [num=" + num + ", location=" + location + ", name=" + name + ", date=" + date + ", place="
				+ place + "]";
	}
	
}
