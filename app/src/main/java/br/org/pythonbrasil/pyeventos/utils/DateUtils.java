package br.org.pythonbrasil.pyeventos.utils;

import android.content.Context;

import java.text.DateFormat;
import java.util.TimeZone;

public class DateUtils {

	private static final TimeZone BRASILIA_TIME_ZONE = TimeZone.getTimeZone("GMT-3");

	public static TimeZone getBrasiliaTimeZone() {
		return BRASILIA_TIME_ZONE;
	}

	public static DateFormat withBrasiliaTimeZone(DateFormat format) {
		format.setTimeZone(BRASILIA_TIME_ZONE);
		return format;
	}

	public static DateFormat getTimeDateFormat(Context context) {
		return withBrasiliaTimeZone(android.text.format.DateFormat.getTimeFormat(context));
	}
}
