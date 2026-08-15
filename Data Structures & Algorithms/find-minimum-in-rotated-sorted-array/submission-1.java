public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }


    //  public int findMin(int[] nums) {
    //     int min = Integer.MAX_VALUE;

    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i] < min){
    //             min = nums[i];
    //         }
    //     }
    //     return min;
    // }
}