import java.util.*;
public class threeDarray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int l=0;  //length of cubiod
        int b=0; //breadth of cubiod
        int h=0; //height of cubiod

        System.out.println("Enter the size of the 3d array");
        l = input.nextInt();
        b = input.nextInt();
        h = input.nextInt();
        //decalring 3d array
        int[][][] arr = new int[l][b][h];

        getArray(arr,l,b,h);
        printArray(arr, l, b, h);
        input.close();
    }

    public static void getArray(int[][][] array,int x,int y,int z)
    {
        System.out.println("Enter the elements of 3d array");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<z;k++)
                {
                    array[i][j][k] = in.nextInt();
                }
            }
        }
        in.close();
    }

    public static void printArray(int[][][] array,int x,int y,int z)
    {
        System.out.println("Your 3d array");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print("| ");
                for(int k=0;k<z;k++)
                {
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println("|");
            }
            System.out.println("-------------------");
        }
    }
}