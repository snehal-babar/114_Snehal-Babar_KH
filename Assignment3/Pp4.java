class Pp4
{
public static void main(String args[])
{
for(int i=1;i<=9;i++)
{
   for(int j=1;j<=9-i;j++)
     {
	    System.out.print(" ");
	 }
   for(int k=1;k<=i;k++)
     {
	 System.out.print(k);
	 }
	 for(int l=i;l>1;l--)
     {
	 System.out.print(l-1);
	 }
	 
	 System.out.println();
}
}
}