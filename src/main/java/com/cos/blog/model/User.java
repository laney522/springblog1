package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

// ORM -> Java(다른언어) Object -> 테이블로 맵핑해주는 기술
@Entity	// User 클래스가 스프링부트가 실행될때 User클래스를 읽어서 자동으로 MySQL에 테이블이 생성된다.
public class User {  
	
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 30)   
	private String username; // 아이디   
	
	@Column(nullable = false, length = 100) //123456 => 해쉬 (비밀번호 암호화)
	private String password;   
	
	@Column(nullable = false, length = 50)   
	private String email;
	  
	@ColumnDefault("'user'") // 시간이 자동 입력 
	private String role; // Enum을 쓰는게 좋다. // 도메인설정. 어떤 범위 안의 값만 받는다. ex) admin, user, manager
	
	@CreationTimestamp // 시간이 자동 입력
	private Timestamp creatDate;
}
