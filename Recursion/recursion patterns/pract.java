public class pract {
    public static void main(String[] args) {

        int n=4;
//        recursion(4,0);
//        normalTriangle(n);

        normalTriangleUsingRecursion(4, 0);


    }
//    static void brutforce(int n){
//        for (int i = n; i >= 0; i--) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static void recursion(int row,int col) {
//
//        if (row == 0) {
//            return;
//        }
//        if (col < row) {
//            System.out.print("*");
//            recursion(row, col + 1);
//        } else {
//            System.out.println();
//            recursion(row - 1, 0);
//        }
//    }

    static void normalTriangleUsingBruteForce(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void normalTriangleUsingRecursion(int row,int col){
        if (row == 0) {
            return;
        }
        if (col < row) {
            normalTriangleUsingRecursion(row, col + 1);
            System.out.print("*");
        } else {
            normalTriangleUsingRecursion(row - 1, 0);
            System.out.println();
        }
    }

}
