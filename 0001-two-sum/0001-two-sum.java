class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
           int key = target - nums[i];
           if(!map.containsKey(key)) continue;

           int keyIndex = map.get(key);
           if(keyIndex == i) continue;

           answer[0] = i;
           answer[1] = keyIndex;
           return answer;
        }
        return answer;
    }
}