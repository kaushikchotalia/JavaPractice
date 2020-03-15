package CollectionsPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating Array List

        list.add("Kaushik");
        list.add("Tester1");
        list.add("Tester2");

        //Traversing list through iterator
        Iterator itr = list.iterator();

        while ((itr.hasNext()))
        {
            System.out.println(itr.next());
        }
    }
}
