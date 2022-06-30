package compatterns;

public class patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=n;i>=1;i--)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(j<i)
	            {
	            System.out.print(" ");
	            }
	            else{
	                System.out.print("*");
	            }
	        }
	        System.out.println();
	    }
		System.out.println("Hello World");

	}

}
