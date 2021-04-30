
public class StudentManager extends UserManager{
	public void registeredCourse(Student student) {
		System.out.println(student.getRegisteredCourse() +" kursuna başarıyla kayıt olundu.");
	}
	public void removeCourse(Student student) {
		System.out.println(student.getRegisteredCourse() +" kursundan kaydınızı sildiniz.");
	}

}
