package day14;

class vehicle{
	public void startEngine() {
		System.out.println("Vehicle Engine Started...");
	}
}

class car extends vehicle{
	public void Drive() {
		System.out.println("Car is driving...");
	}
}


class ElectricCar extends car{
	public void chargeBattery() {
		System.out.println("Electric Car is charging...");
	}
}

class Bike extends vehicle{
	public void kickStart() {
		System.out.println("Bike is kick-Started...");
	}
}
public class VehicleManagamentSys {
	public static void main(String[] args) {
		
		
		ElectricCar EV = new ElectricCar();
		EV.startEngine();
		EV.Drive();
		EV.chargeBattery();
		
		Bike B = new Bike();
		B.startEngine();
		B.kickStart();
		
	}

}
