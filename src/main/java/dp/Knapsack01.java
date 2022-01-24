package dp;

public class Knapsack01 {
    public static int knapsack(int[] weights, int[] values, int W, int n) {
        if (W == 0 || n == 0)
            return 0;

        if (weights[n - 1] <= W) {
            return Math.max(values[n-1]+
                    knapsack(weights, values, W - weights[n - 1], n - 1),
                    knapsack(weights, values, W, n - 1)
            );
        } else {
            return knapsack(weights, values, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] weights = {1,2};
        int[] values = {1,5};
        int W = 3;
        int n = weights.length;
        int maxProfit = knapsack(weights,values,W,n);
        System.out.println("maxProfit = " + maxProfit);
    }
}

//public int knapsack(int[] weights,int [] values,int W,int n){
// Base condition

// if (W == 0 || n == 0 ) return 0;

// Choice diagram

//}

// Each item has 3 choices
// if(w1 > W) not include
// if(w1 <= W) can include and cannot include

// Base condition - Think of smallest valid input