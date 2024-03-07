package com.ml.dao;

import java.util.List;

import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.Student;

public interface StudentDao {

	public void saveStudent(Student student);

	public Student getStudentByStudentId(String sid);

	public Student getStudentByName(String name);
	
	public Student getStudentByEmail(String email);
	
	public Student getStudentByEnrollmentId(String enrollmentId);
	
	public List<Student> getStudentsByBatchName(String batch);

	public List<Student> getStudentsByFatherName(String fatherName);

	public List<Student> getStudentsByMotherName(String motherName);

	public List<Student> getStudentsByDateOfBirth(String dob);

	public List<Student> getStudentsByAge(String age);

	public List<Student> getStudentsByGender(Gender gender);

	public List<Student> getStudentsByEthnicity(Ethnicity ethnicity);

	public List<Student> getStudentsByGender(String gender);

	public List<Student> getStudentsByEthnicity(String ethnicity);

	public List<Student> getAllStudents();
}
