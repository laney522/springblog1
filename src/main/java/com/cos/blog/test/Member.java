package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Member {
	private final int id;
	private final String username;
	private final String password;
	private final String email;
}
