package list;

import java.util.Vector;

public class VectorExample2
{


    public static void main(String[] args)
    {
        Vector<Integer> v=new Vector<>();
        v.add(2);
        v.add(new Integer(3));
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v.contains(new Integer(2)));



    }


}
