class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;

        for(int i = 0; i<k; i++) {
            sum+=cardPoints[i];
        }

        int max = sum;

        int right = cardPoints.length-1;

        for(int j = k-1; j>=0; j--) {
            sum-=cardPoints[j];
            sum+=cardPoints[right--];

            max = Math.max(max,sum);
        }

        return max;
    }
}