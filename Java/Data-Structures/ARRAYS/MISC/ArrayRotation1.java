/*
 *  ARRAY ROTATION USING TEMP ARRAY
 *  LEFT ROTATE TO 2
 */
import java.util.*;
public class ArrayRotation1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int shift=2;

        rotate(arr,shift,arr.length);
        
        in.close();
    }
    public static void rotate(int[] arr,int d,int n)
    {
        int[] temp = new int[d];
        //copy arr 2 elements to temp
        for(int i=0;i<temp.length;i++)
        {
            temp[i] = arr[i];
        }
        //shifting array
        for(int i=0;i<arr.length-d;i++)
        {
            arr[i]=arr[i+d];
        }
        //copy temp array to array
        for(int i=0;i<d;i++)
        {
            arr[i+arr.length-d] =temp[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   
}