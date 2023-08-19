package DynamicProgrammings;

import java.util.Arrays;

public class MinimumCoin {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        System.out.println(minimumCoin(coins, amount));
        System.out.println(minCoins(coins, amount));
        System.out.println(minCoins(coins, amount, dp));
    }

    public static int minimumCoin(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    // USIGN RECURSION
    public static int minCoins(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int subAns = minCoins(coins, amount - coins[i]);
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return ans;
    }

    public static int minCoins(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int subAns = 0;
                if (dp[amount - coins[i]] != -1) {
                    subAns = dp[amount - coins[i]];
                } else {
                    subAns = minCoins(coins, amount - coins[i], dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        dp[amount] = ans;
        return ans;
    }
}