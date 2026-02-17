class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Set<Integer> rowsSet= new HashSet<>();
        Set<Integer> columnSet= new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0)
                {
                    rowsSet.add(i);
                    columnSet.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowsSet.contains(i) || columnSet.contains(j) ){
                matrix[i][j]=0;
            }
         }
        }
        
    }
}