package oopIntroHomework;

public class Course {
	
	public Course(int id, String name, String summaryInformation, String instructor, double completionRate) {
		this.id = id;
		this.name = name;
		this.summaryInformation = summaryInformation;
		this.instructor = instructor;
		this.completionRate = completionRate;
	}
	
	int id;
	String name;
	String summaryInformation;
	String instructor;
	double completionRate;

}
