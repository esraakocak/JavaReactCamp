package homework3;

public class Instructor extends User{
	
       String coursesTaught; 
       
      public  Instructor() {
    	  
      }

	public Instructor(String coursesTaught) {
		super();
		this.coursesTaught = coursesTaught;
	}

	public String getCoursesTaught() {
		return coursesTaught;
	}

	public void setCoursesTaught(String coursesTaught) {
		this.coursesTaught = coursesTaught;
	}
       
  
}

