package Day 11;
import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {  
        List<String> ans = new ArrayList<>();  
        Helper(n, n, "", ans);  
        return ans;  
    }  

    private void Helper(int left, int right, String s, List<String> ans) {  
        
        if (left == 0 && right == 0) {  
            ans.add(s);  
            return;  
        }  

        
        if (left > 0) {  
          Helper(left - 1, right, s + "(", ans);  
        }  

        
        if (right > left) {  
           Helper(left, right - 1, s + ")", ans);  
        }  
    }  
}