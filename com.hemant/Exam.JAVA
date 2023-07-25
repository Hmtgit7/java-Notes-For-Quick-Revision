import java.util.Arrays;

public class CandleStack {

    public static int saltung(int N, int[] candle) {
        Arrays.sort(candle); // Sort the candle stack in ascending order

        int candles_needed_1 = 1;
        int candles_needed_2 = 1;
        int candles_needed_K = 1;
        int total_candles_needed = 3;

        for (int c : candle) {
            if (candles_needed_1 > 0 && c == 1) {
                candles_needed_1--;
                total_candles_needed--;
            } else if (candles_needed_2 > 0 && c == 2) {
                candles_needed_2--;
                total_candles_needed--;
            } else if (candles_needed_K > 0 && c == K) {
                candles_needed_K--;
                total_candles_needed--;
            }

            if (total_candles_needed == 0) {
                break;
            }
        }

        // Check if all candles 1, 2, and K have been obtained
        if (total_candles_needed > 0) {
            return -1;
        }

        // Return the total number of candles needed
        return candles_needed_1 + candles_needed_2 + candles_needed_K;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] candle = {3, 1, 2, 1, 1};
        int result = saltung(N, candle);
        System.out.println(result); // Output: 2
    }
}
