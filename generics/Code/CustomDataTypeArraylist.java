import java.util.Arrays;

public class CustomDataTypeArraylist<T extends Number> {
    private Object[] data;
    private static int default_size = 2;
    private int size;


    public CustomDataTypeArraylist(){
        this.data = new Object[default_size];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object temp[] = new Object[size+1];

        for (int i=0;i< data.length;i++){
            temp[i] = (T)(data[i]);
        }
        data = temp;
    }

    private T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    private T get(int index){
        return (T) data[index];
    }

    private void set(int index,T value){
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
        CustomDataTypeArraylist<Integer> list  = new CustomDataTypeArraylist();
    list.add(5);
    list.add(123);
    list.add(9);
    list.add(9);
    list.add(9);

//        for (int i=0;i<13;i++){
//            list.add(2 * i);
//        }

        System.out.println(list);
    }
}
