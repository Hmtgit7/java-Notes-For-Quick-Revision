import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int[] nums={3,5,2,6,1,4};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void cyclicSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

/*
 * TIME COMPLEXITY
 */