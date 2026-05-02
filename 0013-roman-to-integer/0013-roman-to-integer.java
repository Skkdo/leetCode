import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int sum = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = s.length() - 1; i >= 0; i--) {
            char roman = s.charAt(i);
            int v = map.get(roman);

            if(i > 0) {
                char pre = s.charAt(i - 1);
                int preV = map.get(pre);

                if(((roman == 'V' || roman == 'X') && pre == 'I') ||
                   ((roman == 'L' || roman == 'C') && pre == 'X') ||
                   ((roman == 'D' || roman == 'M') && pre == 'C')  
                ) {
                    sum += v - preV;
                    i--;
                    continue;
                }
            }
            sum += v;
        }
        return sum;
    }
}