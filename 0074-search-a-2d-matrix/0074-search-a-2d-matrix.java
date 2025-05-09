class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;

        int colEnd = matrix[0]-1;
        int colStart = 0;

        int colMid = colStart+colEnd/2;
        while(rowStart<rowEnd-1) {
            int rowMid = rowStart+rowEnd/2;

            if(matrix[rowMid][colMid]>target) {
                rowEnd = rowMid;
            }
            else {
                rowStart = rowMid;
            }
        }
    }
}