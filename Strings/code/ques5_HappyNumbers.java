import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ques5_HappyNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isHappyNumbers(n));

    }

    static int sumofSquareofDigit(int n){

        int sum = 0;
        while(n>0){
            int digit = n %10;
            sum = sum + digit * digit;
            n = n/10;
        }
        return sum;
    }

    static boolean isHappyNumbers(int n){

        Set<Integer> seen = new HashSet<>();
         while (n != 1 && !seen.contains(n)){
             seen.add(n);
             n = sumofSquareofDigit(n);
         }
        return n ==1;
    }

}
