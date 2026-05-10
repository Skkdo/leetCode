class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        while(n != 1) {
            int sum = 0;

            while(n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;    
            }
            if(map.containsKey(sum)) return false;
            map.put(sum, true);
            n = sum;
        }
        return true;
    }
}