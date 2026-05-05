class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] map = new char[128];
        boolean[] isMapped = new boolean[128];

        for(int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i)] == 0) {
                if(isMapped[t.charAt(i)]) return false;
                map[s.charAt(i)] = t.charAt(i);
                isMapped[t.charAt(i)] = true;
            }else {
                if(map[s.charAt(i)] != t.charAt(i)) return false;
            }
        }
        return true;
    }
}