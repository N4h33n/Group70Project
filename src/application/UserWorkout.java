package application;

import java.util.ArrayList;

public class UserWorkout extends User {

	public UserWorkout(String memberFirst, String memberLast, String memberAge, String memberGender, String height,
			String memberCurrentWeight, String memberPassword) {
		super(memberFirst, memberLast, memberAge, memberGender, height, memberCurrentWeight, memberPassword);
		
	}
	
	
	
	private ArrayList<Day> days;
	
	ArrayList<Day> getDay() {
		return days;
		
	
	}
	void setDays(ArrayList<Day> days) {
		this.days = days;
	}
	
	
	
	
	

}
