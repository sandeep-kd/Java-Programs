import java.util.*;
class Distance
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int km,m,inch,cm;
		double feet;
		System.out.println("Enter the distance in kilometers");
		km = sc.nextInt();
		m = km*1000;
		System.out.println("The distance in meters are: " +m);
		feet = (double)(km*3280.84);
		System.out.println("The distance in feet are: " +feet);
		inch= km*39370;
		System.out.println("The distance in inches are: " +inch);
		cm = km*100000;
		System.out.println("The distance in centimeters are: " +cm);
	}
}