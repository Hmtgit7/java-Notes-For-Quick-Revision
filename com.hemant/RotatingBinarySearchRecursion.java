public class RotatingBinarySearchRecursion {
    public static void main(String[] args) {
    }

    public static int searchInRotated(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return searchInRotated(nums, target, start, mid - 1);
            } else {
                return searchInRotated(nums, target, start, mid + 1);
            }
        }
        if(target>=nums[mid] && target<=nums[end]){
            return searchInSorted(nums,target,mid+1,end);
        }
        return searchInSorted(nums, target, start, mid - 1);
    }
}