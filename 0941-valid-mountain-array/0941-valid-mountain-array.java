class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean up = false;
        boolean down = false;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == arr[i]) {
                return false;
            }
            
            if(arr[i - 1] < arr[i]) {
                if(down) {
                    return false;
                }
                up = true;
            }
            
            if(arr[i - 1] > arr[i]) {
                if(!up) {
                    return false;
                }
                down = true;
            }
        }
        return up && down;
    }
}