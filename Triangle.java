// Write a program to print the area and perimeter of a triangle having sides of 
// 3, 4 and 5 units by creating a
// class named 'Triangle' with parameter in its constructor.
package assignemt3;

public class Triangle {
	int side1,side2,side3;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public  int getPerimeter()
	{
  return (side1+side2+side3);
		 }
	public double getArea()
	{
		int semiperi=(side1+side2+side3)/2;
		return Math.sqrt(semiperi*(semiperi-side1)*(semiperi-side2)*(semiperi-side3));
		
	}
}