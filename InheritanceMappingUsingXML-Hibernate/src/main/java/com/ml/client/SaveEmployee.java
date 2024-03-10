package com.ml.client;

import com.ml.dao.EmployeeDao;
import com.ml.dao.impl.EmployeeDaoImpl;
import com.ml.entity.Employee;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;

public class SaveEmployee {

	public static void main(String[] args) {
		EmployeeDao empdao = new EmployeeDaoImpl();
		Employee emp = new Employee();
		emp.setName("Himanshu RAi");
		emp.setFatherName("D. K. Rai");
		emp.setMotherName("Nilam Rai");
		emp.setGender(Gender.MALE);
		emp.setAge("30");
		emp.setEthnicity(Ethnicity.CAUCASIAN);
		emp.setDob("01-July-1994");
		emp.setSalary(56572.369);
		emp.setBonus(12346.689);
		emp.setAnnualLeaves(20);
		emp.setLeaveWithoutPay(30);
		empdao.saveEmployee(emp);
	}

}
