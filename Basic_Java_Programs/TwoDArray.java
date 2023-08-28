package Basic_Java_Programs;

public class TwoDArray {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int numbers[][] = new int[rows][cols];

        // //input
        // for(int i=0; i<rows; i++){
        // for(int j=0; j<cols; j++){
        // numbers[i][j] = sc.nextInt();
        // }
        // }

        // int x = sc.nextInt();

        // for(int i=0; i<rows; i++){
        // for(int j=0; j<cols; j++){
        // if(numbers[i][j] == x){
        // System.out.println("x occurs in " + i + " th row and " + j + " th column");
        // }
        // }
        // }

        int[][] array2D = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Iterate through rows
        for (int i = 0; i < array2D.length; i++) {
            // Iterate through columns
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
