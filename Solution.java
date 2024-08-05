import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        int numberOfFoods = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        List<Food> foods = new ArrayList<>();

        // Input food details
        for (int i = 0; i < numberOfFoods; i++) {
        
            int foodId = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

     
            String foodName = scanner.nextLine();

           
            String foodCategory = scanner.nextLine();

            
            int foodCost = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            foods.add(new Food(foodId, foodName, foodCategory, foodCost));
        }

        // Input category to count
        
        String category = scanner.nextLine();

        // Count foods by category
        int count = countFoodByGivenCategory(foods, category);
        if (count == 0) {
            System.out.println("No Food with given category are found");
        } else {
            System.out.println("Number of foods in category '" + category + "': " + count);
        }

        // Get food with minimum cost
        Food minCostFood = getFoodWithMinCost(foods);
        if (minCostFood != null) {
            System.out.println("Food with minimum cost:");
            System.out.println("Food ID: " + minCostFood.getFoodId());
            System.out.println("Food Name: " + minCostFood.getFoodName());
            System.out.println("Food Category: " + minCostFood.getFoodCategory());
            System.out.println("Food Cost: " + minCostFood.getFoodCost());
        } else {
            System.out.println("No Food is found");
        }

        scanner.close(); // Close scanner
    }

    public static int countFoodByGivenCategory(List<Food> foodList, String category) {
        int count = 0;
        for (Food food : foodList) {
            if (food.getFoodCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    public static Food getFoodWithMinCost(List<Food> foodList) {
        if (foodList == null || foodList.isEmpty()) {
            return null;
        }

        Food minCostFood = foodList.get(0);
        for (Food food : foodList) {
            if (food.getFoodCost() < minCostFood.getFoodCost()) {
                minCostFood = food;
            }
        }
        return minCostFood;
    }
}

class Food {
    private int foodId;
    private String foodName;
    private String foodCategory;
    private int foodCost;

    public Food(int foodId, String foodName, String foodCategory, int foodCost) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.foodCost = foodCost;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public int getFoodCost() {
        return foodCost;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void setFoodCost(int foodCost) {
        this.foodCost = foodCost;
    }
}
