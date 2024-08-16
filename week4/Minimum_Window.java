import java.util.HashMap;  

public class Solution {  
    public String minWindow(String s, String t) {  
        if (t.length() == 0) return "";  
        
        HashMap<Character, Integer> mpt = new HashMap<>();  
        HashMap<Character, Integer> mps = new HashMap<>();  
        
        for (char c : t.toCharArray()) {  
            mpt.put(c, mpt.getOrDefault(c, 0) + 1);  
        }  
        
        int cur = 0, total = mpt.size();  
        int i = 0, j = 0;  
        int res = Integer.MAX_VALUE;  
        int start = -1; // Keep track of the start index of the minimum window  
        
        while (j < s.length()) {  
            char currentChar = s.charAt(j);  
            if (mpt.containsKey(currentChar)) {  
                mps.put(currentChar, mps.getOrDefault(currentChar, 0) + 1);  
                if (mps.get(currentChar).equals(mpt.get(currentChar))) {  
                    cur++;  
                }  
            }  

            while (cur == total) {  
                if (j - i + 1 < res) {  
                    res = j - i + 1;  
                    start = i; // update start index  
                }  
                // shrink the window  
                char leftChar = s.charAt(i);  
                if (mps.containsKey(leftChar)) {  
                    mps.put(leftChar, mps.get(leftChar) - 1);  
                    if (mps.get(leftChar) < mpt.get(leftChar)) {  
                        cur--;  
                    }  
                }  
                i++;  
            }  
            j++;  
        }  
        
        if (res == Integer.MAX_VALUE) return "";  
        return s.substring(start, start + res); // Extract the substring from start to end of minimum window  
    } 
}
