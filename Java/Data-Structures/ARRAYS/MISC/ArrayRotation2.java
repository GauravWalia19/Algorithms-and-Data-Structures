/*
 *  ARRAY ROTATION USING ONE ELEMENT
 *  LEFT ROTATE BY 2
 */
import java.util.*;
public class ArrayRotation2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};  
        int shift=3;     
        rotate(arr, shift, arr.length);

        //printing array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    public static void rotate(int[] arr,int d,int n)
    {
        //we can shift one by one    
        for(int i=0;i<d;i++)
        {
            int temp = arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
    }
}