package Day10;
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String ,List<String>> map = new HashMap<>();

       
        for (String word : strs) {  
            
            char[] chArr = word.toCharArray();  
            Arrays.sort(chArr);  
            
            String newWord = new String(chArr);  

            
                        if (map.containsKey(newWord)) {  
                map.get(newWord).add(word);  
            } else {  
                List<String> words = new ArrayList<>();  
                words.add(word);  
                map.put(newWord, words);  
            }  
        }  

        
        return new ArrayList<>(map.values());  
    }  
}