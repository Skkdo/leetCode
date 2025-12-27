class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int index = nums.length - 1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int sqLeft = nums[left] * nums[left];
            int sqRight = nums[right] * nums[right];
            
            if(sqLeft > sqRight) {
                answer[index--] = sqLeft;
                left++;
            }else {
                answer[index--] = sqRight;
                right--;
            }
        }
        
        return answer;
    }
}