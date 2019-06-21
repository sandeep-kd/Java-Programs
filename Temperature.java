import java.util.*;
class Temperature
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double f,c;
		System.out.println("Enter the temperature in fahrenheit degrees: ");
		f = sc.nextDouble();
		c = ((f-32)*5)/9;
		System.out.println("The temperature in celcius degree is:  " +c);
	}
}