package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(Date)

@RestController
public class HttpControllerTest {
	
	@GetMapping("/http/get")
	public String getTest(Member m) {
		
		return "get request : "+ m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@PostMapping("/http/post")
	public String postTest() {
		return "post request";
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "put request";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete request";
	}
}
