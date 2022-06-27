package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.e.model.stud;

@RestController
public class controller {
	@RequestMapping(value="/stud",method=RequestMethod.GET)
	public stud  page()
	{
		stud s1=new stud();
	    s1.setId(101);
	    s1.setName("karthika");
		return s1;
		
	}

}
