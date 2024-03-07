package com.ml.dao;

import java.util.List;

import com.ml.dto.ClassroomData;
import com.ml.dto.SubjectData;
import com.ml.entity.Subject;

public interface AssociatedTablesDao {
	
	public List<ClassroomData> listClassRooms();
	public List<SubjectData> listSubjects();
	//Alternative approach
	public List<List<String>> listClassroomsWithoutDTO();
	public List<List<Subject>> listSubjectsWithoutDTO();

}
