import java.util.Scanner;

public class binary_operation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();
        String op = sc.nextLine();

        String operation = binary_op(ip1,ip2,op);
        System.out.println(operation);


    }

    static String binary_op(String input1,String input2,String operation){

       int maxLength = Math.max(input1.length(),input2.length());
       input1 = String.format("%"+maxLength+"s",input1).replace(' ','0');
       input2 = String.format("%"+maxLength+"s",input2).replace(' ', '0');

       String result = "";

        for (int i = 0; i < maxLength; i++) {

            char bin1 = input1.charAt(i);
            char bin2 = input2.charAt(i);

       switch (operation.toUpperCase()){

           case "AND":
               result += (bin1 == '1' && bin2 == '1') ? '1':'0';
               break;
           case "OR":
               result += (bin1 == '1' || bin2 == '1') ? '1':'0';
               break;
           case "XOR":
               result += (bin1 != bin2) ? '1':'0';
               break;
           default:
               throw new IllegalArgumentException(operation);
       }

    }
        return result;
    }


}
