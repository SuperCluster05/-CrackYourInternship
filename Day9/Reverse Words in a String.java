package Day9;

class Solution {
    public String reverseWords(String s) {
         int left = 0;  
        int right = s.length() - 1;  

        String temp = "";  
        String ans = "";  

        
        while (left <= right) {  
            char ch = s.charAt(left);  
            if (ch != ' ') {  
                temp += ch; 
            } else if (!temp.isEmpty()) {  
                
                ans = temp + (ans.isEmpty() ? "" : " ") + ans;   
                temp = ""; 
            }  
            left++;  
        }  

         
        if (!temp.isEmpty()) {  
            ans = temp + (ans.isEmpty() ? "" : " ") + ans;  
        }  

        return ans.trim(); 
    }  

}
