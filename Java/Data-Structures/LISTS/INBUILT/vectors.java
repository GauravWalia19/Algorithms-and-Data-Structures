import java.util.*;
public class vectors
{
    public static void main(String[] args)
    {
        //this is threadsafe arraylist
        Vector<Integer> arr = new Vector<Integer>();
        arr.ensureCapacity(11); //ensures the capacity
        System.out.println(arr.capacity());
        System.out.println(arr.size());
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        //arr.clear();
        //creating arraylist
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(0);
        array.add(2);
        array.add(1000);
        arr.addAll(array);

        System.out.println(arr.lastIndexOf(2));
        arr.remove(0); //remove the element at the index
        System.out.println(arr.isEmpty());
        System.out.println(arr.indexOf(1000));
        System.out.println(arr.contains(1000));
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}