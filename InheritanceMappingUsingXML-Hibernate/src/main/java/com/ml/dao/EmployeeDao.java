package com.ml.dao;

import java.util.List;

import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Employee;

public interface EmployeeDao {
	public void saveEmployee(Employee employee);

	public Employee getEmployeeByEmployeeId(String eid);

	public Employee getEmployeeByName(String name);

	public List<Employee> getEmployeeListByFatherName(String fatherName);

	public List<Employee> getEmployeeListByMotherName(String motherName);

	public List<Employee> getEmployeeListByDateOfBirth(String dob);

	public List<Employee> getEmployeeListByAge(String age);

	public List<Employee> getEmployeeListByGender(Gender gender);

	public List<Employee> getEmployeeListByEthnicity(Ethnicity ethnicity);

	public List<Employee> getEmployeeListByGender(String gender);

	public List<Employee> getEmployeeListByEthnicity(String ethnicity);

	public List<Employee> getAllEmployees();
}
