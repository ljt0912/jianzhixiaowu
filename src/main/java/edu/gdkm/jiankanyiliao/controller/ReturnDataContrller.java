package edu.gdkm.jiankanyiliao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;


import edu.gdkm.jiankanyiliao.po.DepartmentsSchedulings;
import edu.gdkm.jiankanyiliao.po.Duty;
import edu.gdkm.jiankanyiliao.po.HospitalSpecialist;
import edu.gdkm.jiankanyiliao.repository.BookingRegisterRepository;
import edu.gdkm.jiankanyiliao.repository.DoctorRepository;
import edu.gdkm.jiankanyiliao.repository.DutyRepostiory;
import edu.gdkm.jiankanyiliao.service.MakeAnAppointmentService;


/*
 * 		数据获取控制类
 * 		
 * 
 * 
 * 
 * */


@RestController
@RequestMapping("/jiankanyiliao")

public class ReturnDataContrller {
	@Autowired
	private BookingRegisterRepository brr;
	@Autowired
	private DutyRepostiory dur;
	@Autowired
	private DoctorRepository dr;
	@Autowired
	private MakeAnAppointmentService maas;
	
	//获取所有专科以及对应的科室，以JSON的形式返给挂号页面
	@RequestMapping(value="/selectdepartments",method=RequestMethod.POST)
	public List<HospitalSpecialist> findHospitalSpecialist() {
		return maas.getHospitalSpecialist();
		
	}
	//查找科室值班情况
	@RequestMapping(value="/selectdepartments/findDepatmentsSchedulings",method=RequestMethod.POST)
	public List<DepartmentsSchedulings> findDepatmentsSchedulings(WebRequest request){
		int id = (Integer) request.getAttribute("hid", request.SCOPE_SESSION);

		return brr.findDepatmentsSchedulings(id);
	}
	//查找科室具体某天的值班情况
	@RequestMapping(value="/selectdepartments/makeanappointment/findDuty",method=RequestMethod.POST)
	public List<Duty> findDuty(WebRequest request){
		int hsId = (Integer)request.getAttribute("hsId", request.SCOPE_SESSION);
		int dId = (Integer)request.getAttribute("dId", request.SCOPE_SESSION) ;
		return dur.findDutyByIdWithDId(hsId, dId);
	}

}
