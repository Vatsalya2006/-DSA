class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int left = 0;
        int right = m - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Find maximum element in column mid
            int maxRow = 0;

            for (int row = 0; row < n; row++) {
                if (mat[row][mid] > mat[maxRow][mid]) {
                    maxRow = row;
                }
            }

            // Values of left and right neighbours
            int leftValue = mid > 0 ? mat[maxRow][mid - 1] : -1;
            int rightValue = mid < m - 1 ? mat[maxRow][mid + 1] : -1;

            // We found a peak
            if (mat[maxRow][mid] > leftValue &&
                mat[maxRow][mid] > rightValue) {

                return new int[]{maxRow, mid};
            }

            // Move towards the larger neighbour
            if (leftValue > mat[maxRow][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}