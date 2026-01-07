class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] answer = new int[mat.length * mat[0].length];
        boolean direction = true;  // true : up, false : down
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = mat[y][x];
            
            if(direction) {
                if(y - 1 >= 0 && x + 1 < mat[0].length) {
                    y = y - 1;
                    x = x + 1;
                }else if(x + 1 < mat[0].length) {
                    x = x + 1;
                    direction = false;
                }else if(y + 1 < mat.length) {
                    y = y + 1;
                    direction = false;
                }
            }else {
                if(y + 1 < mat.length && x - 1 >= 0) {
                    y = y + 1;
                    x = x - 1;
                }else if(y + 1 < mat.length) {
                    y = y + 1;
                    direction = true;
                }else if(x + 1 < mat[0].length) {
                    x = x + 1;
                    direction = true;
                }
            }
        }
        return answer;
    }
}