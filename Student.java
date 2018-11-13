public class Student {
	private int id;
	private String name;
        private static String collegename="B.N.C.O.E";
	public static void main(String[] args) {
		Student obj= new Student();
		obj.setId(10);
		obj.setName("Kunal");		
		obj.display();
		
		Student anuja= new Student();
		anuja.setId(11);
		anuja.setName("anuja");	
                   anuja.collegename="mycollegeBNCO";	
                    obj.display();
		anuja.display();
	}	
	public void setId(int i){
		this.id = i;
	}
	public void setName(String str){
		this.name = str;		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	void display(){
		System.out.println(this.getId());
		System.out.println(this.getName());
                System.out.println(Student.collegename);
	}
}