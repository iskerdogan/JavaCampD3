
public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName()+" kursu sisteme eklendi.");
	}
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName()+" kursu sistemden silindi.");
	}
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName()+" kursu güncellendi.");
	}
}
