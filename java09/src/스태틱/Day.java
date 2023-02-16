package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public Day(String doing, int time, String location) {
		count++;
		sum += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
