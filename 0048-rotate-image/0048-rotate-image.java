class Solution {
    public void rotate(int[][] matrix) {
        int ro= matrix.length;
        int co= matrix[0].length;
        for(int i=0;i<ro;i++){
            for(int j=i;j<co;j++){
                int temp = matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
            }
        }
        for(int i=0;i<ro;i++){
            int left=0; int right= ro-1;
            while(left<right){
                int temp= matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]= temp;
                right--;
                left++;
            }
        }
    }
}