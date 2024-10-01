package assignemt3;

import java.util.Scanner;

public class TestComplex {

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
		//  first complex number
	        System.out.println("Enter the value first complex no.:");
	        double real1 = scanner.nextDouble();
	        double imaginary1 = scanner.nextDouble();
	        Complex complex=new Complex(real1,imaginary1);

	        // second complex number
	        System.out.println("Enter the value second complex no:");
	        double real2 = scanner.nextDouble();
	        double imaginary2 = scanner.nextDouble();
            Complex complex1=new Complex(real2,imaginary2);
            //add
	        Complex sum = complex.add(complex1);
	        System.out.print("Sum is: ");
	        sum.display();

	        //  difference
	        Complex diff = complex.subtract(complex1);
	        System.out.print("Difference is: ");
	        diff.display();

	        //  product
	        Complex product = complex.multiply(complex1);
	        System.out.print("Product is: ");
	        product.display();
	}
}
	
