package homework3;

public class Student extends User{
      
     String chosenCourses;  // se�ti�i dersler

     
    public Student() {
    	
    }
	public Student(String chosenCourses) {
		super();
		this.chosenCourses = chosenCourses;
	}
	public String getChosenCourses() {
		return chosenCourses;
	}
	public void setChosenCourses(String chosenCourses) {
		this.chosenCourses = chosenCourses;
	}
        
        
}
