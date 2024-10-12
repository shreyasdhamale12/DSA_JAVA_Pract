import java.util.Arrays;

    public class CustomArraylist{

        private int[] data;
        private static int default_size = 2;
        private int size;


        public CustomArraylist(){
            this.data = new int[default_size];
        }

        public void add(int num){
            if (isFull()){
                resize();
            }
            data[size++] = num;
        }

        private boolean isFull() {
            return size == data.length;
        }

        private void resize() {
            int temp[] = new int[size+1];

            for (int i=0;i< data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        private int remove(){
            int removed = data[--size];
            return removed;
        }

        private int get(int index){
            return data[index];
        }

        private void set(int index,int value){
            data[index] = value;
        }

//        public int size(){
//            return size;
//        }

        @Override
        public String toString() {
            return "CustomArraylist{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }





    public static void main(String[] args) {
    CustomArraylist list  = new CustomArraylist();
//    list.add(5);
//    list.add(3);
//    list.add(9);
//    list.add(9);
//    list.add(9);

        for (int i=0;i<13;i++){
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
