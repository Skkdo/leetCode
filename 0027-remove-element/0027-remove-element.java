class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end) {
            if(nums[start] != val) {
                start++;
                continue;
            }
            if(nums[end] == val) {
                end--;
                continue;
            }
        
            nums[start] = nums[end];
            start++;
            end--;
        }
        
        return start;
    }
}