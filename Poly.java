class Student{
String name;
int age;										//compile time poly and
											 // method overloading
boolean isPassed;
	public void printInfo(String name){
		System.out.println("name:::"+name);
	}
	public void printInfo(){
		System.out.println("name:::"+this.name);
	}
	public void printInfo(int age){
		System.out.println( "age:::"+age);
	}
	public void printInfo(String name, int age, boolean isPassed){
		System.out.println(name+age+isPassed);
	}

}
class Poly{
	public static void main(String[] args){
		Student s1=new Student();
		s1.name="jithu";
		s1.age=21;
		s1.isPassed=true;

		s1.printInfo();
		s1.printInfo(s1.name);	
	}
}