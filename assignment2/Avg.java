//Write a Java program that takes three numbers as input to calculate and print the 
//average of the numbers. 

import java.util.Scanner;
class Avg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st no");
Double n1=sc.nextDouble();
System.out.println("Enter 2nd n0");
Double n2=sc.nextDouble();
System.out.println("Enetr 3rd no");
Double n3=sc.nextDouble();
 Double avg =(n1+n2+n3)/3;
 System.out.println("Average of given numbers= "+avg);
 }
 }