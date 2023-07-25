public class CheckArrayIsSort{
    public static void main(String[] args){
        int[] nums={1,8,4,5};
        System.out.println(isSort(nums, 0));
        
    }
    public static boolean isSort(int[] nums,int index){
        if(index==nums.length-1)return true;
        return nums[index]<nums[index+1] && isSort(nums,index+1);
    }
}