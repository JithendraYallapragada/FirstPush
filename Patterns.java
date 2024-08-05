import java.util.*;
class Patterns{
	public static void main(String[] args){
			Scanner s=new Scanner(System.in);
			
			
			try{
				int age=15/0;
			if (age>10.0){
				throw new ArithmeticException();
			}
		}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

	
}

}
class Exce extends ArithmeticException{
	public Exce(String s){
		super(s);
	}
			}