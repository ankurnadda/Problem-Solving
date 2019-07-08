
public class knapsack {
static int W =9;
static int maxprofit =0;
static int profit =0;
static int numbest = 0;
static int weight=0;
static int bestset[] = new int[100];
static int include[]= new int[100];
static int n = 5;
static int p[] = new int[] {20, 30, 35, 12, 3};
static int w[] = new int[] {2, 5, 7, 3, 1};
	static void knap (int i, int profit, int weight)
	{
		if(weight<=W && profit>maxprofit)
		{
			maxprofit = profit;
			numbest = i;
			bestset = include;
			
		}
		
		if (prom(i))
		{
			include[i]=999; //yes
			knap(i+2, profit + p[i], weight+w[i]);
			include[i]=1000; //no
			knap(i+2, profit, weight);
		}
	}
	
	static boolean prom(int i)
	{
		int j=1, k=1;
		float totalweight;
		
		float bound;
		if (weight>=W)
			return false;
		else
		{
			j=i+1;
			bound = profit;
			totalweight=weight;
			while(j<=n && totalweight + w[j-1]<=W)
			{
				totalweight = totalweight + w[j-1];
				bound = bound + p[j-1];
				j++;
			}
			k=j;
			if(k<=n)
				bound = bound + (W - totalweight) + p[k-1] + w[k-1];
			
			return bound>maxprofit;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			knap(0,profit,weight);
			System.out.println("The maxprofit is:" + maxprofit);

	}

}
