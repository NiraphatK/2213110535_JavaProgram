import java.time.LocalDateTime;
import java.time.Year;

public class FictionBook implements Authors,Books{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
		author_name = "";
		email = "";
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		return (author_name.trim().contains(" "))? true : false;
				
	}
	public String getLastName() {
		String[] data = author_name.split(" ");
		return data[1].toUpperCase();
	}
	@Override
	public String getFirstName() {
		String[] data = author_name.split(" ");
		return data[0].toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		return email.trim().endsWith("@hotmail.com" ) || email.trim().endsWith("@windowslive.com") ? true : false;
	}
	@Override
	public int totalPublicYear() {
		return LocalDateTime.now().getYear() -publicYear;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return title+" write by "+getLastName().indexOf(0)+"."+getFirstName()+" ("+email+")"+"Published for "+totalPublicYear()+" years.";
	}
}
