import java.util.Map;
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int right = 0;
        int left = 0;
        int maxlen = 0;

        while (right < s.length()) {

            char currchar = s.charAt(right);

            if (map.containsKey(currchar)) {

                int currCharIdx = map.get(currchar);

                if (currCharIdx >= left) {
                    left = currCharIdx + 1;
                }
            }

            maxlen = Math.max(maxlen, right - left + 1);

            map.put(currchar, right);

            right++;
        }

        return maxlen;
    }
}