class Solution {
    public int[] sortArray(int[] nums) {
        devide(nums);
        return nums;
    }
    private void devide(int[] nums){
        if(nums.length == 1) return ;

        int[] left = new int[nums.length/2];
        int[] right = new int[nums.length-left.length];

        for(int i=0; i<left.length; i++){
            left[i] = nums[i];
        }
        for(int i=0; i<right.length; i++){
            right[i] = nums[left.length+i];
        }

        devide(left);
        devide(right);

        merge(left,right,nums);
    }

    private void merge(int[] left, int[] right, int[] res){
        int i=0, j=0, k=0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                res[k] = left[i];
                k++;
                i++;
            }
            else{
                res[k] = right[j];
                k++;
                j++;
            }
        }

        while(i<left.length){
            res[k] = left[i];
            k++;
            i++;
        }

        while(j<right.length){
            res[k] = right[j];
            k++;
            j++;
        }

    }
}