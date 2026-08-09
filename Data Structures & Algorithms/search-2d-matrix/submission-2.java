class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l1 = 0, l2 = 0, r1 = matrix.length-1, r2 = matrix[0].length-1;
        while(l1 <= r1 && l2 <= r2) {
            int m1 = l1 + (r1 - l1) / 2;
            int m2 = l2 + (r2 - l2) / 2;
            if(matrix[m1][m2] == target) return true;
            else if(matrix[m1][m2] < target) {
                if(m2 == matrix[0].length-1) {
                    l1 = m1+1;
                    l2 = 0;
                }
                else {
                    l2 = m2+1;
                }
            }
            else {
                if(m2 == 0) {
                    r1 = m1-1;
                    r2 = matrix[0].length-1;
                }
                else {
                    r2 = m2-1;
                }
            }
        }
        return false;
    }
}
