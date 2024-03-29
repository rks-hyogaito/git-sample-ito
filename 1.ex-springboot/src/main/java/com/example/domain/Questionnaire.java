package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Questionnaire {
	private String name;
	private String email;
	private String gender;
	private List<String> hobbyList = new ArrayList<>();
	private String program;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<String> hobbylist) {
		this.hobbyList = hobbylist;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Questionnaire [name=" + name + ", email=" + email + ", gender=" + gender + ", hobbylist=" + hobbyList
				+ ", program=" + program + ", comment=" + comment + "]";
	}

}
