package Day3;

class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int maxArea = 0;
       int left = 0;
       int right = n-1;
       
       while(left < right){
        int width = right - left ;
        int area = Math.min(height[left], height[right])* width;
        maxArea = Math.max(maxArea,area);

        if(height[left]<height[right]){
        left++;
       }else{
        right--;
       }

       } 
      
       return maxArea;
    }
    
}