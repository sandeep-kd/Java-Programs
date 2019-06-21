import java.util.*;
class Swap
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int c,d,temp;
		System.out.print("Enter the first number:  ");
		c = sc.nextInt();
		System.out.print("Enter the second number:  ");
		d = sc.nextInt();
		System.out.println("After Swapping");
		temp = c;
		c = d;
		d = temp;
		
		System.out.println("The first number is:  " +c);
		System.out.println("The second number is:  " +d);
	}
}