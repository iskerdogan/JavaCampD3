
public class StudentManager extends UserManager{
	public void registeredCourse(Student student) {
		System.out.println(student.getRegisteredCourse() +" kursuna ba�ar�yla kay�t olundu.");
	}
	public void removeCourse(Student student) {
		System.out.println(student.getRegisteredCourse() +" kursundan kayd�n�z� sildiniz.");
	}

}
