public class Transpose {
    public static void printmatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void trans(int matrix[][], int transmatrix[][]) {
        for(int i = 0; i < transmatrix.length; i++) {
            for(int j = 0; j < transmatrix[i].length; j++) {
                transmatrix[i][j] = matrix[j][i];
            }
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int transmatrix[][] = new int[matrix[0].length][matrix.length];
        trans(matrix,transmatrix);
        printmatrix(matrix);
        printmatrix(transmatrix);
    }
}
