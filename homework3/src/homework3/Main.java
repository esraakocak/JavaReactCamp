package homework3;

public class Main {

	public static void main(String[] args) {
	
		
		Student student = new Student();
		 student.setId(1);
		 student.setFirstName("esra");
		 student.setLastName("ko�ak");
		 student.setEmail("esra@gmail.com");
		 student.setChosenCourses("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		
		Instructor �nstructor =new Instructor();
		 �nstructor.setId(1);
		 �nstructor.setFirstName("Engin");
		 �nstructor.setLastName("Demiro�");
		 �nstructor.setCoursesTaught("Java & react");
		 
		 StudentManager studentManager =new StudentManager();
		  studentManager.addLesson(student);
		 
		 InstructorManager �nstructorManager =new InstructorManager();
		  �nstructorManager.addCourses(�nstructor); 
		 
	
	
	}

}
