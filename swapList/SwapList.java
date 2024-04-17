import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("strawberry");
        System.out.println("Initial list: " + list);

        swapFirstLast(list);
        System.out.println("Final list: " + list);
    }

     public static void swapFirstLast(ArrayList<String> list) {
         Collections.swap(list, 0, list.size() - 1);
     }
}
