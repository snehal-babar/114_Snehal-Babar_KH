import java.util.*;
class Reverse
{
public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
   System.out.println("Enetr a number= ");
   int num=sc.nextInt();
   int r=0;
   while(num>0)
   {
       r=r*10+(num%10);
	   num=num/10;
   }
   System.out.println("reverse of given number= "+r);
}
}