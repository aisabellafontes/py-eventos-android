package br.org.pythonbrasil.pyeventos.loaders;

import android.content.Context;
import android.database.Cursor;
import br.org.pythonbrasil.pyeventos.db.DatabaseManager;
import br.org.pythonbrasil.pyeventos.model.Day;
import br.org.pythonbrasil.pyeventos.model.Track;

public class TrackScheduleLoader extends SimpleCursorLoader {

	private final Day day;
	private final Track track;

	public TrackScheduleLoader(Context context, Day day, Track track) {
		super(context);
		this.day = day;
		this.track = track;
	}

	@Override
	protected Cursor getCursor() {
		return DatabaseManager.getInstance().getEvents(day, track);
	}
}
