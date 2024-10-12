package DSA_pract;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMultiD {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. row by row. TO print output,input a empty line ");

        while (true){
            String line = sc.nextLine().trim();

            if (line.isEmpty()){
                break;
            }

            String[] tokens = line.split("\\s+");
            ArrayList<Integer> row = new ArrayList<>();

            for (String token :tokens) {
                row.add(Integer.parseInt(token));
            }
            arr.add(row);

        }
        System.out.println("Entered 2D array: ");
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> row = arr.get(i);
            for (int j = 0; j < row.size(); j++) {
                Integer num = row.get(j);
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
