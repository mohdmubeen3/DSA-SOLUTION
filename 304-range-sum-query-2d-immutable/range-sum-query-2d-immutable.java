class NumMatrix {
    int[][] pre;

    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int cl = matrix[0].length;
        pre = new int[r][cl];

 
        pre[0][0] = matrix[0][0];

         
        for (int i = 1; i < r; i++) {
            pre[i][0] = pre[i - 1][0] + matrix[i][0];
        }

      
        for (int j = 1; j < cl; j++) {
            pre[0][j] = pre[0][j - 1] + matrix[0][j];
        }

        
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < cl; j++) {
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int top = row1 > 0 ? pre[row1 - 1][col2] : 0;
   
        int left = col1 > 0 ? pre[row2][col1 - 1] : 0;
        int overlap = (row1 > 0 && col1 > 0) ? pre[row1 - 1][col1 - 1] : 0;

        return pre[row2][col2] - top - left + overlap;
    }
}