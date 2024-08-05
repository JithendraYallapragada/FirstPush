/*abstract class Numbers{
	int i;
	abstract void init();
	public void number(int i){
		int j=10;
		this.i=i;
		System.out.println(this.i+ " " + i);
		i=j;
		System.out.println(i+ " " + j);

	}

}

class Num extends Numbers{

	void init(){
		System.out.println("hello");
	}
	 void init1(){
		this.i=100;
		System.out.println("hello init1");
	}
}

class New{
	static void jithendra(){
			System.out.println("Jithendra in main");
			Num num =  new Num();
			num.init1();
			num.number(num.i);
		}

	public static  void main(String [] args){
			New n =new New();
			jithendra();
			/*Num num =  new Num();

			num.init1();
			num.number(num.i);
			
	}
}
interface  Jithendra{
	 int eyes=2;
	public void walk();
}
class Nithu implements Jithendra{
	public void walk(){
		System.out.println("hello"+ eyes);
	}
	}
*/

class New{
	public static void main(String[] args){
		Dattu d= new Dattu();
		Nithu n=new Nithu();
		d.print(n.getnum());
	}
}
 class Nithu{
 	private int num=2;
 	public int getnum(){
 		return num;
 	}
 }
class Dattu extends Nithu{
	public void print(int num){
 		System.out.println("hello"+ num);
}
}