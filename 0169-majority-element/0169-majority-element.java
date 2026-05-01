class Solution {
    public int majorityElement(int[] nums) {
            int v = 0;
            int c = 0;

            for(int n : nums) {
                if(c == 0) {
                    v = n;
                }
                c += n == v ? 1 : -1;
            }
            return v;
    }
}