package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	// User 클래스가 스프링부트가 실행될때 User클래스를 읽어서 자동으로 MySQL에 테이블이 생성된다.
public class User {
	
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	private String username; // 아이디
	
	private String password;
	
	private String email;
	
	private Timestamp creatDate;
}
