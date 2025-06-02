package com.sivasankar.java.mvnmultimodule.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public static String formatDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
}