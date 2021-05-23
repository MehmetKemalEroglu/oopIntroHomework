package oopIntroHomework;

public class CourseManager {
	
	public void joinTheProgram(Course course) {
		System.out.println("Programa Dahil Ol : " + course.name);
	}
	
	public void lastLesson(Course course) {
		System.out.println(" < Önceki Ders");
	}
	
	public void nextLesson(Course course) {
		System.out.println(" Bitir ve devam et >");
	}

}
