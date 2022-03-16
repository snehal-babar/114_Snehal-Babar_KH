//11. Write a Java program to print the area and perimeter of a circle. 
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586



import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a redius");
double r=sc.nextDouble();
double area=(22*r*r)/7;
double perimeter=(2*22*r)/7;
System.out.println("area of circle is= "+area+"perimeter of circle= "+perimeter);
}
}
