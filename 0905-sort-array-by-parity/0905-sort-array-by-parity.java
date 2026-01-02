class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int odd = nums.length - 1;
        
        while(even < odd) {
            if(nums[even] % 2 == 0) {
                even++;
                continue;
            }
            if(nums[odd] % 2 != 0) {
                odd--;
                continue;
            }
            
            int tmp = nums[even];
            nums[even] = nums[odd];
            nums[odd] = tmp;
            even++;
            odd--;
        }
        return nums;
    }
}