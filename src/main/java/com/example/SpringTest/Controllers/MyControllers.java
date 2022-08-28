package com.example.SpringTest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringTest.Entities.Students;
import com.example.SpringTest.Repo.Repositories;

@Controller
public class MyControllers {
	@Autowired
	Repositories repo;
    @RequestMapping("/")
	public String loadHomePage() {
		return "home.jsp";
	}
    @RequestMapping("/addStudent")
	public String addData(@RequestParam("rollNo")String roll, @RequestParam("name") String name) {
    	Students student=new Students();
		student.setRollNo(roll);
		student.setName(name);
		repo.save(student);
    	return "home.jsp";
	}
}
