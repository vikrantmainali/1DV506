package vm222cv_assign3;

public class FractionMain {

	public static void main(String[] args) 
	{
		Fraction f1 = new Fraction(1,16);
		Fraction f2 = new Fraction(2,6);
		Fraction f3 = new Fraction(1,2);
		Fraction f4 = new Fraction(2,4);

		System.out.println("Fraction is: " + f1.toString()); //printing the fraction 
		
		System.out.println("Numerator is: " + f1.getNumerator()); //getting the numerator of the fraction and printing it
		
		System.out.println("Denominator is: " + f1.getDenominator()); //getting the denominator of the fraction and printing it
		
		f1.isNegative(); //check if the fraction is negative or not
		
		
		if (f1.isEqualTo(f2)) //checking if the two fractional instances are equal or not 
		{
			System.out.println("The two fractions are equal!"); //this doesn't work since they are not equal
		}
		
		if (f3.isEqualTo(f4))
		{
			System.out.println("The two fractions are equal!"); //this works since they are equal
		}
		
		System.out.println("Adding: " + f1.add(2, 64)); //adding two fractions
		
		System.out.println("Subtracting: " + f2.subtract(5, 6)); //subtracting two fractions
		
		System.out.println("Multiplying: " + f3.multiply(5, 6)); //multiplying two fractions
		
		System.out.println("Dividing: " + f4.divide(5, 6)); //dividing two fractions

		}
	}
	
	



 