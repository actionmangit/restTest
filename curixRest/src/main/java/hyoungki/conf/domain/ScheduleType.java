package hyoungki.conf.domain;

public enum ScheduleType {
	
	DAY(1), WEEK(2), MONTH(3);
	
	private final int value;
	
	ScheduleType(int value) {
		
		this.value	= value;
	}
	
	public int intValue() {
		
		return value;
	}
	
	public static ScheduleType valueOf(int value) {
		
		switch (value) {
			case 1 : return DAY;
			case 2 : return WEEK;
			case 3 : return MONTH;
			default : throw new AssertionError("Unknown value: " + value); 
		}
	}
}
