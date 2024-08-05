import java.util.*;
import java.lang.*;

class Cars{
	private int cN;
	private int cQ;
	private String cM;
	private int cOp;

	public Cars(int cN , int cQ,String cM, int cOp){
		this.cN=cN;
		this.cQ=cQ;
		this.cM=cM;
		this.cOp=cOp;
	}
		
		public int getcN(){
			return cN;
		}
		public int getcQ(){
			return cQ;
		}
		public String getcM(){
			return cM;
		}
		public int getcOp(){
			return cOp;
		}

		public void setcN(int cN){
				this.cN=cN;
		}
		public void setcQ(int cQ){
				this.cQ=cQ;
		}
		public void setcM(String cM){
				this.cM=cM;
		}
		public void setcOp(int cOp){
				this.cOp=cOp;
		}

		public String toString(){
			return cN+"\n"+cQ+"\n"+cM+"\n"+cOp;
		}

}

//main class

public class CarSol{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int sets=s.nextInt();
		s.nextLine();
		Cars[] car = new Cars[sets];
		for(int i=0;i<sets;i++){
			int cN =s.nextInt();
			int cQ =s.nextInt();
			s.nextLine();
			String cM =s.nextLine();
			int cOp =s.nextInt();
			car[i] =new Cars(cN,cQ,cM,cOp);
		}
		s.nextLine();
		String modelChecker=s.nextLine();
		s.close();

		Cars minPriceObj = findMinCop(car);
		if (minPriceObj==null){
			System.out.println("no car");
		}else System.out.println(minPriceObj);

		Cars askedModel = checkModel(car, modelChecker);
		if (askedModel==null){
			System.out.println("no car");
		}else
			System.out.println(askedModel);
	}

	public static Cars findMinCop(Cars[] car){
			Cars minPrice = null;
			for(Cars c: car){
				if(minPrice==null||c.getcOp()<minPrice.getcOp()){
					minPrice=c;
				}
			}return minPrice;
	}
	public static Cars checkModel(Cars[] car, String modelChecker){
			Cars modelData= null;
			for(Cars c:car){
				if(c.getcM().equalsIgnoreCase(modelChecker)){
					 modelData =c;
				}
	}return modelData;
}
}