package compatterns;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=4;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	                System.out.print(n+" ");
	                n++;
	       
	        }
	        System.out.println();
	    }

	}

}
