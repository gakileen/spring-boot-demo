package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoApplication {

	@RequestMapping("/hello")
	@ResponseBody
	String index() {
		return "Hello world";
	}

	@GetMapping("/html")
	@ResponseBody
	String html() {
		return "<html><head><title>Hello World!</title></head><body><h1>Hello World!</h1><p>This is my first web site</p></body></html>";
	}

	@GetMapping("/blogs")
	String blog() {
		return "blog";
	}

	@GetMapping("/users/{username}/blogs/{blogId}")
	@ResponseBody
	String getUserBlog(@PathVariable String username, @PathVariable int blogId) {
		return String.format("user %s, blog %d", username, blogId);
	}

}
