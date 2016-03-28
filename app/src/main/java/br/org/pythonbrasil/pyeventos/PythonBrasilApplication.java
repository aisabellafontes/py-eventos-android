package br.org.pythonbrasil.pyeventos;

import android.app.Application;
import android.preference.PreferenceManager;
import br.org.pythonbrasil.pyeventos.alarms.FosdemAlarmManager;
import br.org.pythonbrasil.pyeventos.db.DatabaseManager;

public class PythonBrasilApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		DatabaseManager.init(this);
		// Initialize settings
		PreferenceManager.setDefaultValues(this, R.xml.settings, false);
		// Alarms (requires settings)
		FosdemAlarmManager.init(this);
	}
}
