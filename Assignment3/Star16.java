class Star16
{
public static void main(String agrs[])
{
int i,j,k;
for(i=1;i<=5;i++)
{
    for(j=1;j<=5-i;j++)
	{
	 System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
	   if(i==k||k==1||i==5)
	   System.out.print("*");
	   else
	   System.out.print(" ");
	 }
	 System.out.println("");
}
}
}
