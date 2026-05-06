class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(key)) {
                if (!map.get(key).equals(word)) return false;
            } else {
                if (map.containsValue(word)) return false;
                map.put(key, word);
            }
        }

        return true;
    }
}