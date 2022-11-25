package examDatabase;

import Arraylist.Student;

public class NeetArrays {

	public static void main(String[] args) {

		   //Create Array to store Students

		                   NeetArrays[] Neetdetails = new NeetArray[15];



		   //Add Students to Array

	for (int i=0; i<3; i++) {

		NeetArrays s = new NeetArrays();

		Neetdetails[i] = s;

		   }//End of for loop



		   //Display Students from Array

		                   for(int i=0; i<3; i++) {

		NeetArray s = Neetdetails[i];

		System.out.println(s.getCourseid()+", "+s.getAge()+", "+s.getSex());

		}

		}

		}

}
