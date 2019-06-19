import java.util.*;
class Minutes
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int hrs,mins;
		System.out.println("Enter the hours");
		hrs = sc.nextInt();
		System.out.println("Enter the minutes");
		mins = sc.nextInt();
		hrs = hrs*60;
		hrs = hrs+mins;
		System.out.println("The total number of minutes are:  " +hrs);
	}
}