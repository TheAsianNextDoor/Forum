package zerocool;

import java.util.*;

public class ZeroCool {

    public List list = new ArrayList<String>();

    /**
     * The method creates an iterator that parses through the List instance
     * variable. The iterator will change multiples of 3 into "Cool", multiples
     * of 5 into "Zero", and multiples of 3 and 5 into "ZeroCool"
     */
    public void changeNumbers()
    {
        ListIterator it = list.listIterator();

        while (it.hasNext())
        {
            int num = Integer.parseInt((String) it.next());

            if (num % 3 == 0 && num % 5 == 0)
                it.set("ZeroCool");
            else if (num % 3 == 0)
                it.set("Zero");
            else if (num % 5 == 0)
                it.set("Cool");
        }
    }

    /**
     * Populates the List instance variable up to the size of the ListArray -
     * 100
     */
    public void populateArray()
    {
        for (int i = 0; i <= 100; i++)
            list.add(i + "");
    }

    /**
     * Reduces the size of the List instance variable, in order for JUnit to
     * test a smaller subsection of indeces. The method removes all but the
     * specified number of indices. Limit 100 (size of the List)
     *
     * @param num - The number of indices desired to be left in List instance
     * variable
     */
    public void reduceArraySize(int num)
    {
        for (int i = num; i < 100; i++)
            list.remove(num + 1);
    }

    public static void main(String[] args)
    {
        ZeroCool ob = new ZeroCool();
        ob.populateArray();
        ob.changeNumbers();

        System.out.println(Arrays.toString(ob.list.toArray()));

    }

}
