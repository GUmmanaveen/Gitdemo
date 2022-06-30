
public class Derived extends ParentChildRelation{

	static int x=100;
	static
	{
		methodTwo();
		System.out.println("Derived first static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodTwo();
		System.out.println("Derived main");
	}
	public static void methodTwo()
	{
		System.out.println(y);
	}
	static 
	{
		System.out.println("Derived second static block");
	}
	static int y=200;

}
