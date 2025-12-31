class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> exist = new HashSet<>();
        
        for(int num : arr) {
            if(exist.contains(num * 2)) {
                return true;
            }
            if(num % 2 == 0 && exist.contains(num / 2)) {
                return true;
            }
            exist.add(num);
        }
        
        return false;
    }
}