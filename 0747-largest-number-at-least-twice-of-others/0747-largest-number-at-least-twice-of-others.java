class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;
        int secondMax = 0;
        
        for(int i = 1; i < nums.length; i++) {
            if(max <= nums[i]) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
                continue;
            }
            if(secondMax < nums[i]) {
                secondMax = nums[i];
            }
        }
        
        return secondMax * 2 <= max ? maxIndex : -1;
    }
}