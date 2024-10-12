import java.util.Scanner;

public class print_star {
    public static void main(String[] args) {

//        pattern31(4);

       int m;

        for (int i = 3; i != 0 ; i--) {
            System.out.println(i);
            i = i-1;
        }

    }

    static void pattern1(int n){
        for (int row =1;row<=n;row++){
            for (int col=0;col<row;col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        for (int i=0;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern4(int n){

        for (int i=0;i<n;i++){
            for (int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        // Print the top half including the middle row
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the bottom half excluding the middle row
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern28(int n){

     for (int row=0;row<n*2;row++) {
         int no_ofCol = row > n ? 2 * n - row : row;

         int no_ofSpaces = n - no_ofCol;
         for (int s=0;s<no_ofSpaces;s++){
             System.out.print(" ");
         }

         for (int col = 1; col <= no_ofCol; col++) {
             System.out.print("* ");
         }
         System.out.println();
     }
    }

    static void pattern30(int n){

        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row ; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
    }

    static void pattern17(int n){

        for (int row = 1; row <= 2 * n; row++) {

            int no_ofCol = row > n ? 2 * n -row: row;
            for (int spaces = 0; spaces < n-no_ofCol ; spaces++) {
                System.out.print("  ");
            }

            for (int col = no_ofCol; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= no_ofCol; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void  pattern31(int n){

        int originalNo = n;
        n= 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int ROWandCOL = originalNo - Math.min(Math.min(row,col), Math.min(n - row, n - col));
                System.out.print(ROWandCOL + " ");
            }
            System.out.println();

        }

    }



}
