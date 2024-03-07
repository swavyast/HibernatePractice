package com.ml.client.read;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.impl.AssociatedTablesDaoImpl;
import com.ml.dto.ClassroomData;

public class FetchClassRooms {

	private static final Logger LOG = LoggerFactory.getLogger(FetchClassRooms.class);

	public static void main(String[] args) {

		List<ClassroomData> list = new AssociatedTablesDaoImpl().listClassRooms();
		list.forEach(l -> LOG.info(l.toString()));
		//Alternative approach
		LOG.info("Without using DTO...");
		List<List<String>> l = new AssociatedTablesDaoImpl().listClassroomsWithoutDTO();
		l.forEach(li->LOG.info(li.stream().skip(1).collect(Collectors.joining(", "))));
	}

}
