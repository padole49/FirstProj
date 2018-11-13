
public class AdditionOverloading {
	
	public static void main(String args[])
	{
		AdditionOverloading abj1=new AdditionOverloading();
		int res=0;
		
		res=abj1.add(2,3);
		System.out.println("Result :"+res);
		
		res=abj1.add(2,3,6);
		System.out.println("Result :"+res);
		
		double res1 = abj1.add(2.4,3.6);
		System.out.println("Result :"+res);
	}

	int add (int a,int b){
		return a+b;
	}
	
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	double add(double a,double b){
		return a+b;
	}
}

//Ploymorphism (One name and many form): function overloading
	// Overloading rules 1) Scope is same(within same class)
	// 2) Signature is different i.e either parameter count has to be different or parameter type.
	// 3) does not depend upon return type[p0
