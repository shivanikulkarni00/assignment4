//Print the sum, difference and product of two complex numbers by creating a class, named
//'Complex' with separate methods for each operation whose real and imaginary parts are 
//entered by user. Use Constructors to initialize the data members.


package assignemt3;

public class Complex {
   private double real;
   private double imaginary;
public Complex(double realSum, double imaginarySum) {
	super();
	this.real = realSum;
	this.imaginary = imaginarySum;
}
public Complex add(Complex real) {
    double realSum = this.real + real.real;
    double imaginarySum = this.imaginary + real.imaginary;
    return new Complex(realSum, imaginarySum);
}

// Method to subtract two complex numbers
public Complex subtract(Complex real) {
    double realDiff = this.real - real.real;
    double imaginaryDiff = this.imaginary - real.imaginary;
    return new Complex(realDiff, imaginaryDiff);
}
//Method to multiply two complex numbers
public Complex multiply(Complex real) {
    double realProd = (this.real * real.real) - (this.imaginary * real.imaginary);
    double imaginaryProd = (this.real * real.imaginary) + (this.imaginary * real.real);
    return new Complex(realProd, imaginaryProd);
}
public void display() {
    if (imaginary >= 0)
        System.out.println(real + " + " + imaginary + "i");
    else
        System.out.println(real + " - " + Math.abs(imaginary) + "i");
}


   
}
