package Day5;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();
        for(int num:nums){
            if(!temp.add(num)){
                duplicate.add(num);
            }
        }
        return duplicate;
    }
}