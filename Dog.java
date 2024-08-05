public class Dog{
	String name;
	int age;
	double height;

	public Dog(String name, int age){
		this.name=name;
		this.age =age;
	} 
  public  void bark(){
 	System.out.println(this.name+"Barks!!");
 	 }

 	 public int getAged(){
 	 	return this.age + 2;
 	 }
	
}