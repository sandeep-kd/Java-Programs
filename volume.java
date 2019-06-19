import java.util.*;
class Volume
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double r,vol;
		System.out.println("Enter the radius");
		r = sc.nextDouble();
		vol = (4*3.14*r*r*r)/3;
		System.out.println("The volume of the sphere is:  " +vol);
	}
}
