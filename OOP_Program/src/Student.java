
public class Student {
	private String name;
	private String address;

	private String[] courses;
	private int[] grades; // [0,100]
	private int numCourses;
	private static final int MAX_COURSE = 30;

	public Student(String name, String addess) {
		this.name = name;
		this.address = addess;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return name + "(" + address + ")";
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourses; i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}

	public double getAverageGrade() {
		double sum = 0;
		for (int i =0;i<numCourses;i++) {
			sum+=grades[i];
		}
		return sum/numCourses;
	}
}
