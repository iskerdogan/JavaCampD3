
public class Student extends User{
	private String registeredCourse;

	public Student(int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
	}

	public String getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
}
