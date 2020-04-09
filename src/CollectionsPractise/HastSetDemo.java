package CollectionsPractise;

import java.util.HashSet;
import java.util.Iterator;

public class HastSetDemo {
    public static void main(String[] args) {
        //Creating HasSet
        HashSet<String> set = new HashSet<String>();

        //Adding elements to HasSet

        set.add("Tester1");
        set.add("Tester1");
        set.add("Tester2");
        set.add("Tester3");
        set.add("Tester3");

        //Traversing elements through Iterator

        Iterator itr = set.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}

