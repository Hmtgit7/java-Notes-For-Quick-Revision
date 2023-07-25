import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] nums={4,38,43,0,2,3,48,9};
       int[] result= mergeSort(nums);
        System.out.println(Arrays.toString(result));
    }   
    public static int[] mergeSort(int[] nums){
        if(nums.length==1){
            return nums;
        }

        int mid =nums.length/2;

        int[] leftPart=mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] rightPart=mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeArrays(leftPart,rightPart);
    }
    static int[] mergeArrays(int[] first,int[] second){
        int[] finalArray=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                finalArray[k]=first[i];
                i++;
            }
            else{
                finalArray[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            finalArray[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            finalArray[k]=first[j];
            j++;
            k++;
        }
        return finalArray;
    }

    public static void mergeSortInPlace(int[] nums ,  int start , int end){
        if(end-start==1){
            return;
        }
        int mid=start+(end-start)/2;

        mergeSortInPlace(nums, start, mid);
        mergeSortInPlace(nums, mid, end);

        mergeInPlace(nums,mid,start,end);
    }
    public static void mergeInPlace(int[] nums, int m, int s, int e){
        int[] mix=new int[nums.length];
        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(nums[i]<nums[j]){
                mix[k]=nums[i];
                i++;
            }
            else{
                mix[k]=nums[j];
                j++;
            }
            k++;
        }

        if(i<m){
            mix[k]=nums[i];
            i++;
            k++;
        }
        if(j<e){
            mix[k]=nums[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length;l++){
            nums[s+l]=mix[l];
        }
    }
}
