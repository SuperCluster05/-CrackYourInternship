package Day7;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int maxSum = 0;
        int end = cardPoints.length - 1;
        int start = k - 1;

        for(int i = 0; i < k; i++) {
            sum = sum + cardPoints[i];
        }

        maxSum = sum;

        while(start >= 0) {
            sum = sum + cardPoints[end] - cardPoints[start];
            end--;
            start--;
            if(sum > maxSum) {
                maxSum = sum;
            }
        } 


        return maxSum;
    }
}