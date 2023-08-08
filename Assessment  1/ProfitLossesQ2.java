package assessment2;

// Q2 Maximum Profit
import java.util.*;

public class ProfitLossesQ2 {

	public static void main(String[] args) {
		
		int[] pl = {-2,-3,4,-1,-2,1,5,-3};
		int maxProfit = pl[0],currProfit = 0;
		
		for(int profit:pl) {
			if(currProfit < 0)
				currProfit = 0;
			currProfit += profit;
			if(maxProfit < currProfit) {
				maxProfit = currProfit;
			} 
		}
		System.out.println(maxProfit);
		
	}

}

