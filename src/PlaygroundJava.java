public class PlaygroundJava {
    public static void main(String [] args)
    {

        int[][] multi = new int[][]{
                { 0, 1, 1, 2 },
                { 0, 5, 0, 0 },
                { 2, 0, 3, 3 },

        };
       //System.out.println(matrixElementsSum(multi));
        System.out.println(champernowneDigit(11));
        System.out.println(hailstoneSequence(27));
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

   static int champernowneDigit(int n) {
        String number = "";

        for(int i = 1; i<=200 ; ++i){
            number = number + String.valueOf(i);

        }
        String s = number.substring(n - 1,n);
        return Integer.parseInt(s);
    }

   static int hailstoneSequence(int n) {
       int steps = 0;
       do{
           if(n%2 ==0){
               n = n/2;
               steps+=1;

           }
           else{
               n = 3*n+1;
               steps= steps + 1;
           }
       }
       while(n!=1);
       return steps;
    }
}
