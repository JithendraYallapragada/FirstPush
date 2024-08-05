import java.util.*;
import java.lang.*;

class Food{
	private int foodId;
	private int foodCost;
	private String foodCategory;
	private String foodType;

	public Food(int foodId,int foodCost, String foodCategory,String foodType){
		this.foodId=foodId;
		this.foodCost=foodCost;
		this.foodCategory=foodCategory;
		this.foodType=foodType;
	}

	public int getFoodId(){ 
			return foodId;
	}
	public int getFoodCost(){
		return foodCost;
	}
	public String getFoodCategory(){
		return foodCategory;
	}
	public String getFoodType(){
		return foodType;
	}

	public void setFoodId(int foodId){
		this.foodId=foodId;
	}
	public void setFoodCost(int foodCost){
		this.foodCost=foodCost;
	}
	public void setFoodCategory(String foodCategory){
		this.foodCategory=foodCategory;
	}
	public void setFoodType(String foodType){
		this.foodType=foodType;
	}
	@Override
	public String toString(){
		return foodId+" "+foodCost+ " "+foodCategory+" "+foodType;
	}
}

class FoodSum{
	public static int returnTypeCheckerCount(Food[] food, String typeChecker){
		int count=0;
		for(Food f: food){
		if (f.getFoodType().equalsIgnoreCase(typeChecker)){
			count++;
		}
	}return count;
	}
	public static Food returnLowCostObj(Food[] food, String type){
			Food lowCost= null;
			for(Food f:food){
				if(f.getFoodType().equalsIgnoreCase(type)){
					if(lowCost==null||f.getFoodCost()<lowCost.getFoodCost()){
						lowCost=f;
					}
				}
			}return lowCost;

	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int sets=sc.nextInt();
		sc.nextLine();
	Food[] food= new Food[sets];

		for(int i=0; i<sets;i++){
			int id= sc.nextInt();
			int cos=sc.nextInt();
			sc.nextLine();
			String category=sc.nextLine();
			String type=sc.nextLine();

			food[i]= new Food(id,cos,category,type);
		}
			String typeChecker=sc.nextLine();
			int times = returnTypeCheckerCount(food, typeChecker);
			if (times==0){
					System.out.println("no type found");
			}else{
			System.out.println(times);
			}
				sc.close();

				Food data =returnLowCostObj(food, typeChecker);
				if(data==null){
				
					System.out.println("nope data found");
				}else{
					System.out.println(data);
				}

	}
}