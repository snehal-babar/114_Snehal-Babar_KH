class Star6
{
public static void main(String args[])
{
int i,j,k,l;

for(i=1;i<=5;i++)
{
   {
   for(j=1;j<=i-1;j++)
   System.out.print(" ");
   }
   {
   for(k=i;k<=5;k++)
   System.out.print("*");
   }
   {
   for(l=1;l<=5-i;l++)
   System.out.print("*");
   }
System.out.println();
}
}
}