public class Teacher
{
private int id;
private String name;
private int sal;
public static void main(String args[])
{
Teacher T1 = new Teacher();
T1.setId(11);
T1.setSubject("MATH");
T1.setSalary(20000);
T1.display();

Teacher T2 =new Teacher();
T2.setId(22);
T2.setSubject("Bio");
T2.setSalary(3000);
T2.display();
}

public void setId(int i)
{
this.id=i;
}

public void setSubject(String str)
{
this.name=str;
}

public void setSalary(int j)
{
this.sal=j;
}

public int getId()
{
return id;
}

public String getSubject()
{
return name;
}

public int getSalary()
{
return sal;
}

void display()
{
System.out.println(this.getId());
System.out.println(this.getSubject());
System.out.println(this.getSalary());
}

}