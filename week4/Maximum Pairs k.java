class Solution {
    public int maxOperations(int[] nums, int k) {  
       Arrays.sort(nums);
       int i = 0, j = nums.length - 1;
       int cnt = 0;
       while(i < j){
           if(nums[i] + nums[j] < k ) i++;
           else if(nums[i] + nums[j] > k ) j--;
           else if(nums[i] + nums[j] == k ){
               i++; j--; cnt++;
           }
           
       }
       return cnt;
   }
}