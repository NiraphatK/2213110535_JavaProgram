import java.io.*;
import java.util.*;
public class Example1202 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		System.out.print("Input Section: ");
		int section = scan.nextInt();
		Header(section);
		showListStudent(section);
	}
	public static void showListStudent(int sec) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while ((temp = read.readLine())!= null) {
			String[] data = temp.split("\t");
			double midScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String gradeResult = findResult(midScore,finalScore);
			if(Integer.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+midScore+"\t"+finalScore+"\t"+gradeResult);
			}
		}
	}
	public static void Header(int sec) {
		System.out.println("**********************************************************");
		System.out.println("\t\tList of Data for Section "+sec);
		System.out.println("**********************************************************");
	}
	public static String findResult(double mid,double fin) {
		double totolscore = mid+fin;
		return (totolscore<=40)?"Fail":"Pass";
		
	}
}
