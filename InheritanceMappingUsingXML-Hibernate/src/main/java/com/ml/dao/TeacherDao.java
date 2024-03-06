package com.ml.dao;

import java.util.List;

import com.ml.entity.Ethnicity;
import com.ml.entity.Gender;
import com.ml.entity.ModeOfTeaching;
import com.ml.entity.Subject;
import com.ml.entity.Teacher;

public interface TeacherDao {

	public void saveTeacher(Teacher teacher);

	public Teacher getTeacherByTeacherId(String tid);

	public List<Teacher> getTeacherByName(String name);

	public List<Teacher> getTeacherByDepartment(String department);

	public List<Teacher> getTeacherBySpecialities(Subject specialities);

	public List<Teacher> getTeacherByClassroom(String classRoom);

	public List<Teacher> getTeacherByModeOfTeaching(ModeOfTeaching modeOfTeaching);

	public String getManagerName(Teacher teacher);

	public List<Teacher> getTeacherByPosition(String position);

	public List<String> getAllTeamMembers(Teacher teacher);

	public List<Teacher> getTeacherByFatherName(String fatherName);

	public List<Teacher> getTeacherByMotherName(String motherName);

	public List<Teacher> getTeacherByDateOfBirth(String dob);

	public List<Teacher> getTeacherByAge(String age);

	public List<Teacher> getTeacherByGender(Gender gender);

	public List<Teacher> getTeacherByEthnicity(Ethnicity ethnicity);

	public List<Teacher> getTeacherByGender(String gender);

	public List<Teacher> getTeacherByEthnicity(String ethnicity);

	public List<Teacher> getAllTeachers();
}
