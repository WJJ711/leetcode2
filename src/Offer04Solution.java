public class Offer04Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0){
            return false;
        }
        int i=0,j=matrix[0].length-1;
        while (i<matrix.length&&j>=0){
            if (target==matrix[i][j]){
                return true;
            }
            if (target>matrix[i][j]){
                i++;
            }else {
                j--;
            }

        }
        return false;
    }
}