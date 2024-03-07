package com.ml.client.read;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.StaffDao;
import com.ml.dao.impl.StaffDaoImpl;
import com.ml.entity.Staff;

public class FetchStaffList {

	private static final Logger LOG = LoggerFactory.getLogger(FetchStaffList.class);
	
	public static void main(String[] args) {

		StaffDao dao = new StaffDaoImpl();
		List<Staff> list = dao.getAllStaffs();
		list.stream().forEach(p -> LOG.info(p.toString()));
	}

}
