class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        
        leftSum[0] = nums[0];
        rightSum[nums.length - 1] = nums[nums.length - 1];
        
        for(int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
            rightSum[nums.length - 1 - i] = rightSum[nums.length - i] + nums[nums.length - 1 - i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
}