class Solution {
    public boolean check(int[] nums) {
        // int[] sorted = new int[nums.length];

        // for(int i=0; i<sorted.length; i++){
        //     sorted[i] = nums[i];
        // }

        // for(int i=0; i<sorted.length-1; i++){
        //     for(int j=0; j<sorted.length-1-i; j++){
        //         if(sorted[j] > sorted[j+1]){
        //             int temp = sorted[j];
        //             sorted[j] = sorted[j+1];
        //             sorted[j+1] = temp;
        //         }
        //     }
        // }

        // for(int i=1; i<sorted.length; i++){
        //     if(sorted[i] >= sorted[i-1]){

        //     }else {
        //         return false;
        //     }
        // }
        // return true;
        int count = 1 ;
        int n=nums.length;
        for(int i=1; i< 2*n ; i++){
            if(nums[i%n] >= nums[(i-1)%n]){
                count++;
            }
            else {
                count = 1;
            }
            if(count == n){
                return true;
            }
        }
        return n == 1;
    }
}