class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        for(int i=0; i< matrix.length; i++){
            if(target == matrix[i][0]) return true;
            else if(target > matrix[i][0] && target <= matrix[i][n-1])
            {
                for(int j = 1; j <matrix[i].length; j++){
                    if(target == matrix[i][j])
                        return true;
                }
                return false;
            }
        }
        return false;
    }
}