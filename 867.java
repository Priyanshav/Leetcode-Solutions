public class 867 {
    class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] transMatrix = new int[c][r];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                transMatrix[j][i] = matrix[i][j];
            }
        }

        return transMatrix;
    }
}
}
