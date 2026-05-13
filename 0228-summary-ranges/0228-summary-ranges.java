class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0) return list;

        Integer start = null;
        Integer end = null;
        int stack = 0;

        for(int i = 0; i < nums.length; i++) {
            if(start == null) {
                start = nums[i];
                stack++;
                continue;
            }   
            if(nums[i] - start == stack) {
                end = nums[i];
                stack++;
                continue;
            }
            list.add(makeString(start, end));
            start = nums[i];
            end = null;
            stack = 1;
        }
        list.add(makeString(start, end));
        return list;
    }

    public String makeString(Integer start, Integer end) {
        if(end == null) {
            return start.toString();
        }
        return start.toString() + "->" + end.toString();
    }
}