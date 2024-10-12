import java.util.Scanner;

public class ques3_bricks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        findbricks(n);
    }

    static void findbricks(int n){

        int bricks = n*(1 + 3*n)/2;
        System.out.println(bricks);

    }
}
