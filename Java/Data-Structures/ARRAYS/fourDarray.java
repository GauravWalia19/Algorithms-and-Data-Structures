import java.util.*;
public class fourDarray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number=0;
        System.out.println("Enter the number of blocks");
        number = in.nextInt();
        int l; //length
        int b; //breadth
        int h; //height
        System.out.println("Enter the length breadth and height of the array");
        l = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();
        int[][][][] arr = new int[number][l][b][h];

        for(int i=0;i<number;i++)
        {
            System.out.println("Enter the "+i+" 3d array elements");
            for(int j=0;j<l;j++)
            {
                for(int k=0;k<b;k++)
                {
                    for(int m=0;m<h;m++)
                    {
                        arr[i][j][k][m] = in.nextInt();
                    }
                }
            }
        }
        //printing
        for(int i=0;i<number;i++)
        {
            System.out.println("The "+i+" 3d array elements are:");
            for(int j=0;j<l;j++)
            {
                for(int k=0;k<b;k++)
                {
                    for(int m=0;m<h;m++)
                    {
                        System.out.print( arr[i][j][k][m]+ " ");
                    }
                    System.out.println();
                }
                System.out.println("-------");
            }
            System.out.println("******************");
        }
        in.close();
    }
}