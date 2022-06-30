
public class ParentChildRelation {

	static int i=10;
	static
	{
		methodOne();
		System.out.println("first static block");
	}
	public static void main(String[] args) {
		methodOne();
		// TODO Auto-generated method stub
		System.out.println("base Main");
	}
	public static void methodOne()
	{
		System.out.println(j);
	}
	static int j=20;

}
