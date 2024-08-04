class Solution {  
    static int prime = (int) (Math.pow(10, 9) + 7);  

    public int numDistinct(String s, String t) {  
        int n = s.length();  
        int m = t.length();  

        int[] prev = new int[m + 1];  
        prev[0] = 1; 
        for (int i = 1; i <= n; i++) {  
            for (int j = m; j >= 1; j--) {  
                if (s.charAt(i - 1) == t.charAt(j - 1)) {  
                    // If characters match, add ways from both including and excluding the current character  
                    prev[j] = (prev[j - 1] + prev[j]) % prime;  
                }  
                // If characters don't match, prev[j] remains unchanged 
                else{
                    prev[j] = prev[j];
                } 
            }  
        }  
        
        return prev[m]; // The result is the number of distinct subsequences that match the entire t  
    }  
}
