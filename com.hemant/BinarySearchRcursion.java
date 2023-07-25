import java.util.*;

public class BinarySearchRcursion {
    public static void main(String[] args) {
        int[] nums={8,2,9,21,93,21,13,12,21,53,43,65,64,68,234,21,76};
        int target=21;
        // int result=findIndexLast(nums, target, nums.length-1);
        // System.out.println(result);
        findAllIndex(nums, target, 0);
        System.out.println(list);
    }
    public static boolean binarySearch(int[] nums, int target ,int index){
        if(index==nums.length-1) return false;
        return (nums[index]==target || binarySearch(nums , target, index+1));
    }
    public static int findIndex(int[] nums, int target ,int index){
        if(index==nums.length){
            return -1;
        }
        if(nums[index]==target){
            return index;
        }
        return findIndex(nums, target, index+1);
    }
    public static int findIndexLast(int[] nums, int target ,int index){
        if(index==-1){
            return -1;
        }
        if(nums[index]==target){
            return index;
        }
        return findIndex(nums, target, index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] nums, int target ,int index){
        if(index==nums.length){
            return;
        }
        if(nums[index]==target){
            list.add(index);
        }
        findIndex(nums, target, index+1);
    }
}
