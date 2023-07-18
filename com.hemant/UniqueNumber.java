import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = read.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=read.nextInt();
        }
        System.out.println(uniqueNumber(nums));
        read.close();
    }

    static int uniqueNumber(int[] nums) {
        int ans = 0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}
