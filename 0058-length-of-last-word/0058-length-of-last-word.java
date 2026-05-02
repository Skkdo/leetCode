class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean space = false;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                space = true;
            }else {
                if(space) {
                    length = 0;
                    space = false;
                }
                length++;
            }
        }
        return length;
    }
}