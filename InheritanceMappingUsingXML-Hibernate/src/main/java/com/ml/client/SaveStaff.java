package com.ml.client;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.ml.dao.StaffDao;
import com.ml.dao.impl.StaffDaoImpl;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Staff;

public class SaveStaff {

	public static void main(String[] args) {
		StaffDao staffdao = new StaffDaoImpl();
		Staff staff = new Staff();
		staff.setName("Himanshu RAi");
		staff.setFatherName("D. K. Rai");
		staff.setMotherName("Nilam Rai");
		staff.setGender(Gender.MALE);
		staff.setAge("30");
		staff.setEthnicity(Ethnicity.CAUCASIAN);
		staff.setDob("01-July-1994");
		staff.setSalary(56572.369);
		staff.setBonus(12346.689);
		staff.setAnnualLeaves(20);
		staff.setLeaveWithoutPay(30);
		staff.setDepartment("IT/Software");
		staff.setPosition("Java Developer");
		staff.setManager("Manager");
		staff.setTeamMembers(Arrays.asList("Ramesh", "Suresh", "Mahesh"));
		Set<String> set = new HashSet<>();
		set.add("Catalogue");
		set.add("Inventory");
		set.add("Couriers and Deliveries");
		set.add("Control Room");
		staff.setCanAccess(set);
		staffdao.saveStaff(staff);

	}

}
