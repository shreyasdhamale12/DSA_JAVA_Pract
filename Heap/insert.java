public class insert {
    public static void main(String[] args) {

        int arr[] = new int[100];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;
        int n = 5;
        int key = 15;
        n = insertHeap(arr,n,key);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }

    static int insertHeap(int arr[],int n,int key){

        n = n+1;

        arr[n-1] = key;

        sortHeap(arr,n,n - 1);

        return n;
    }

    private static void sortHeap(int[] arr, int n, int i) {

        int parent = (i-1)/2;

        if (parent >= 0){
            if (arr[i] > arr[parent]){
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;

                sortHeap(arr, n, parent);

            }
        }

    }

}
