import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(findNumber(n));

    }

    static int findNumber(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 1 == 0 && i % 2 == 0 && i % 4 == 0 && i % 8 == 0 && i % 10 != 0){
                count++;
            }
        }
        return count;
    }

}
