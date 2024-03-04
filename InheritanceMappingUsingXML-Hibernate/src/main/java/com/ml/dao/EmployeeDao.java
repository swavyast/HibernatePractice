package com.ml.dao;

import java.util.List;

import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Employee;

public interface EmployeeDao {
	public void saveEmployee(Employee employee);
	public Employee getEmployeeById(String id);
	public Employee getEmployeeByName(String name);
	public List<Employee> getEmployeeByFatherName(String fatherName);
	public List<Employee> getEmployeeByMoherName(String MotherName);
	public List<Employee> getEmployeeByDateOfBirth(String dob);
	public List<Employee> getEmployeeByAge(String age);
	public List<Employee> getEmployeeByGender(Gender gender);
	public List<Employee> getEmployeeByEthnicity(Ethnicity ethnicity);
	public List<Employee> getEmployeeByGender(String gender);
	public List<Employee> getEmployeeByEthnicity(String ethnicity);
	public List<Employee> getAllEmployee();
}
