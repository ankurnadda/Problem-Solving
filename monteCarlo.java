import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class monteCarlo {

static int n = 8;
static int col[] = new int [n+1]; 
	
	static int estimate_nqueens (int n)
	{
		
		ArrayList<Integer> prom_children = new ArrayList<Integer>();
		int m =1 , mprod =1, numnodes =1;
		int j;
		int i =0;
		Random random = new Random();
		while (m!=0 && i!=n)
		{
			mprod = mprod*m;
			numnodes = numnodes + mprod*n;
			i++;
			m=0;	
			prom_children.clear();
					
			for(j=1; j<=n; j++)
			{
				col[i] = j;
				if(promise(i))
				{
					m++;
					prom_children.add(j);
				}
			}
		if (m!=0)
		{
			j = prom_children.get(random.nextInt(prom_children.size()));
			col[i] = j;
		}
	}		
		return numnodes;
	}
	
	static boolean promise(int i)
	{
		int k=1;
		boolean s=true;
		while(k<i && s==true)
		{
			if (col [i]== col[k] || Math.abs(col[i]-col[k])==i-k)
			{
				s = false;
			}
			k++;
		}		
		return s;
	}	

	public static void main (String [] args)
	{
		
		int answer = estimate_nqueens(8);
		System.out.println(answer);
	}
}	