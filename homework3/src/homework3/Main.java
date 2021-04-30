package homework3;

public class Main {

	public static void main(String[] args) {
	
		
		Student student = new Student();
		 student.setId(1);
		 student.setFirstName("esra");
		 student.setLastName("koçak");
		 student.setEmail("esra@gmail.com");
		 student.setChosenCourses("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		
		
		Instructor ýnstructor =new Instructor();
		 ýnstructor.setId(1);
		 ýnstructor.setFirstName("Engin");
		 ýnstructor.setLastName("Demiroð");
		 ýnstructor.setCoursesTaught("Java & react");
		 
		 StudentManager studentManager =new StudentManager();
		  studentManager.addLesson(student);
		 
		 InstructorManager ýnstructorManager =new InstructorManager();
		  ýnstructorManager.addCourses(ýnstructor); 
		 
	
	
	}

}
