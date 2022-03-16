import java.util.Scanner;
class Arithmatic6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n1=sc.nextInt();
System.out.println("Enetr a number");
int n2=sc.nextInt();
int add=n1+n2;
int sub=n1-n2;
int mult=n1*n2;
int div=n1/n2;
int mod=n1%n2;
System.out.println(n1+"+"+n2+"="+add);
System.out.println(n1+"-"+n2+"="+sub);
System.out.println(n1+"*"+n2+"="+mult);
System.out.println(n1+"/"+n2+"="+div);
System.out.println(n1+"%"+n2+"="+mod);
}
}