public class delete {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 2, 4};
        int n = arr.length;

        n = deleteHeap(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }


    }

    static int deleteHeap(int arr[],int n){

        int lastElement = arr[n - 1];
        arr[0] = lastElement;
        n = n-1;

        deleteHeapSort(arr,n,0);

        return n;
    }

    private static void deleteHeapSort(int[] arr, int n,int i) {

        int largest = i;
        int left = 2 * i+ 1;
        int right = 2 * i+ 2;

        if (left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            deleteHeapSort(arr, n, largest);
        }

    }

}
