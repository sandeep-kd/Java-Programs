import java.util.*;
class Angle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int angle1,angle2,angle3;
		System.out.println("Enter the first angle");
		angle1 = sc.nextInt();
		System.out.println("Enter the second angle");
		angle2 = sc.nextInt();
		angle3 = 180-angle1-angle2;
		System.out.println("The third angle is:  " +angle3);
	}
}