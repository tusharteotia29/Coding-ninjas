import java.util.*;

public class maximumprofit {

    public static int maximumProfit(int budget[]) {
		// Write your code here
        int ans=Integer.MIN_VALUE;

		Arrays.sort(budget);

		int n=budget.length;

		for (int i = 0; i < budget.length; i++) {

			int count=n-i;

			if (ans<count*budget[i]) {
				ans=count*budget[i];
				
			}
			
		}

		return ans;
	}

    public static void main(String[] args) {
        
    }
    
}
