class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return dissapeared(nums);
    }
    private List<Integer> dissapeared(int[] nums){
        List<Integer> digits = new ArrayList<>();
        boolean[] isPresent = new boolean[nums.length+1];

        for(int i=0; i<nums.length; i++){
            isPresent[nums[i]] = true;
        }

        for(int i=1; i<isPresent.length; i++){
            if(!isPresent[i]){
                digits.add(i);
            }
        }
        return digits;
    }
}