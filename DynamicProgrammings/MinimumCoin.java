package DynamicProgrammings;

public class MinimumCoin{
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};              
        int amount = 11;

        System.out.println(minimumCoin(coins, amount));
    }

    public static int minimumCoin(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for(int i = 1; i <= amount; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++){
                if(i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}