package Day2;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int curr_Sum = 0;
        int[] SumModk  = new int[k];
        SumModk[0] =1;
        int count = 0;

        for(int start : nums){
            curr_Sum = (curr_Sum + start)%k;

            if(curr_Sum <0){
                curr_Sum += k;
            }
            count += SumModk[curr_Sum];
            SumModk[curr_Sum]++;
            
        }
        return count;
        
    }
}