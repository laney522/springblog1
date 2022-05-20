package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(Date)

@RestController
public class HttpControllerTest {
	
	private static final String TAG ="HttpControllerTest: ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = new Member(1, "ssar", "1234", "email");
		System.out.println(TAG+"getter : "+m.getId());
		m.setId(5000);
		System.out.println(TAG+"setter : "+m.getId());
		return "lombok test finish";
	}
	
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get request : "+ m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) { // MessageConverter(스프링부트)
		return "post request : "+ m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put request:"+ m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete request";
	}
}
