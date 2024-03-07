package com.ml.client.read;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.EmployeeDao;
import com.ml.dao.impl.EmployeeDaoImpl;
import com.ml.entity.Employee;

public class FetchEmployeeList {

	private static final Logger LOG = LoggerFactory.getLogger(FetchEmployeeList.class);

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		List<Employee> list = dao.getAllEmployees();
		list.stream().forEach(p -> LOG.info(p.toString()));
	}
}
