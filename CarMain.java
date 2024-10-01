package Assignment30;

public class CarMain {
 public static void main(String args[]) {
	 Car car=new Car();
	 car.assignValues();
	 car.displayValues();
	 
	 Car car1=new Car();
	 car1.assignValues();
	 car1.displayValues();
 }
}
/*
Enter Car Model: "ABC"
Enter Car Name: BMW
Enter Car Price: 6000000
Enter Car Owner: Aditya
Car Model: "ABC"
Car Name: BMW
Car Price: 6000000.0
Car Owner: Aditya

Enter Car Model: bcd
Enter Car Name: tesla
Enter Car Price: 10000000
Enter Car Owner: Ananya
Car Model: bcd
Car Name: tesla
Car Price: 1.0E7
Car Owner: Ananya
*/