class Pen{
	String colour;
	int height;

	public void printColor(){
	
		System.out.println(this.colour);
	}
}
class Student{
	String name;
	int age;
   
   public void printStudentInfo(){
   	System.out.println(this.name);
   	System.out.println(this.age);
   }

   public Student(){
   	System.out.println("constructor");
   }
   public Student(Student s2){
   		this.name=s2.name;
   		this.age=s2.age;
   }

}

class Oops{

public static void main(String [] args){
	/*Pen pen1 =new Pen();
	Pen pen2 =new Pen();

	pen1.colour="red";
	pen2.height=5;

	pen2.colour="black";
	pen2.height=6;

		pen1.printColor();
		pen2.printColor();*/


		/*Student s1=new Student();
		s1.name="jithu";
		s1.age=21;

		Student s2=new Student(s1);

		s1.printStudentInfo();
		s2.printStudentInfo();*/
		

	}
}



