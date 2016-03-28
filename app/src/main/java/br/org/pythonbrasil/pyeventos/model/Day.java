package br.org.pythonbrasil.pyeventos.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.os.Parcel;
import android.os.Parcelable;
import br.org.pythonbrasil.pyeventos.utils.DateUtils;

public class Day implements Parcelable {

	private int index;
	private Date date;

	public Day() {
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		Locale ptBr = new Locale("pt", "BR");
		DateFormat ddFmt = DateUtils.withBrasiliaTimeZone(new SimpleDateFormat("EEEE", ptBr));
		return String.format(Locale.US, "Dia %1$d (%2$s)", index, ddFmt.format(date));
	}

	public String getShortName() {
		Locale ptBr = new Locale("pt", "BR");
		DateFormat ddFmt = DateUtils.withBrasiliaTimeZone(new SimpleDateFormat("EEEE", ptBr));
		return ddFmt.format(date);
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public int hashCode() {
		return index;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Day other = (Day) obj;
		return (index == other.index);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeInt(index);
		out.writeLong((date == null) ? 0L : date.getTime());
	}

	public static final Parcelable.Creator<Day> CREATOR = new Parcelable.Creator<Day>() {
		public Day createFromParcel(Parcel in) {
			return new Day(in);
		}

		public Day[] newArray(int size) {
			return new Day[size];
		}
	};

	private Day(Parcel in) {
		index = in.readInt();
		long time = in.readLong();
		if (time != 0L) {
			date = new Date(time);
		}
	}
}
