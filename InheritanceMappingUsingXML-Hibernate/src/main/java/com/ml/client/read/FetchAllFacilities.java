package com.ml.client.read;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ml.dao.impl.AssociatedTablesDaoImpl;
import com.ml.dto.FacilityData;

public class FetchAllFacilities {

	private static final Logger LOG = LoggerFactory.getLogger(FetchAllFacilities.class);

	public static void main(String[] args) {
		List<List<String>> list = new AssociatedTablesDaoImpl().listFacilitiesWithoutDTO();
		list.forEach(i -> LOG.info(i.toString()));

		List<FacilityData> li = new AssociatedTablesDaoImpl().listFacilities();
		li.forEach(i -> LOG.info(i.toString()));
	}

}
