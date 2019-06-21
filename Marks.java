import java.util.*;
class Marks
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int m1,m2,m3,m4,m5,aggr;
		double per;
		System.out.println("Enter the marks in 1st subject: ");
		m1 = sc.nextInt();
		System.out.println("Enter the marks in 2nd subject: ");
		m2 = sc.nextInt();
		System.out.println("Enter the marks in 3rd subject: ");
		m3 = sc.nextInt();
		System.out.println("Enter the marks in 4th subject: ");
		m4 = sc.nextInt();
		System.out.println("Enter the marks in 5th subject: ");
		m5 = sc.nextInt();
		aggr = m1+m2+m3+m4+m5;
		System.out.println("The aggregate marks of a student is " +aggr);
		per = (double)(aggr/5);
		System.out.println("The percentage of a student is " +per);
		
	}
}