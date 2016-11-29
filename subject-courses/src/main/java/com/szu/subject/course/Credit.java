package com.szu.subject.course;

public class Credit {
	int credit_id;
	int student_id;
	int credit_upper_limit;
	int credit_used;
	int credit_free;
	String term;
	public int getCredit_id() {
		return credit_id;
	}
	public void setCredit_id(int credit_id) {
		this.credit_id = credit_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getCredit_upper_limit() {
		return credit_upper_limit;
	}
	public void setCredit_upper_limit(int credit_upper_limit) {
		this.credit_upper_limit = credit_upper_limit;
	}
	public int getCredit_used() {
		return credit_used;
	}
	public void setCredit_used(int credit_used) {
		this.credit_used = credit_used;
	}
	public int getCredit_free() {
		return credit_free;
	}
	public void setCredit_free(int credit_free) {
		this.credit_free = credit_free;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
}
