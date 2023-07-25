import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        int[] nums={3,6,25,63,24,7};
        selectionSort(nums, nums.length,0,0);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            System.out.print("* ");
            reverseTriangle(row, col + 1);
        } else {
            System.out.println();
            reverseTriangle(row - 1, 0);
        }
    }

    public static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            triangle(row, col + 1);
            System.out.print("* ");
        } else {
            triangle(row - 1, 0);
            System.out.println();
        }
    }

    public static void bubbleSort(int[] nums, int col, int row) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (nums[col] > nums[col + 1]) {
                int temp=nums[col];
                nums[col]=nums[col+1];
                nums[col+1]=temp;
            }
            bubbleSort(nums, col+1, row);
        }
        else{
            bubbleSort(nums,0,row-1);
        }
    }
    public static void selectionSort(int[] nums,int row, int col, int max){
        if(row ==0){
            return;
        }
        if(row>col){
            if(nums[col]>nums[max]){
                selectionSort(nums, row, col+1, col);
            }
            else{
                selectionSort(nums, row, col+1, max);
            }
        }
        else{
            int temp=nums[max];
            nums[max]=nums[row-1];
            nums[row-1]=max;
            selectionSort(nums,row-1,0,0);
        }
    }
}
