class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows = matrix.length, cols = matrix[0].length;

        // Step 1: Find the correct row
        int row = -1;
        for (int i = 0; i < rows; i++) {
            if (target <= matrix[i][cols - 1]) {
                row = i;
                break;
            }
        }

        // Target is bigger than every element
        if (row == -1) return false;

        // Step 2: Binary search within that row
        int left = 0, right = cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false; 
    }
}
