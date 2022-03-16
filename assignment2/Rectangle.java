//13. Write a Java program to print the area and perimeter of a rectangle. 
//Test Data: Width = 5.5 Height = 8.5
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter width of rectangle= ");
double w=sc.nextDouble();
System.out.println("enter height of rectangle= ");
double h=sc.nextDouble();
double area=w*h;
double perimeter= 2*(w+h);
System.out.println("Area is "+w+"*"+h+"="+area);
System.out.println("Perimeter is "+perimeter);
}
}