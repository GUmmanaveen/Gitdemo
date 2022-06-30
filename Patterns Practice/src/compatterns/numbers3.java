package compatterns;

public class numbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(n+++" ");	
				}
			}
			System.out.println();
		}


	}

}
