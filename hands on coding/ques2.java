import java.util.Arrays;

public class ques2 {

    public static int[][] matrix = {
            {0, 1, 0, -1, 1},
            {1, 1, 1, 0, -1},
            {1, -1, 1, 1, 1},
            {0, 1, 1, 0, 1},
            {-1, 0, -1, 1, 1}
    };
    public static void main(String[] args) {
        int count = 1;
        if(matrix.length == 0){
            System.out.println("No values");
        }
        else if(matrix.length == 1){
            if (matrix[0][0] == 1){
                System.out.println(matrix[0][0]);
            }
            else{
                System.out.println("No diamonds");
            }
        }
        else {
            int topToBottom = getMaximumDiamond(count);
            int bottomToTop = getMaximumDiamond(++count);
            if (topToBottom + bottomToTop <= 0){
                System.out.println("No diamonds");
            }
            else {
                System.out.println(topToBottom + bottomToTop);
            }
        }
    }

    private static int getMaximumDiamond(int count) {
        int n = matrix.length;
        int maxValue = 0;
        int [][] maxMatrix = new int[n][n];
        maxMatrix[0][0] = matrix[0][0];
        for(int i = 0 ; i < n; i++){
            for (int j = 0; j < n; j++ ){

                if (i == 0 && j!=0){
                    maxMatrix[i][j] = maxMatrix[i][j-1] + matrix[i][j];
                    continue;
                }
                if (j == 0 && i != 0){
                    maxMatrix[i][j] = matrix[i][j] + maxMatrix[i-1][j];
                    continue;
                }
                if (i == 0 && j == 0){
                    continue;
                }
                maxMatrix[i][j] = Integer.max(maxMatrix[i-1][j],maxMatrix[i][j-1]) + matrix[i][j];

            }
        }
        if (count == 1){
            int i = n -1;
            int j = n - 1;
            while(i >= 0 && j >= 0){  //array index out of bound;
                try {
                    if(maxMatrix[i][j] - 1 == maxMatrix[i-1][j] && matrix[i-1][j] == 1){
                        matrix[i-1][j] = 0;
                        i--;
                    }
                    else{
                        matrix[i][j-1] = 0;
                        j--;
                    }
                }
                catch (ArrayIndexOutOfBoundsException ae){
                    i--;
                    j--;
                }
            }
            matrix[n-1][n-1] = 0;
        }
        maxValue = maxMatrix[n-1][n-1];

        return maxValue;
    }
}
