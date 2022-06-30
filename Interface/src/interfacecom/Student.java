package interfacecom;

class Student
{
int x=10;
{
methodOne();
System.out.println("Parent first instance block");
}
Student()
{
System.out.println("parent class constructor");
}
public static void main(String[] args)
{
Student p=new Student();
System.out.println("parent class main method");
}
public void methodOne()
{
System.out.println(y);
}
int y=20;
}
class Child extends Student
{
int i=100;
{
methodTwo();
System.out.println("Child first instance block");
}
Child()
{
System.out.println("Child class constructor");
}
public static void main(String[] args)
{
Child c=new Child();
System.out.println("Child class main method");
}
public void methodTwo()
{
System.out.println(j);
}
{
System.out.println("Child second instance block");
}
int j=200;
}