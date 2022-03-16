class Star7
{
public static void main(String args[])
{
int i,j,k,l;
for(i=1;i<=5;i++)
{
    for(j=1;j<=5-i;j++)
	{
	 System.out.print(" ");
	}
	for(k=1;k<=i*2-1;k++)
	{
	 System.out.print("*");
	}
	System.out.println();
}
for(i=1;i<=4;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(k=i;k<=4*2-i;k++)
	{
        System.out.print("*"); 		
	}
	System.out.println();
}
}
}










/*class Star7
{
public static void main(String args[])
{
int i,j,k,l;
for(i=1;i<=5;i++)
{
    for(j=1;j<=5-i;j++)
	{
	 System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
	 System.out.print("*");
	}
	for(l=2;l<=i;l++)
	{
	System.out.print("*");
	}
	System.out.println();
}
for(i=1;i<=4;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(k=i;k<=4;k++)
	{
        System.out.print("*"); 		
	}
	for(l=1;l<=4-i;l++)
	{
		System.out.print("*"); 
	}
	System.out.println();
}
}
}*/