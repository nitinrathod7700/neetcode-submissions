class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
       // return duplicate(nums);
    }
    // private int duplicate(int[] a){
    //     int max = max(a);
    //     int[] ispresent = new int[max+1];

    //     for(int i=0; i<a.length; i++){
    //         ispresent[a[i]]++;
    //     }

    //     int maxFrequent = Integer.MIN_VALUE;
    //     int element = 0;
    //     for(int i=0; i<ispresent.length; i++){
    //         if(ispresent[i] > maxFrequent){
    //             maxFrequent = ispresent[i];
    //             element = i;
    //         }
    //     }
    //     return element;
    // }

    // private int max(int[] nums){
    //     int max = Integer.MIN_VALUE;

    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i] > max){
    //             max = nums[i];
    //         }
    //     }
    //     return max;
    // }
}