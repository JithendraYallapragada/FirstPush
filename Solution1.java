import java.util.Scanner;

public class Apartement {
    private int buildingId;
    private String buildingName;
    private double totalCostPrice;
    private int noOfUnits;
    private double totalSellingPrice;
    private int noOfFloors;
    private boolean garageIncluded;

    public Apartement(int buildingId, String buildingName, double totalCostPrice, int noOfUnits,
                      double totalSellingPrice, int noOfFloors, boolean garageIncluded) {
        this.buildingId = buildingId;
        this.buildingName = buildingName;
        this.totalCostPrice = totalCostPrice;
        this.noOfUnits = noOfUnits;
        this.totalSellingPrice = totalSellingPrice;
        this.noOfFloors = noOfFloors;
        this.garageIncluded = garageIncluded;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public double getTotalCostPrice() {
        return totalCostPrice;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public double getTotalSellingPrice() {
        return totalSellingPrice;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public boolean isGarageIncluded() {
        return garageIncluded;
    }

    public double calculateProfit() {
        return totalSellingPrice - totalCostPrice;
    }

}

public class Solution1 {

    public static double findBuildingById(Apartement[] buildings, int buildingId) {
       double avg=-1;
       for(Apartement b:buildings){
        if(b.getBuildingId()==buildingId&&b.getNoOfUnits()!=0){
            avg=b.getTotalSellingPrice()/b.getNoOfUnits();
        }
       }return avg;
    }

    public static Apartement findBuildingByMaxProfit(Apartement[] buildings) {
        Apartement maxProfitBuild =null;
        double maxprofit= Double.NEGATIVE_INFINITY;
        for(Apartement a:buildings){
            double profit=a.calculateProfit();
            if(profit>maxprofit){
                maxprofit=profit;
                maxProfitBuild=a;
            }
        }
        if(maxprofit<0){
            return null;
        }
        return maxProfitBuild;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size =4;

        Apartement[] buildings = new Apartement[4];

        for (int i = 0; i < size; i++) {
           
            int buildingId = scanner.nextInt();
            scanner.nextLine();
           
            String buildingName = scanner.nextLine();
         
            double totalCostPrice = scanner.nextDouble();
           
            int noOfUnits = scanner.nextInt();
           
            double totalSellingPrice = scanner.nextDouble();
           
            int noOfFloors = scanner.nextInt();
           
            boolean garageIncluded = scanner.nextBoolean();

            buildings[i] = new Apartement(buildingId, buildingName, totalCostPrice, noOfUnits, totalSellingPrice, noOfFloors, garageIncluded);
        }
        int searchBuildingId = scanner.nextInt();
        scanner.close();
        
        double avgprice = findBuildingById(buildings, searchBuildingId);
        if (avgprice>0) {
           System.out.println(avgprice);
           
        } else {
            System.out.println("no buildings");
        }

        Apartement a= findBuildingByMaxProfit(buildings);
        if(a!=null){
            System.out.println(a.getBuildingId()+"\n"+a.getBuildingName());
        }
        else{
            System.out.println("No Profit in any Buildings");
        }
        
    }

}