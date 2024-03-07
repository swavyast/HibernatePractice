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

	public List<Teacher> getTeacherListByName(String name);

	public List<Teacher> getTeacherListByDepartment(String department);

	public List<Teacher> getTeacherListBySpecialities(Subject specialities);

	public List<Teacher> getTeacherListByClassroom(String classRoom);

	public List<Teacher> getTeacherListByModeOfTeaching(ModeOfTeaching modeOfTeaching);

	public String getManagerName(Teacher teacher);

	public List<Teacher> getTeacherListByPosition(String position);

	public List<String> getAllTeamMembers(Teacher teacher);

	public List<Teacher> getTeacherListByFatherName(String fatherName);

	public List<Teacher> getTeacherListByMotherName(String motherName);

	public List<Teacher> getTeacherListByDateOfBirth(String dob);

	public List<Teacher> getTeacherListByAge(String age);

	public List<Teacher> getTeacherListByGender(Gender gender);

	public List<Teacher> getTeacherListByEthnicity(Ethnicity ethnicity);

	public List<Teacher> getTeacherListByGender(String gender);

	public List<Teacher> getTeacherListByEthnicity(String ethnicity);

	public List<Teacher> getAllTeachers();
}
