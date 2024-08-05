/*class Shape{
	int length;

	public void area(){
		System.out.println("area");
	}
}
class Traingle extends Shape{
	public void insideDerived(int len){
		System.out.println(len);
		System.out.println("Derived class");
	}
}

class Inher{
	public static void main(String[] args){
		Traingle t=new Traingle();
		t.length=10;
		t.area();
		t.insideDerived(t.length);
	}
}*/
/*class Shape{
	int length;

	public void area(){
		System.out.println("area");
	}
}
class Traingle extends Shape{
	protected int l;
	public void insideTraingle(){
		
		System.out.println(this.length);
		l =this.length;
	}

}
class Rectangle extends Traingle{
	public void insideRectangle(){
		System.out.println(l);
	}
}

class Inher{
	public static void main(String[] args){
		Traingle t=new Traingle();
		Rectangle r=new Rectangle();
		r.length=100;
		r.insideTraingle();
		r.insideRectangle();

		
	}
}*/
/*class Shape{
	int length;

	public void area(){
		System.out.println("area");
	}
}
class Traingle extends Shape{
	int l=10;

	public void insideTraingle(){
		
		System.out.println(l);
	}

}
class Rectangle extends Shape{
	public void insideRectangle(int l){
		System.out.println(l);
	}
}

class Inher{
	public static void main(String[] args){
		Traingle t=new Traingle();
		Rectangle r=new Rectangle();
			r.insideRectangle(t.l);

		
	}
}*/