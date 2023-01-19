
public class Time {
	private int sec;
	private int min;
	private int hour;

	public Time() {
		sec = min = hour = 0;
	}

	public Time(int sec, int min, int hour) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, min, sec);
	}

	public void setTime(int sec, int min, int hour) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}

	public Time nextSec() {
		++sec;
		if (sec >= 60) {
			sec = 0;
			++min;
			if (min >= 60) {
				min = 0;
				++hour;
				if (hour >= 24) {
					hour = 0;
				} // end if hour
			} // end if min
		} // end if sec
		return this;
	}
} 
