package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
	

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity	
public class Board {   
		
		@Id   
		@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
		private int id;
		
		@Column(nullable = false, length = 100)
		private String title;
		
		@Lob // 대용량 데이터
		private String content; // 섬머노트 라이브러리 <html>태그가 섞여서 디자인이 됨.
		
		@ColumnDefault("0")
		private int count; // 조회수
		
		@ManyToOne // Many = Board, User = One 한명의 유저는 여러개의 게시글을 쓸 수 있다.
		@JoinColumn(name="userId") 
		private User user;// DB는 오브젝트를 저장할 수 없다. ORM 을 사용하기 때문에
		
		@CreationTimestamp
		private Timestamp createDate; 
	}	
	

