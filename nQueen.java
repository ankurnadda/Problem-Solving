import java.util.Arrays;
public class nQueen {
	static int n =8;  // number of queens
	static int col[] = new int [n];
	static void queens(int i)
	{
		int j;		
		if (promise(i)==true)
		{
			if (i==n)
			{
				System.out.println(Arrays.toString(col));  //  col[1] through col[n]
			}
			else
			{
				for(j=1;j<=n;j++)
				{
					col[i]=j;
					queens(i+1);
				}
			}
		}		
	}		
	static boolean promise(int i)
	{
		int k=1;
		boolean s=true;
		while(k<i && s==true)
		{
			if (col [i-1]== col[k-1] || Math.abs(col[i-1]-col[k-1])==i-k)
			{
				s = false;
			}
			k++;
		}		
		return s;
	}
	public static void main(String[] args) {
		queens(0);
	}
}
