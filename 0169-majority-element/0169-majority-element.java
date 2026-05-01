class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int maxV = 0;
        int maxC = 0;
        int preV = nums[0];
        int preC = 0;
        
        for(int n : nums) {
            if(n != preV) {
                if(maxC < preC) {
                    maxC = preC;
                    maxV = preV;
                }
                preC = 1;
                preV = n;
            }else {
                preC++;
            }
        }
        return maxC > preC ? maxV : preV;
    }
}