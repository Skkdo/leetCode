class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int consecutive = 0;
        
        for(int n : nums) {
            if(n == 1) {
                consecutive++;
                maxConsecutive = Math.max(maxConsecutive, consecutive);
            } else {
                consecutive = 0;
            }
        }
        return maxConsecutive;
    }
}