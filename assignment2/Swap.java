//15. Write a Java program to swap two variables.
import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a=");
int a=sc.nextInt();
System.out.println("Enter value of b=");
int b=sc.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("a="+a+" b="+b);
}
}