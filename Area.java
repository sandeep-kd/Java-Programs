import java.util.*;
class Area
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int len,brdth,area_r,pmtr;
		double r,cirf,area_c;
		
		System.out.println("Enter the length of rectangle: ");
		len = sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle: ");
		brdth = sc.nextInt();
		
		area_r = len*brdth;
		System.out.println("The area of the rectangle is: " +area_r);
		
		pmtr = 2*(len+brdth);
		System.out.println("The perimeter of the rectangle is:  " +pmtr);
		
		
		System.out.println("Enter the radius of circle: ");
		r = sc.nextDouble();
		
		area_c = 3.14*r*r;
		System.out.println("The area of circle is: " +area_c);
		
		cirf = 2*3.14*r;
		System.out.println("The circumference of circle is " +cirf);
	}
}