public class PlaygroundJava {
    public static void main(String [] args)
    {

        int[][] multi = new int[][]{
                { 0, 1, 1, 2 },
                { 0, 5, 0, 0 },
                { 2, 0, 3, 3 },

        };
       System.out.println(matrixElementsSum(multi));
    }

    public static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for(int col = 0 ; col < matrix.length; col++){
            for(int row = 0; row< matrix[col].length; row++){
                if(matrix[col][row] == 0){
                    for(int aux = col; aux< matrix.length;aux++){
                        matrix[aux][row] = 0;
                    }
                }
                else{
                    sum += matrix[col][row];
                }
            }
        }
        return sum;
    }
}
