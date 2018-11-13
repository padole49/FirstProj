public class TestArithmatic {

	public static void main(String[] args) {
		Addition add= new Addition();
		int res = add.result(6, 6);
		System.out.println(res);

             int c=add.bigNumber(20,30);
               System.out.println(c);	

             add.positive(-20);
             
             System.out.println(add.oddEven1(30));
             
             int m=add.max(34,56,77);
             		
	}
}