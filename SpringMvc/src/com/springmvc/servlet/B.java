package com.springmvc.servlet;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.entry.Student;

@SessionAttributes(names = {"student1"},types = Student.class)
@Controller
public class B {
	
	@ModelAttribute
	public void bb(Map<String,Object> map) {
		Student student=new Student();
		student.setAddr("2");
		student.setName("1");
      map.put("student", student);
      
      
      Student student2=new Student();
		student2.setAddr("1");
		student2.setName("2");
		map.put("student1", student2);
	}

	@RequestMapping("/aa")
	public void aa(@ModelAttribute(value = "student") Student student) {
		System.out.println(student.toString());
	}
}
