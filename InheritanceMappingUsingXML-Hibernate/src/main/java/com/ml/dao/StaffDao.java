package com.ml.dao;

import java.util.List;

import com.ml.entity.Staff;
import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;

public interface StaffDao {
	public void saveStaff(Staff staff);

	public Staff getStaffByStaffId(String sid);

	public List<Staff> getStaffListByName(String name);

	public List<Staff> getStaffListByDepartment(String department);

	public String getManagerName(Staff staff);

	public List<Staff> getStaffListByPosition(String position);

	public List<String> getAllTeamMembers(Staff staff);

	public List<Staff> getStaffListByFatherName(String fatherName);

	public List<Staff> getStaffListByMotherName(String motherName);

	public List<Staff> getStaffListByDateOfBirth(String dob);

	public List<Staff> getStaffListByAge(String age);

	public List<Staff> getStaffListByGender(Gender gender);

	public List<Staff> getStaffListByEthnicity(Ethnicity ethnicity);

	public List<Staff> getStaffListByGender(String gender);

	public List<Staff> getStaffListByEthnicity(String ethnicity);

	public List<Staff> getAllStaffs();
}
