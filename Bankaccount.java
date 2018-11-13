class Bankaccount
{
private int a;
private int b;
public static void main(String args[])
{
Bankaccount obj1 = new Bankaccount ();
obj1.setAccountId(100);
obj1.setBalance(100000);
obj1.display();

Bankaccount obj2 = new Bankaccount ();
obj2.setAccountId(100);
obj2.setBalance(100000);
obj2.display();

Bankaccount obj3 = new Bankaccount ();
obj3.setAccountId(100);
obj3.setBalance(100000);
obj3.display();

}

public void setAccountId(int i){
this.a=i;
}

public void setBalance(int i){
this.b=i;
}

public int getAccountId(){
return a;
}

public int getBalance(){
return b;
}

void display()
{
System.out.println(getAccountId());
System.out.println(getBalance());
}
}




