import java.util.*;
class Swap
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 1st number= ");
	int num1=sc.nextInt();
	System.out.println("Enter a 2nd number= ");
	int num2=sc.nextInt();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("num1= "+num1+" num2= "+num2);
}
}
	