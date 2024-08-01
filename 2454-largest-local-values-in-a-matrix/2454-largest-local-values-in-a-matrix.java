class Solution {
    public int[][] largestLocal(int[][] grid) {
        int a[][]=new int[grid.length-2][grid.length-2];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<grid.length-2;i++)
        {
            for(int j=0;j<grid[i].length-2;j++)
            {
                max=Integer.MIN_VALUE;
                for(int k=0;k<3;k++)
                {
                    for(int l=0;l<3;l++)
                    {
                        if(max<grid[k+i][l+j])
                        {
                            max=grid[k+i][l+j];
                        }
                    }
                }
            a[i][j]=max;
            }
        }
        return a;
    }
}