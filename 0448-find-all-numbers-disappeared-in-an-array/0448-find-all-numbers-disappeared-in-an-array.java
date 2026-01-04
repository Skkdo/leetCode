class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new LinkedList<>();
        
        for(int num : nums) {
            if(nums[Math.abs(num) - 1] > 0) {
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                answer.add(i + 1);
            }
        }
        
        return answer;
    }
}