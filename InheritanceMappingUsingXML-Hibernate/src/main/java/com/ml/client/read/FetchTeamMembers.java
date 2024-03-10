package com.ml.client.read;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.impl.AssociatedTablesDaoImpl;
import com.ml.dto.TeamMemberData;

public class FetchTeamMembers {

	private static final Logger LOG = LoggerFactory.getLogger(FetchTeamMembers.class);

	public static void main(String[] args) {

		List<List<String>> list = new AssociatedTablesDaoImpl().listTeamMembersWithoutDTO();
		list.forEach(i -> LOG.info(i.toString()));

		List<TeamMemberData> li = new AssociatedTablesDaoImpl().listTeamMembers();
		li.forEach(i -> LOG.info(i.toString()));
	}

}
