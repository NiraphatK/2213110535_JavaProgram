
public class Movie {
	private String id;
	private String name;
	private Director director;
	
	public Movie(String id ,String name,Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	public Movie() {
		id = "";
		name = "";
		director =null;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" direct by "+director.toString();
	}
}
