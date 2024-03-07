package com.ml.utilities;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseUtilities {

	private static final Logger LOG = LoggerFactory.getLogger(DatabaseUtilities.class);

	private DatabaseUtilities() {
		// Private Default Constructor
	}

	public static void getDetailedStackTrace(Exception e) {
		Optional.ofNullable(e).ifPresent(ex -> {
			String msg = ex.getMessage();
			StringBuilder message = new StringBuilder(msg);

			Throwable cause = ex.getCause();
			while (cause != null) {
				message.append(cause.getMessage());
				cause = cause.getCause();
			}

			if (LOG.isErrorEnabled()) {
				LOG.error(message.toString());
			}
		});
	}
}
