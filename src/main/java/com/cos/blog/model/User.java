package com.cos.blog.model;

import java.sql.Timestamp;

public class User {

	private int id; // 시퀀스, auto_increment
	
	private String username; // 아이디
	
	private String password;
	
	private String email;
	
	private Timestamp creatDate;
}
