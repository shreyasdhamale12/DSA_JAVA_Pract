package DSA_pract;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] str = new String[5];
//        for(int i=0;i< str.length;i++){
//            str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));

//        int[][] arr = new int[3][3];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr.length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        for (int[] a :arr) {
//            System.out.println(Arrays.toString(a));
//        }
        int[][] arr1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

    }
}
