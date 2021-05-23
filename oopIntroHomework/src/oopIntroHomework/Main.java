package oopIntroHomework;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category(1, "T�m�");
		Category category2 = new Category(2, "Programlama");

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println("Kategoriler : " + category.name);
		}

		System.out.println();

		Course course1 = new Course(1, "Yaz�l�m Yeti�tirici Geli�tirme Kamp�(C# + ANGULAR)", "2 ay...", "Engin Demirog",25);
		Course course2 = new Course(2, "Yaz�l�m Yeti�tirici Geli�tirme Kamp�(JAVA + REACT)", "2 ay...", "Engin Demirog",30);
		Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs", "PYTHON,JAVA,C#...", "Engin Demirog", 80);

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println("Kurs �smi : " + course.name);
			System.out.println("Kurs E�itmeni : " + course.instructor);
		}

		System.out.println();

		CourseManager courseManager = new CourseManager();
		courseManager.joinTheProgram(course1);
		courseManager.joinTheProgram(course2);
		courseManager.joinTheProgram(course3);

		courseManager.lastLesson(course2);
		courseManager.nextLesson(course2);

	}

}
