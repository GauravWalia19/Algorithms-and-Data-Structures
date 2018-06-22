import java.util.*;
public class oneDarray
{
    public static void main(String[] args)
    {
        int n; //size of the array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        } 
        System.out.println("Elements of the 1d array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        in.close();
    }
}