package com.khelkar.sunil.recursion;

import java.util.Arrays;

public class BudgetShopping {

	
	public static void main(String[] args) {
		int budget = 50;
		int bundleCosts[] = {2, 12};
		int bundleQuantities[] = {1, 20};
//		System.err.println(budgetShopping(n, bundleQuantities, bundleCosts));
	
		int[] dp = new int[budget + 1];
		dp[0] = 0;
		
		for (int i=1; i <= budget; i++) {
			int maxQuantityForCurrBudget=0;
			for (int j=0; j<bundleCosts.length; j++) {
				int quantity = 0;
				if (bundleCosts[j] <= i) { // if the budget at this iteration is less than currCost then only we can buy it
					quantity = bundleQuantities[j] + dp[i - bundleCosts[j]];
				}
				if (quantity > maxQuantityForCurrBudget) {
					 maxQuantityForCurrBudget = quantity;
				}
			}
			dp[i] = maxQuantityForCurrBudget;
		}
		
		System.out.println(dp[budget]);
		System.out.println(Arrays.toString(dp));
	}
	
	static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {

		if (    n <= 0
				|| bundleCosts == null || bundleQuantities == null
				|| bundleCosts.length == 0 || bundleQuantities.length == 0
				|| bundleCosts.length != bundleQuantities.length
				) {
        	return 0;
        }

        final int[] max = {0}; // Actually he wants to take Heap variable

        calculateRecursive(n, bundleCosts, bundleQuantities, max, 0, 0);

        return max[0];
    }

	static void calculateRecursive(int n, int[] cost, int[] quantity, int[] max, int position, int count) {
        if (n == 0 || position == cost.length) {
        	System.out.println(max[0]);
            if (count>max[0]) {
                max[0] = count;
            }
            return;
        }
        for (int i = 0; i <= n/cost[position]; i++) {
        	System.out.println("========================" +  i);
        	System.out.println(n/cost[position]);
        	System.out.println(n - i * cost[position]);
        	System.out.println(count + i * quantity[position]);
        	System.out.println(position);
        	System.out.println("========================end" +  i);
System.out.println();
            calculateRecursive(n - i * cost[position], cost, quantity, max, position + 1, count + i * quantity[position]);
        }
    }
}
