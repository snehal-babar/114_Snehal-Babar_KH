import java.util.Scanner;
class T7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
int i;
for(i=1;i<=10;i++)
{
System.out.println(num+"*"+i+"="+num*i);

}
}
}