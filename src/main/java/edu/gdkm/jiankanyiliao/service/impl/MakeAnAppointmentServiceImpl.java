package edu.gdkm.jiankanyiliao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.gdkm.jiankanyiliao.po.HospitalSpecialist;
import edu.gdkm.jiankanyiliao.repository.HospitalSpecialistRepository;
import edu.gdkm.jiankanyiliao.service.MakeAnAppointmentService;

@Service
public class MakeAnAppointmentServiceImpl implements  MakeAnAppointmentService{
	@Autowired 
	private HospitalSpecialistRepository hsr;

	public List<HospitalSpecialist> getHospitalSpecialist() {
		// TODO Auto-generated method stub
		return hsr.findAllHospitalSpecialist();
	}
	
	
}
