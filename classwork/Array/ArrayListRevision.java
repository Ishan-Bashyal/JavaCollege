
import java.util.ArrayList;

public class ArrayListRevision{
    static ArrayList<Integer> methodName(ArrayList<Integer> list){
        return list;
    } 
    
    public static void main(String[] args) {
        int[] array1= new int[5];
        ArrayList<Integer> list= new ArrayList<>();
        array1[0]=5;
        list.add(5);
        list.add(10);
        list.set(0, 15);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(array1.length);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int val:list){

        }
        methodName(list);
        ArrayList<Integer> newList=methodName(list);
        
    }
}



    

