class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs[0].length();

        for(int i = 1; i < strs.length; i++) {
            String pre = strs[i - 1];
            String cur = strs[i];
            int preLen = pre.length();
            int curLen = cur.length();

            len = (len > preLen || len > curLen) ? (preLen > curLen ? curLen : preLen) : len;
            for(int j = 0; j < len; j++) {
                if(pre.charAt(j) != cur.charAt(j)) {
                    len = j;
                    break;
                }
            }
        }

        if(len == 0) return "";

        return strs[0].substring(0, len);
    }
}