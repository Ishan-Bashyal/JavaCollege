
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCreation {

    static void printList(ArrayList<String> list){

    }
    static ArrayList<String> returnArrayList(){
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        //ArrayList<datatype> variableName= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        String[] stringArray= {"Max","Kev"};
        ArrayList<String> list1= 
        new ArrayList<>(Arrays.asList(stringArray));
        list.add(7);
        list.add(5);
        list.set(0, 8);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(1);
        list1.remove("Max");
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(8));
        list.clear();
    }
}
