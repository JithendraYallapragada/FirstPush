/*import java.util.Scanner;
import java.util.Random;

public class Day2{
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int x = sc.nextInt();

		if (x>=1&&x<=5){
			System.out.println("child");
		}else if(x>=6&&x<=11){
			System.out.println("kid");
		}else if(x>=12&&x<=17){
			System.out.println("teen");
		}else if(x>=18){
			System.out.println("adult");
		}else{
			System.out.println("invalid");	
		}

		Random r=new Random();
		int random=r.nextInt(1,7);
		System.out.println(random);

	}
}*/
import java.util.Scanner; 
class Myclass{ public static void main(String[] args)
{ 
	Scanner s=new Scanner(System.in); 
	int [] nums = new int [5]; 
	for(int i=0;i li1 && num < li2){ denom++; total+=num; } } if (denom>0){ double Average=(double) total/denom; System.out.print(Average); }else{ System.out.println("0");} s.close(); } }