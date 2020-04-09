package CollectionsPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

       /* The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
        The ArrayList class maintains the insertion order and is non-synchronized.
        The elements stored in the ArrayList class can be randomly accessed. Consider the following example.*/

       //List <data-type> list1= new ArrayList();

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();//Creating Array List

        ArrayList<String> list3 = new ArrayList();//Creating Array List

        List<Integer> list1 = new ArrayList();//Creating Array List

        List<String> list4 = new ArrayList<>();//Creating Array List

        list.add("Tester");
        list.add("Tester1");
        list.add("Tester2");

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list3.add("Tester3");
        list3.add("Tester4");
        list3.add("Tester5");

        list4.add("Tester6");
        list4.add("Tester7");
        list4.add("Tester8");

        //Traversing list through iterator
        Iterator itr = list.iterator();

        while ((itr.hasNext()))
        {
            System.out.println(itr.next());
        }
        System.out.println("----------------------------------------");


        Iterator itr1 = list1.iterator();

        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        System.out.println("----------------------------------------");

        Iterator itr2 = list3.iterator();

        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
        System.out.println("----------------------------------------");

        Iterator itr3 = list4.iterator();

        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }
    }
}
