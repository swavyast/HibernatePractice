package com.ml.client.read;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.impl.StaffDaoImpl;

public class FetchStaffList {

	private static final Logger LOG = LoggerFactory.getLogger(FetchStaffList.class);

	public static void main(String[] args) {

		new StaffDaoImpl().getAllStaffs().stream().forEach(staff -> LOG.info(staff.toString()));
	}

}
