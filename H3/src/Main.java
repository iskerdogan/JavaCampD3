
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1, "Engin", "DEMİROĞ", "abc2@gmail.com","sifre", "Java&React");
		System.out.println(
				instructor.getFirstName()+"\n"+
				instructor.getLastName()+"\n"+
				instructor.getEmail()+"\n"+
				instructor.getPassword()+"\n"+
				instructor.getCourseName()
				
				);
		System.out.println("---------------------------------------------------------------------------------");
		Student student = new Student(1, "Erdoğan", "IŞIK", "abc@gmail.com", "sifre");
		student.setRegisteredCourse("Java&React");
		System.out.println(
				student.getFirstName()+"\n"+
				student.getLastName()+"\n"+
				student.getEmail()+"\n"+
				student.getPassword()+"\n"+
				student.getRegisteredCourse()
				
				);
		
		System.out.println("---------------------------------------------------------------------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.remove(instructor);
		instructorManager.addCourse(instructor);
		instructorManager.removeCourse(instructor);
		System.out.println("---------------------------------------------------------------------------------");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.registeredCourse(student);
		studentManager.removeCourse(student);
		
	
		
		
		
	}

}
