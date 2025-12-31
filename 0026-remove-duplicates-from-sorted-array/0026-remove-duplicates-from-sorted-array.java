class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int num : nums) {
            if(num != nums[index]) {
                nums[++index] = num;
            }
        }
        return index + 1;
    }
}