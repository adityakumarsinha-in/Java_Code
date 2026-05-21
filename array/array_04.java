//Write a program to,add two matrices ofsign 2(row) X 3(coloumn).
class array_04 {

    public static void main(String[] args) {
        int[][] mat1 = {{4, 8, 10},
                         {2, 6, 8}};
        int[][] mat2 = {{5, 10, 15},
                        {15, 30, 50}};
        int[][] result = {{0, 0, 0},
                         {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("");
    }
}
