public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 8, 9, 12, 15, 17 };
        int target = 9;
        int result = binarySearch(nums, target, 0, nums.length - 1);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
