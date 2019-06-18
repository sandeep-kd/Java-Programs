import java.util.*;
class Sum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,ans;
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		System.out.println("Enter the third number");
		num3 = sc.nextInt();
		System.out.println("Enter the fourth number");
		num4 = sc.nextInt();
		System.out.println("Enter the fifth number");
		num5 = sc.nextInt();
		System.out.println("Enter the sixth number");
		num6 = sc.nextInt();
		System.out.println("Enter the seventh number");
		num7 = sc.nextInt();
		System.out.println("Enter the eight number");
		num8 = sc.nextInt();
		System.out.println("Enter the ninth number");
		num9 = sc.nextInt();
		System.out.println("Enter the tenth number");
		num10 = sc.nextInt();
		ans = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
		System.out.println("The sum of the numbers is:-");
		System.out.println(""+num1+" + "+num2+" + "+num3+" + "+num4+" + "+num5+" + "+num6+" +"+num7+" + "+num8+" + "+num9+" + "+num10+" = "+ans+"");
	}
}