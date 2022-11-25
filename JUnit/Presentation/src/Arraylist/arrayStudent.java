package Arraylist;

public class arrayStudent {


        //main method

        public static void main(String[] args) {

   //Create Array to store Students

                   Student[] studentArray = new Student[3];



   //Add Students to Array

                   for (int i=0; i<3; i++) {

Student s = new Student();

studentArray[i] = s;

   }//End of for loop



   //Display Students from Array

                   for(int i=0; i<3; i++) {

Student s = studentArray[i];

System.out.println(s.getName()+", "+s.getAge()+", "+s.getSex());

}

}

}

