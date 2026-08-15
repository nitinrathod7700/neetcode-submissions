class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        return frequency(nums1, nums2);
    }

    private int[] frequency(int[] nums1, int[] nums2) {
        int max = Math.max(max(nums1), max(nums2));

        boolean[] inNums1 = new boolean[max + 1];
        boolean[] inNums2 = new boolean[max + 1];

        for (int i = 0; i < nums1.length; i++) {
            inNums1[nums1[i]] = true;
        }
        for (int i = 0; i < nums2.length; i++) {
            inNums2[nums2[i]] = true;
        }

        int count = 0;
        for (int i = 0; i < inNums1.length; i++) {
            if (inNums1[i] && inNums2[i]) {
                count++;
            }
        }

        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < inNums1.length; i++) {
            if (inNums1[i] && inNums2[i]) {
                res[index] = i;
                index++;
            }
        }

        return res;
    }

    private int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}