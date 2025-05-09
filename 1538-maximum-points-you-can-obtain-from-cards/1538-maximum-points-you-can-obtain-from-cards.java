class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;

        for(int i = 0; i<k; i++) {
            sum+=cardPoints[i];
        }

        int max = sum;

        int leftSum = max;;
        int right = cardPoints.length-1;
        int rightSum = 0;

        for(int j = k-1; j>=0; j--) {
            leftSum-=cardPoints[j];
            rightSum+=cardPoints[right--];

            max = Math.max(max, leftSum+rightSum);
        }

        return max;
    }
}