
public class MyAmdxStudent
{

	String name;
	int id;
	String address;

	

	public static void main (String []args){
		MyAmdxStudent s1=new MyAmdxStudent();
		s1.setName("anuja");
                s1.setId(20);
                s1.setAddress("kahradhi");
                s1.display();
                MyAmdxStudent s2=new MyAmdxStudent();
		s2.setName("anuja1");
                s2.setId(201);
                s2.setAddress("kahradhi1");
                s2.display();
                s2.setName("anuja11");
                s2.setId(2011);
                s2.setAddress("kahradhi11");
                s2.display();
	}
        
public void setName(String d){
this.name=d;
}

public void setId(int e){
this.id=e;
}

public void setAddress(String f){
this.address=f;
}

public String getName(){
return name;
}

public int getId(){
return id;
}

public String getAddress(){
return address;
}

void display()
{

System.out.println(getName());
System.out.println(getId());
System.out.println(getAddress());

}




}