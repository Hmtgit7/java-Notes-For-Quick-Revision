package BItManipulations;

import java.util.*;

public class DuplicatesInArray {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 1, 3, 6, 6, 8 };
        // int n = arr.length;
        // int res = findSingle(arr);
        // System.out.println(res);
        arr = findSingles(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int findSingle(int arr[]) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = res ^ arr[i];

        return res;
    }

    static int[] findSingles(int[] arr){
        int[] res = new int[2];
        int xor = arr[0];
        for(int i = 1; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        int sn = xor & ~(xor - 1);
        for(int i = 0; i < arr.length; i++){
            if((arr[i] & sn) != 0){
                res[0] = res[0] ^ arr[i];
            }else{
                res[1] = res[1] ^ arr[i];
            }
        }
        return res;
    }

    static int singleNumber(int[] nums, int n) {
        HashMap<Integer, Integer> m = new HashMap<>();
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (!m.containsKey(nums[i])) {
                sum1 += nums[i];
                m.put(nums[i], 1);
            }
            sum2 += nums[i];
        }
        return (int) (2 * (sum1) - sum2);
    }

    static int findSingle(int A[], int ar_size) {
        for (int i = 0; i < ar_size; i++) {
            int count = 0;

            for (int j = 0; j < ar_size; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return A[i];
            }
        }

        // if no element exist at most once
        return -1;
    }
}