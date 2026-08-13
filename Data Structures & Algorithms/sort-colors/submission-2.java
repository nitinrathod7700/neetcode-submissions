class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k=0;

        for(int num : nums){
            if(num==0) i++;
            else if(num==1) j++;
            else k++;
        }

        int index = 0;
        while(i>0){
            nums[index] = 0;
            index++;
            i--;
        }
          while(j>0){
            nums[index] = 1;
            index++;
            j--;
        }
          while(k>0){
            nums[index] = 2;
            index++;
            k--;
        }
    }
}