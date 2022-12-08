import java.util.*;
public class Lab505 {
	static String studentId;
	static int subjectId;
	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		studentId = scan.next();
		System.out.print("Enter Subject Id: ");
		subjectId = scan.nextInt();
		isLength(studentId,subjectId);
		while (!isLength(studentId,subjectId)) {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
		}
		if (isLength(studentId,subjectId)==true) {
			boolean chkid = isITStudent(studentId);
			boolean chksub = isITSubject(subjectId);
			displayData(chkid,chksub);
		}
	}
	
		
		
	
	public static boolean isLength(String studentId,int subjectId) {
		String subjectId_string = subjectId+"";
		if (studentId.length() == 10 && subjectId_string.length() == 7 ) {
			return true;
			
		}
		else return false;
	}
	public static boolean isITStudent(String studentId) {
			if (studentId.substring(0,6).equals("211311")) {
				return true;
			}
			else return false;
		
	}
	public static boolean isITSubject(int subjectId) {
		String subjectId_string = subjectId+"";
	
		if (subjectId_string.substring(0,2).equals("21") && subjectId_string.substring(4,5).equals("1")) {
			return true;
		}
		else return false;
	}
	public static void displayData(boolean chkid,boolean chksub) {
				System.out.println("Student id: "+studentId+ ((chkid!=true)?" not ":"")+
						"1st year student in IT\n"+((chksub!=true)?"not ":"")+"Enroll in courses for Year 1");
		
	}
	

}


