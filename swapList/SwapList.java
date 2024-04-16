import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("strawberry");
        System.out.println("Initial list: " + list);

        //swaps according to the indexes
        Collections.swap(list, 0, 2);
        System.out.println("Final list: " + list);

    }
}