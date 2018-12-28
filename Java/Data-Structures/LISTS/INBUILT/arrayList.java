import java.util.*;
public class arrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<Integer>(); //created arraylist
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3,5);
        array.set(1,-4);

        System.out.println(array.indexOf(2));
        System.out.println(array.contains(9));
        array.remove(0);
        System.out.println(array.isEmpty());
        for(int i=0;i<array.size();i++)
        {
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }
}