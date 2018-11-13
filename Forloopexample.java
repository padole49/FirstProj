class Forloopexample{
public static int sum=0;
public static void main(String [] args)
{

	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}


String s=" ";
for (int i=0;i<=10;i++)
{
s=s+"+"+i;
}
System.out.println(s);

for(int k=0;k<=10;k++)
	{
                
		sum=sum+k;
                
	}
System.out.println(sum);
int sum1=0;
for(int k=0;k<=10;k++)
	{
                
		sum1=sum1+k;
                 k=k+1;
                
	}
System.out.println("EVEN"+sum1);
sum1=0;
for(int k=1;k<=10;k++)
	{
                
		sum1=sum1+k;
                 k=k+1;
                
	}
System.out.println("ODD"+sum1);


int fact1=1;
for(int k=1;k<=5;k++)
	{
                
		fact1=fact1*k;
                
                
	}
System.out.println(fact1);
}
}
// 1 to 100 Odd sum
// 1 to 100 even sum
// factorial 
//JVM java virtual machine,for static no need to create object to call function