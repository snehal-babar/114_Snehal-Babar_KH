import java.util.*;
class Frecursion
{
  static int factorial(int num)
  {
      int ans;
      if(num==1)
	  return 1 ;
	  else
	  ans=factorial(num-1)*num;
	  return ans;

  }
 public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enetr a number= ");
   int num=sc.nextInt();
   int ans=factorial(num);
   System.out.println("factorial of given number= "+ans);
 }
} 