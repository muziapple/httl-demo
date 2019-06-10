package com.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.BookService;

/**
 * call service layer
 * @author Wei
 *
 */
@Controller  
public class BooksController {

	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String books(Map<String, Object> context) throws Exception {
		context.put("books", bookService.findBooks());
		context.put("htmlhack", "\" onclick=\"alert('HACK');");
		context.put("name", "name in controller");
		return "books";
	}
	
	@RequestMapping("/books2")
	public String books2(Map<String, Object> context) throws Exception {
		context.put("books", bookService.findBooks());
		return "books2";
	}
	
	/*
	public void show(HttpServletResponse response) throws Exception{
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("user", new Object());
		parameters.put("books", new Object());
		 
		Engine engine = Engine.getEngine();
		Template template = engine.getTemplate("/books.httl");
		template.render(parameters, response.getOutputStream());
	}
	*/

}
