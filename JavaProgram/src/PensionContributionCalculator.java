import java.util.*;
import java.text.*;
public class PensionContributionCalculator {
	final static int SALARY_CEILING = 6000;
	final static double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	final static double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	final static double EMPLOYEE_RATE_55_TO_60 = 0.13;
	final static double EMPLOYER_RATE_55_TO_60 = 0.13;
	final static double EMPLOYEE_RATE_60_TO_65 = 0.075;
	final static double EMPLOYER_RATE_60_TO_65 = 0.09;
	final static double EMPLOYEE_RATE_65_ABOVE = 0.05;
	final static double EMPLOYER_RATE_65_ABOVE = 0.075;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###.00");
		double employeeContribution=0, employerContribution=0, totalContribution=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly salary: $");
		int salary = scan.nextInt();
		System.out.print("Enter the age: ");
		int age = scan.nextInt();
		if (salary >6000) {
			salary = 6000;
		}
		if(age <=55 ) {
			employeeContribution = salary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary*EMPLOYER_RATE_55_AND_BELOW;
			totalContribution =employeeContribution+employerContribution;
			
			
		}
		else if (age <= 60) { 
			employeeContribution = salary*EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary*EMPLOYER_RATE_55_TO_60;
			totalContribution =employeeContribution+employerContribution;
		}

			 else if (age <= 65) { 
				 employeeContribution = salary*EMPLOYEE_RATE_60_TO_65;
					employerContribution = salary*EMPLOYER_RATE_60_TO_65;
					totalContribution =employeeContribution+employerContribution;
			 }
			else {
				employeeContribution = salary*EMPLOYEE_RATE_65_ABOVE;
				employerContribution = salary*EMPLOYER_RATE_65_ABOVE;
				totalContribution =employeeContribution+employerContribution;
			}
				
			
		System.out.println("The employee's contribution is: $"+frm.format(employeeContribution)+"\n"
				+ "The employer's contribution is: $"+frm.format(employerContribution)+
				"\nThe total contribution is: $"+frm.format(totalContribution));
		
		
		
		
		
		
		
	
		

	}

}
