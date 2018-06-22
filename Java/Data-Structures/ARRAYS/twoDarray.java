import java.util.*;
public class twoDarray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int rows; //rows of 2d array
        int cols; //cols of 2d array
        System.out.println("Enter the dimensions of the 2d array");
        rows = in.nextInt();
        cols = in.nextInt();

        //declaring 2d array
        int[][] arr = new int[rows][cols];

        //inputting array
        System.out.println("Enter the elements of the 2d array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Your 2d array");
        for(int i=0;i<rows;i++)
        {
            System.out.print("| ");
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("|");
        }
        in.close();
    }
}