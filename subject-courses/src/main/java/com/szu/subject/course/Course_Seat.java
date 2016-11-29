package com.szu.subject.course;

public class Course_Seat {
	int course_seat_id;
	int course_no;
	int major_seat_upper;
	int secondary_seat_upper;
	String course_name;
	int major_seat_choice;
	int secondary_seat_choice;
	int isSport;
	public int getCourse_seat_id() {
		return course_seat_id;
	}
	public void setCourse_seat_id(int course_seat_id) {
		this.course_seat_id = course_seat_id;
	}
	public int getCourse_no() {
		return course_no;
	}
	public void setCourse_no(int course_no) {
		this.course_no = course_no;
	}
	public int getMajor_seat_upper() {
		return major_seat_upper;
	}
	public void setMajor_seat_upper(int major_seat_upper) {
		this.major_seat_upper = major_seat_upper;
	}
	public int getSecondary_seat_upper() {
		return secondary_seat_upper;
	}
	public void setSecondary_seat_upper(int secondary_seat_upper) {
		this.secondary_seat_upper = secondary_seat_upper;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getMajor_seat_choice() {
		return major_seat_choice;
	}
	public void setMajor_seat_choice(int major_seat_choice) {
		this.major_seat_choice = major_seat_choice;
	}
	public int getSecondary_seat_choice() {
		return secondary_seat_choice;
	}
	public void setSecondary_seat_choice(int secondary_seat_choice) {
		this.secondary_seat_choice = secondary_seat_choice;
	}
	public int getIsSport() {
		return isSport;
	}
	public void setIsSport(int isSport) {
		this.isSport = isSport;
	}
}
