package Day2;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int curr_Sum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);

        for (int num : nums) {
            curr_Sum += num;

            if (sumMap.containsKey(curr_Sum - k)) {
                count += sumMap.get(curr_Sum - k);
            }

            sumMap.put(curr_Sum, sumMap.getOrDefault(curr_Sum, 0) + 1);
        }

        return count;
    }



        
       

        
       
            
    

}