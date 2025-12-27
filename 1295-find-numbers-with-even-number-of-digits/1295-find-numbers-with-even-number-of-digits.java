class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        
        for(int n : nums) {
            int digits = (int) Math.log10(n) + 1;
            evenCount = digits % 2 == 0 ? evenCount + 1 : evenCount;
        }
        return evenCount;
    }
}