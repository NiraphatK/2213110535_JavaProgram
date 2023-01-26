
public class TestStudent {

	public static void main(String[] args) {
		Student jp = new Student("Jirapat Anantasiri", "1 Happy Ave");
		System.out.println(jp);

		jp.setAddress("25 Pattanakarn");
		System.out.println(jp);
		System.out.println(jp.getName());
		System.out.println(jp.getAddress());

		jp.addCourseGrade("INT-107", 25);
		jp.addCourseGrade("INT-108", 79);
		jp.addCourseGrade("MSC-202", 69);
		jp.printGrades();

		System.out.printf("The average grade is %.2f%n", jp.getAverageGrade());

	}

}
