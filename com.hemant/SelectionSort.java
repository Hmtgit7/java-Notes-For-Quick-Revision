import java.util.Arrays;

public class  SelectionSort {
    public static void main(String[] args) {
        int[]nums={4,5,8,3,9,2,6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selectionSort(int[]nums){
        for(int i=0; i<nums.length;i++){
        int last=nums.length-i-1;
        int maxIndex=findMax(nums, 0, last);
        swap(nums,maxIndex,last);
        }
    }
    static void swap(int[]nums,int first , int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

    static int findMax(int[] nums,int start,int end){
        int max=start;
        for(int i=0;i<=end; i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
}
/* TIME COMPLEXITY 
WORST CASE: O(N^2)
BEST CASE: O(N^2)
NOTE: WE CAN USE THIS ALGORITHM FOR SHORT ARRAYS 
IT JUST PUT THE ELEMENT AT ITS RIGHT INDEX
JUST MAX ELEMENT OUT OF THE AARAY AND SWAP IT WITH ITS CORRECT INDEX
*/
