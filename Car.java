public class Car{
	int mil;
	String carPlate;
	boolean headLights;


	public Car(int mi,String plate){
		this.mil=mi;
		this.carPlate=plate;
		}
		public Car(){
		}

		public double incSpeed(double speed){
			speed+=10;
			return speed;
	}
}