import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        if(nums== null || nums.length == 0){
                return false;
            }
        int pos = 0;
        for(int i = 0;i<nums.length;i++){
            if(i> pos){
                return false;
            }
           
            
           pos = Math.max(pos,i+nums[i]);
          
          if(pos >= nums.length-1){
            return true;
          }
           
        }
        return pos >= nums.length-1;
        
    }
}