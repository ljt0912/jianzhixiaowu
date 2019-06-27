package edu.gdkm.jiankanyiliao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.gdkm.jiankanyiliao.repository.BookingRegisterRepository;
import edu.gdkm.jiankanyiliao.repository.DoctorRepository;
import edu.gdkm.jiankanyiliao.repository.DutyRepostiory;
import edu.gdkm.jiankanyiliao.repository.SchedulingRepository;
import edu.gdkm.jiankanyiliao.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private SchedulingRepository sr;
	@Autowired
	private DoctorRepository dr;
	@Autowired
	private BookingRegisterRepository brr;
	@Autowired
	private DutyRepostiory dur;
	@Override
	public void print() {
		// TODO Auto-generated method stub
//		System.out.println(sr.findSchedulings(1));
//		System.out.println(dr.findDoctorByHId(1));
//		System.out.println(brr.findDepatmentsSchedulings(1));
		System.out.println(dur.findDutyByIdWithDId(3, 1));
//		List<Integer> ids = new ArrayList();
//		ids.add(1);
//		ids.add(9);
//		System.out.println(dur.findDutyByIds(ids));
	}

}
