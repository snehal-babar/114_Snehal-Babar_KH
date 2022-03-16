class Star14
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=5;i++)
{
   {
   for(j=1;j<=i-1;j++)
   System.out.print(" ");
   }
   {
   for(k=i;k<=5;k++)
   System.out.print(" *");
   }
System.out.println();
}
for(i=1;i<=4;i++)
{
   {
   for(j=i;j<=3;j++)
   System.out.print(" ");
   }
   {
   for(k=1;k<=i+1;k++)
   System.out.print(" *");
   }
System.out.println();
}

}
}