import java.util.ArrayList;

public class return_ArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};

//        System.out.println(findAllIndexes1(arr,4,0,new ArrayList<>()));
        ArrayList ans = findAllIndexes2(arr,4,0);
        System.out.println(ans);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexes(int[] arr,int target,int index){

        if (index == arr.length){
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }
        findAllIndexes(arr, target, index+1);
    }

    static ArrayList findAllIndexes1(int[] arr,int target,int index,ArrayList<Integer> list){

        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndexes1(arr, target, index+1,list);
    }

    static ArrayList findAllIndexes2(int[] arr,int target,int index){

        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = findAllIndexes2(arr, target, index+1);
        list.addAll(ansFromBelow);
        return list;
    }

}
