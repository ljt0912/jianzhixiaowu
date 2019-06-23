package edu.gdkm.jiankanyiliao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.gdkm.jiankanyiliao.po.HospitalSpecialist;
import edu.gdkm.jiankanyiliao.service.MakeAnAppointmentService;

@RestController
@RequestMapping("/jiankanyiliao")
public class ReturnDataContrller {
	
	
	@Autowired
	private MakeAnAppointmentService maas;
	
	
	@RequestMapping(value="/MakeAnAppointment",method=RequestMethod.POST)
	public List<HospitalSpecialist> toMakeAnAppointmentPage() {
		return maas.getHospitalSpecialist();
		
	}

}
