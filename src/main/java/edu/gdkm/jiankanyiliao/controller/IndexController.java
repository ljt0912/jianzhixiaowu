package edu.gdkm.jiankanyiliao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/jiankanyiliao")
public class IndexController {

	@RequestMapping("/index")
	public String toIndex() {
//		demoService.say();
		return "index";
	}
	@RequestMapping(value="/MakeAnAppointment",method=RequestMethod.GET)
	public String toMakeAnAppointment() {
		return "makeanappointment";
	}
}
