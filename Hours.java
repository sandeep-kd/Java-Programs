import java.util.*;
class Hours
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int hrs,mins;
		System.out.println("Enter the minutes");
		mins = sc.nextInt();
		System.out.println("The total number of minutes are " +mins);
		mins = mins/60;
		System.out.println("The total number of Hours are:  " +mins);
	}
}