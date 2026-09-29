class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] copy = new int[rows][cols];

        if(rows == 0)
        {
            return;
        }
        
        for(int row = 0; row < rows; row++)
        {
            for(int col = 0; col < cols; col++)
            {
                copy[row][col] = matrix[row][col];
            }
        }

        for(int row = 0; row < rows; row++)
        {
            for(int col = 0; col < cols; col++)
            {
                if(copy[row][col] == 0)
                {
                    for(int c = 0; c < cols; c++)
                    {
                        matrix[row][c] = 0;
                    }
                    for(int r = 0; r < rows; r++)
                    {
                        matrix[r][col] = 0;
                    }
                }
            }
        }
    }
}