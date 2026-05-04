class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;

            for(; index < t.length(); index++) {
                if(ch == t.charAt(index)) {
                    found = true;
                    index++;
                    break;
                }
            }

            if(!found) return false;
        }
        return true;
    }
}