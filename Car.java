package co.grandcircus.lab11;

public class Car { /* Data members */

	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car() { /* Constructor with default values */

	}

	public Car(String make, String model, int year, double price) { /* Constructor with 4 arguments */
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() { /* Make getter */
		return make;
	}

	public void setMake(String make) { /* Make setter */
		this.make = make;
	}
	
	public String getModel() { /* Model getter */
		return model;
	}

	public void setModel(String model) { /* Model setter */
		this.model = model;
	}
	public int getYear() { /* Year getter */
		return year;
	}

	public void setYear(int year) { /* Year setter */
		this.year = year;
	}

	public double getPrice() { /* Price getter */
		return price;
	}

	public void setPrice(double price) { /* Year setter */
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %d\t$%,10.2f", make, model, year, price);
	}
	
	
}
