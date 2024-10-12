public class patterns {
    public static void main(String[] args) {

        int n = 1;
        numbers(n);

    }

    static void numbers(int n){
        for (int i = 0; i < 10; i++) {
            for (int j = 1;j<=i;j++){
                System.out.print(n + " ");
                n++;
                if (n > 10){
                    break;
                }
            }
            System.out.println();
            if (n > 10){
                break;
            }
        }
    }

    static void print_star(int n){
// Left to right
        for (int i=1;i<=3;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void print_star1(int n){
// Right to left
        for (int i=1;i<=3;i++){
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
