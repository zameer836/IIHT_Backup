package examDatabase;

import java.util.Scanner;

public class NeetDetails {
	
	public Integer courseid ;        

	public String coursename;         

	public String courseteacher; 
	
	public Integer duration ;        

	public Integer fees;

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCourseteacher() {
		return courseteacher;
	}

	public void setCourseteacher(String courseteacher) {
		this.courseteacher = courseteacher;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}    
	
	
	public Neetdetails() {

		Scanner n = new Scanner(System.in);

		System.out.print("Course id: ");

		this.setCourseid(n.nextInt());
	

		 

		System.out.print("Course name: ");

		this.setCoursename(n.next());

		 

		System.out.print("teacher: ");

		this.setCourseteacher(n.next());
		
		System.out.println("course duration: ");
		this.setDuration(n.nextInt());
		
		System.out.println("course fees:");
		this.setFees(n.nextInt());
		

		}//End of constructor

	

	
	


}
