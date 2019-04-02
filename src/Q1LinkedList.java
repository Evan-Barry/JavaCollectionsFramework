import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Q1LinkedList {

    public static void main(String[] args) {

        List<String> names = new LinkedList<String>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        System.out.println("Expected : [Kay, Jay, May, Fay]");
        System.out.println("Actual : " + names);

        ListIterator<String> it = names.listIterator();

//        it.next();
//        it.next();
//        it.next();
//
//        it.add("Ray");
//
//        System.out.println();
//        System.out.println("Expected : [Kay, Jay, May, Ray, Fay]");
//        System.out.println("Actual : " + names);

        while(it.hasNext())
        {
            String name = it.next();
            if(name.equals("May"))
            {
                it.add("Ray");
            }
        }

        System.out.println();
        System.out.println("Expected : [Kay, Jay, May, Ray, Fay]");
        System.out.println("Actual : " + names);

//        it.previous();
//        it.previous();
//        it.previous();
//        it.remove();

        while(it.hasPrevious())
        {
            it.previous();//return iterator to first element
        }

        while(it.hasNext())
        {
            String name = it.next();
            if(name.equals("Jay"))
            {
                it.remove();
            }
        }

        System.out.println();
        System.out.println("Expected : [Kay, May, Ray, Fay]");
        System.out.println("Actual : " + names);

        while(it.hasPrevious())
        {
            it.previous();
        }

        System.out.println();
        System.out.print("Display names with iterator :- \t");

        while(it.hasNext())
        {
            String name = it.next();
            System.out.print(name + "\t");
        }

        System.out.println();
        System.out.print("Display names with iterator backwards :- \t");

        while(it.hasPrevious())
        {
            String name = it.previous();
            System.out.print(name + "\t");
        }
    }

}
