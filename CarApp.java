package co.grandcircus.lab11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();	
		addInitialCars(cars);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
				
		boolean shouldContinue = true;
		
		while (shouldContinue  == true) {			
			System.out.println("Please choose an option from below (1-5):");
			showMenuOptions();
			int userAnswer = Integer.parseInt(scan.nextLine());
			switch (userAnswer) {
			case 1:
				listCars(cars);
				break;
			case 2:
				addCar(cars, scan);
				listCars(cars);
				break;
			case 3:				
				removeCar(cars);
				listCars(cars);
				break;
			case 6:
				System.out.println("Goodbye");
				shouldContinue = false;
				break;				
			default:
				System.out.println("Please try again");				
			}
		}	    	    
	    											
//		Car myCar = new Car("Volkswagen", "Jetta", 2015, 4831.99);
//		Car myUsedCar = new UsedCar("Volkswagen", "Jetta", 2015, 4831.99, 99.9);
//		System.out.println(myCar);
////		System.out.println(myUsedCar);		
	}

	private static void addCar(ArrayList<Car> listOfCars, Scanner scan) {
		System.out.println("Please enter the make of your car");
		String make = scan.nextLine();
		System.out.println("Please enter the model of your car");
		String model = scan.nextLine();
		System.out.println("Please enter the year of your car");
		String yearString = scan.nextLine();
		int year = Integer.parseInt(yearString);
		System.out.println("Please enter the price of your car");
		String priceString = scan.nextLine();
		double price = Integer.parseInt(priceString);
		Car newCar = new Car(make, model, year, price);
		listOfCars.add(newCar);
	}
	
	private static void addInitialCars(ArrayList<Car> listOfCars) {
		listOfCars.add(new Car ("Chevrolet", "Malibu", 2016, 22500.11));
		listOfCars.add(new Car ("Rolls Royce", "Phantom", 2018, 417825.00));
		listOfCars.add(new Car ("Lamborghini", "Gallardo", 2014, 259099.99));
		listOfCars.add(new Car ("Bentley", "Mulsanne", 2017, 304699.89));
	}
	
	private static void listCars(ArrayList<Car> listOfCars) {				
		for (int i = 0; i < listOfCars.size(); i++) {
			System.out.println(i + 1 + "." + listOfCars.get(i));
		}
	}

	private static void removeCar(ArrayList<Car> listOfCars) {
		int lastCarIndex = listOfCars.size() - 1;
		listOfCars.remove(lastCarIndex);
	}
	
	private static void showMenuOptions() {
		System.out.println("1. List all cars");
		System.out.println("2. Add a car");
		System.out.println("3. Remove a car");
		System.out.println("4. Look up a car");
		System.out.println("5. Replace a car");
		System.out.println("6. Quit");
	}
}
