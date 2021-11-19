package com.springmvc.servlet;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entry.Student;

@Controller
@SessionAttributes(value = {"student"},types = Student.class)//该注释只能放在类上面，Spring mvc 会将在模型中对应的属性暂存到HttpSession中.
@RequestMapping("/springmvc")
public class UserServlet {

	/**
	 * 新增
	 */
	@RequestMapping(value="/**/*add",params={"name!=1","addr"},method=RequestMethod.POST)
	public String add(String name,String addr) {
		System.out.println(name+"----------------"+addr);
		System.out.println("新增");
		return "add";
	}
	
	/**
	 * 修改
	 * @param id
	 */
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestParam(value="name") String name,@CookieValue(value="sessionId") String aa) {
		System.out.println("修改");
		System.out.println(name);
		System.out.println(aa);
	}
	/**
	 * 删除
	 */
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) {
		System.out.println("删除");
	}
	/**
	 * 查询
	 */
	@RequestMapping(value="/query/{id}",method=RequestMethod.GET)
	public String query(@PathVariable("id") Integer id) {
     System.out.println("查询");
     return "query";
}
	@RequestMapping("/aa")
	public void aa(@RequestParam(value="name1",required = false,defaultValue ="军哥必死") String name1,@RequestHeader(value="Accept-Language",required = false,defaultValue = "101") String addr) {
		System.out.println(name1);
		System.out.println(addr);
	}
	
	@RequestMapping("/bb")
	public void bb(@CookieValue("name") String name, @CookieValue("password") String password,HttpServletResponse response) {
		System.out.println(name);
		System.out.println(password);
		
		 Cookie cook=new Cookie("name","李四");
		 cook.setMaxAge(60*5*2);
		 response.addCookie(cook);
		 
		 Cookie cook1=new Cookie("password","123456");
		 cook1.setMaxAge(60*60*24);
		 response.addCookie(cook1);
	}
	
	@RequestMapping("/cc")
	public void cc(Student stu,String name) {
		System.out.println(stu.toString());
		System.out.println(name);
	}
	
	@RequestMapping("/dd")
	public ModelAndView dd(Student stu) {
		//map.put("name",stu.getName());
		//map.put("addr",stu.getAddr());
		//model.addAttribute("name",stu.getName());
		//model.addAttribute("addr",stu.getAddr());
		//modelmap.addAttribute("name",stu.getName());
		//modelmap.addAttribute("addr", stu.getAddr());
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("name", stu.getName());
		modelandview.addObject("addr", stu.getAddr());
		modelandview.setViewName("dd");
		return modelandview;
		//return "dd";
	}
	
	@RequestMapping("/as")
	public void as(Student stu,Map<String,Object> map,HttpSession session) {
		map.put("userName",stu.getName());
		map.put("userAddr",stu.getAddr());
		//return "dd";
	}
	
	@RequestMapping("/yy")
	public void yy(HttpSession session) {
    System.out.println(session.getAttribute("userName"));
    System.out.println(session.getAttribute("userAddr"));
	}
	
	@ModelAttribute
	public void ab(Integer id,Map<String,Object> map) {
			if(id !=null) {
				Student student=new Student();
				student.setName("王五");
				student.setAddr("北极");
				student.setTel("15263524859");
				map.put("student1",student);
				System.out.println("进来没");
			}
	}
	@RequestMapping("/az")
	public void az(@ModelAttribute(name = "student1") Student student1) {
		System.out.println(student1.toString());
	}
	
	
	@RequestMapping("/pojo")
	public void pojo( Student student) {
		System.out.println(student.toString());
	}
	
	@RequestMapping("/pp")
	public String pp() {
		System.out.println("22222222");
		return "text";
	}
	
	@RequestMapping("/nn")
	public String nn() {
		return "redirect:pp.html";
	}
}
