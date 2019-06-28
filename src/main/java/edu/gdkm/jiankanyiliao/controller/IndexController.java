package edu.gdkm.jiankanyiliao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import edu.gdkm.jiankanyiliao.service.TestService;

@Controller
@RequestMapping("/jiankanyiliao")
public class IndexController {
	
	@Autowired
	private TestService ts;
	//跳转至首页
	@RequestMapping("/index")
	public String toIndex() {
//		demoService.say();
		ts.print();
		return "index";
	}
	
	//跳转至挂号页面
	@RequestMapping(value="/selectdepartments",method=RequestMethod.GET)
	public String toselectdepartments() {
		return "selectdepartments";
	}
	//获取科室id，存在的session
	@RequestMapping(value="/selectdepartments/getDepartmentId",method=RequestMethod.GET)
	public String  getDepartmentId(@RequestParam(value="id")int id,WebRequest request) {

		request.setAttribute("hid", id, request.SCOPE_SESSION);
		System.out.println(id);
		return "redirect:/jiankanyiliao/selectdepartments/makeanappointment";
	}
	//跳转到预约界面
	@RequestMapping(value="/selectdepartments/makeanappointment",method=RequestMethod.GET)
	public String toMakeAnAppointment() {
		return "makeanappointment";
	}
	//获取路径中的hsId和dId参数值，并存到session中
	@RequestMapping(value="/selectdepartments/makeanappointment/getHsIdAndDId",method=RequestMethod.GET)
	public String getHsIdAndDId(@RequestParam(value="dsId")int dsId,@RequestParam(value="dId")int dId,WebRequest request) {
		request.setAttribute("dsId", dsId, request.SCOPE_SESSION);
		request.setAttribute("dId", dId, request.SCOPE_SESSION);
		return "redirect:/jiankanyiliao/selectdepartments/makeanappointment/haveAnAppointmentWithADoctor";
	}
	//跳转至haveAnAppointmentWithADoctor页面
	@RequestMapping(value="/selectdepartments/makeanappointment/haveAnAppointmentWithADoctor",method=RequestMethod.GET)
	public String toHaveAnAppointmentWithADoctor() {
		return "haveAnAppointmentWithADoctor";
	}
}
