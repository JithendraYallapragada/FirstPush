abstract class Human{
	
	abstract public void gender();
	
		public String eats(){
		return "eats food";
		}
		public  void birth(){
			System.out.println("yeah give birth");
		}	
}
	class Man extends Human{
	
		public void gender(){
			System.out.println("i am a man");
		}
		public void birth(){
			System.out.println("no i dont give a birth");
		}
	}


	class Women extends Human{
		public void gender(){
			System.out.println("i am a women");
		}
	}
class  Abstract{
	public static void main(String[] args){
		Man man =new Man();
		man.gender();
		man.birth();
		System.out.println(man.eats());
	
		Women w=new Women();
		w.gender();
		w.birth();
		System.out.println(w.eats());
	}

}