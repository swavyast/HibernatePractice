package com.ml.client.read;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.impl.AssociatedTablesDaoImpl;
import com.ml.dto.SubjectData;
import com.ml.entity.Subject;

public class FetchSubjectList {
	private static final Logger LOG = LoggerFactory.getLogger(FetchClassRooms.class);

	public static void main(String[] args) {

		List<SubjectData> list = new AssociatedTablesDaoImpl().listSubjects();
		list.forEach(l -> LOG.info(l.toString()));
		//Alternative approach
		
		List<List<Subject>> subjList = new AssociatedTablesDaoImpl().listSubjectsWithoutDTO();
		subjList.forEach(l->LOG.info(l.toString()));
	}
}
