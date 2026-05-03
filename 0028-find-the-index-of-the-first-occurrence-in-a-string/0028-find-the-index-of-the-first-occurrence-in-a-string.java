class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) != needle.charAt(0)) continue;

            int move = 0;
            boolean equl = true;
            for(int j = 1; j < needle.length(); j++) {
                if(move == 0 && haystack.charAt(i + j) == needle.charAt(0)) move = j;

                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    equl = false;
                    i += move == 0 ? j - 1 : move - 1;
                    break;
                }
            }
            if(equl) return i; 
        }
        return -1;
    }
}