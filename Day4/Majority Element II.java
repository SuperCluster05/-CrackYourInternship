package Day4;

import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        Set<Integer> keySet   = map.keySet();
        for(Integer key : keySet){
            if(map.get(key)>nums.length/3){
                result.add(key);
            }
        }
        return result;
        
    }
    
}