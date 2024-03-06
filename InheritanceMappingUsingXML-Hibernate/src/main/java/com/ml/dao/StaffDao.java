package com.ml.dao;

import java.util.List;

import com.ml.entity.Staff;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;

public interface StaffDao {
	public void saveStaff(Staff staff);

	public Staff getStaffByStaffId(String sid);

	public List<Staff> getStaffByName(String name);

	public List<Staff> getStaffByDepartment(String department);

	public String getManagerName(Staff staff);

	public List<Staff> getStaffByPosition(String position);

	public List<String> getAllTeamMembers(Staff staff);

	public List<Staff> getStaffByFatherName(String fatherName);

	public List<Staff> getStaffByMotherName(String motherName);

	public List<Staff> getStaffByDateOfBirth(String dob);

	public List<Staff> getStaffByAge(String age);

	public List<Staff> getStaffByGender(Gender gender);

	public List<Staff> getStaffByEthnicity(Ethnicity ethnicity);

	public List<Staff> getStaffByGender(String gender);

	public List<Staff> getStaffByEthnicity(String ethnicity);

	public List<Staff> getAllStaff();
}
