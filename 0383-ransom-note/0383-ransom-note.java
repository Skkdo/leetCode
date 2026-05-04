class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] letters = new char['z' - 'a' + 1];

        for(int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            if(letters[ransomNote.charAt(i) - 'a']-- <= 0) return false;
        }
        return true;
    }
}