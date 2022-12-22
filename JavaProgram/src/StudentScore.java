import java.util.*;

public class StudentScore {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		System.out.println();
		Student[] std = new Student[size];
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input Student Name : ");
			std[i].setName(scan.next());
			System.out.print("Input Student Score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input Student Score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("----------------------------");
		}

		/*
		 * for (int i=0;i<std.length;i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+ " ("+std[i].getScore()+")"); } }
		 */
		for (Student _std : std) {
			if (_std.isPass()) {
				System.out.println(">> " + _std.getName() + " get grade " + findGrade(_std.getScore()));
			}

		}

	}

	public static String findGrade(int score) {
		return (score >= 80) ? "A"
				: (score >= 75) ? "B+"
						: (score >= 70) ? "B"
								: (score >= 65) ? "C+"
										: (score >= 60) ? "C"
												: (score >= 55) ? "D+" 
														: (score >= 50) ? "D" 
																: (score >= 49) ? "F" : "";

	}

}
