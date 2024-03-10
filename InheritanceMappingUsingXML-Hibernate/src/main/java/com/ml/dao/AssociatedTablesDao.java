package com.ml.dao;

import java.util.List;

import com.ml.dto.ClassroomData;
import com.ml.dto.FacilityData;
import com.ml.dto.SubjectData;
import com.ml.dto.TeamMemberData;
import com.ml.entity.Subject;

public interface AssociatedTablesDao {

	public List<ClassroomData> listClassRooms();

	public List<SubjectData> listSubjects();

	public List<TeamMemberData> listTeamMembers();

	public List<FacilityData> listFacilities();

	// Alternative approach
	public List<List<String>> listClassroomsWithoutDTO();

	public List<List<Subject>> listSubjectsWithoutDTO();

	public List<List<String>> listTeamMembersWithoutDTO();

	public List<List<String>> listFacilitiesWithoutDTO();

}
