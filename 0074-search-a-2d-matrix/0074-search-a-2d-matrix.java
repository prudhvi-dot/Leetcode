class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;

        int colMid = matrix[0].length/2;

        while(rowStart<rowEnd-1) {
            int mid = rowStart+(rowEnd-rowStart)/2;

            if(matrix[mid][colMid]==target) {
                return true;
            }
            else if(matrix[mid][colMid]>target) {
                rowEnd = mid;
            }
            else {
                rowStart = mid;
            }
        }

        if(binarySearch(matrix, rowStart, 0, matrix[0].length-1, target)) {
            return true;
        }

        return binarySearch(matrix, rowEnd, 0, matrix[0].length-1, target);
    }

    boolean binarySearch(int[][] arr, int row, int start, int end, int target) {
        while(start<=end) {
            int mid = start+(end-start)/2;

            if(arr[row][mid]==target) {
                return true;
            }
            else if(arr[row][mid]>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return false;
    }
}