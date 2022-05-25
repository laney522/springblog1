package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	// http://localhost:8000/blog/temp/home/
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		// 파일리턴 기본경로: src/main/resources/static
		// 리턴명: / home.html
		// 풀경로: src/main/resources/static/home.html
		return "/home.html";
	}
	
	@GetMapping("/temp/img")
	public String tempImg() {
		return "/bg.png";
	}
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// fullname: /WEB-INF/views/test.jsp
		// springboot ch17 finished updated
		return "test";  
	}
}
