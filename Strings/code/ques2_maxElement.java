import java.util.Scanner;

public class ques2_maxElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputarray = input.split(" ");

        int[] arrayElements = new int[inputarray.length];
        for (int i=0;i<inputarray.length;i++){
            arrayElements[i] = Integer.parseInt(inputarray[i]);
        }

        findmax(arrayElements)  ;
    }

    static void findmax(int[] arr){

        if (arr == null || arr.length == 0){
            return;
        }

        int maxElement=arr[0];
        int maxIndex = 0;

        for (int i=0;i< arr.length;i++){

            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(maxElement);
        System.out.println(maxIndex);

    }

}
