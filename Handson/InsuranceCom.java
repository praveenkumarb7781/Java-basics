package Handson;
import java.util.*;

interface Insurance{
	public double takeInsurance();
}

interface Loan extends Insurance{
	public double issueLoan();
}

class Vehicle implements Loan{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vnum) {
		this.vehicleNumber =vnum;
	}
	
	public String ModelName() {
		return modelName;
	}
	public void setModelName(String mna) {
		this.modelName=mna;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vtyp) {
		this.vehicleType=vtyp;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double pri) {
		this.price=pri;
	}
	
	public Vehicle(String vNumber, String mName, String vType, double price) {
		this.vehicleNumber =vNumber;
		this.modelName =mName;
		this.vehicleType=vType;
		this.price=price;
	}
	public double issueLoan() {
		if(vehicleType.equals("4wheeler")) {
			return 0.8*price;
		}
		else if(vehicleType.equals("3wheeler")) {
			return 0.75*price;
		}
		else
			return 0.5*price;
	}
	public double takeInsurance() {
		if(this.price<=150000) 
			return 3500;
		else if(this.price>150000&&this.price<=300000)
			return 4000;
		else
			return 5000;
	}
}
public class InsuranceCom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle Number:");
		String st =sc.next();
		System.out.println("Enter Model Name:");
		String mn =sc.next();
		System.out.println("Enter Vehicle Type:");
		String vn =sc.next();
		System.out.println("Enter Price:");
		double pr=sc.nextDouble();
		Vehicle v1 = new Vehicle(st,mn,vn,pr);
		System.out.println("Insurance price:"+v1.takeInsurance());
		System.out.println("Loan amount Produced:"+v1.issueLoan());
	}

}
