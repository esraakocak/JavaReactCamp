package homework3;

public class Main {

	public static void main(String[] args) {
	
		
		Student student = new Student();
		 student.setId(1);
		 student.setFirstName("esra");
		 student.setLastName("koçak");
		 student.setEmail("esra@gmail.com");
		 student.setChosenCourses("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		
		Instructor ınstructor =new Instructor();
		 ınstructor.setId(1);
		 ınstructor.setFirstName("Engin");
		 ınstructor.setLastName("Demiroğ");
		 ınstructor.setCoursesTaught("Java & react");
		 
		 StudentManager studentManager =new StudentManager();
		  studentManager.addLesson(student);
		 
		 InstructorManager ınstructorManager =new InstructorManager();
		  ınstructorManager.addCourses(ınstructor); 
		 
	
	
	}

}
