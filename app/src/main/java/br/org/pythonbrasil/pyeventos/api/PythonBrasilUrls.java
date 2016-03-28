package br.org.pythonbrasil.pyeventos.api;

import java.util.Locale;

/**
 * This class contains all PythonBrasil Urls
 *
 * @author Rodolpho Eckhardt
 * @author Christophe Beyls
 * 
 */
public class PythonBrasilUrls {

	private static final String SCHEDULE_URL = "https://arquivos.lpho.de/pybr.xml";
	private static final String EVENT_URL_FORMAT = "https://%1$d.pythonbrasil.org.br/agenda/palestra/%2$s/";
	private static final String PERSON_URL_FORMAT = "https://%1$d.pythonbrasil.org.br/agenda/palestrante/%2$s/";

	public static String getSchedule() {
		return SCHEDULE_URL;
	}

	public static String getEvent(String slug, int year) {
		return String.format(Locale.US, EVENT_URL_FORMAT, year, slug);
	}

	public static String getPerson(String slug, int year) {
		return String.format(Locale.US, PERSON_URL_FORMAT, year, slug);
	}
}
