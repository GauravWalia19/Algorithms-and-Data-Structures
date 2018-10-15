import java.util.Arrays;
public class arrays
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9,10};

        //equals(int[],int[]) method
        System.out.println(Arrays.equals(arr,b));
        
        //toString(int[])
        System.out.println(Arrays.toString(arr));
        
        //fill()
        Arrays.fill(b,10);
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        //sort()
        int[] c={34,23,35,23,1};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        
        //binarySearch()
        System.out.println(Arrays.binarySearch(c, 23));
        
        //copyOf()
        int[] newarr = Arrays.copyOf(c, 2);
        System.out.println(Arrays.toString(newarr));
    }
}