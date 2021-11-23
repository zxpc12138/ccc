package com.springmvc.servlet;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

@Component("text333ttt")
public class Test implements View{

	public String getContentType() {
		return "text/html";
	}
	
	public void render(Map<String, ?> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().print("3333");
	}
}
