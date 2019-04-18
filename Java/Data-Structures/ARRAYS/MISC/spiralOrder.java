import java.util.*;
abstract class spiralOrder
{
    /**
     * SAMPLE TEST CASE
     * 3 3
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * 
     * OUTPUT
     * 1
     * 2
     * 3
     * 6
     * 9
     * 8
     * 7
     * 4
     * 5
     **/
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        printClock(arr,n,m);
        in.close();
    }

    private static void printClock(int[][] arr,int n,int m)
    {
        int sr = 0;
        int er = n;
        int sc = 0;
        int ec = m;

        while(sr < er && sc < ec)
        {
            // l -> r 
            for(int i=sc;i<ec;i++)
            {
                System.out.println(arr[sr][i]);
            }
            sr++;
            
            // |
            // v
            for(int i=sr;i<er;i++)
            {
                System.out.println(arr[i][ec-1]);
            }
            ec--;

            //<-
            if(sr<er)
            {
                for(int i=ec-1;i>=sc;i--)
                {
                    System.out.println(arr[er-1][i]);
                }
                er--;
            }
            
            // ^
            // |
            if(sc<ec)
            {
                for(int i=er-1;i>=sr;i--)
                {
                    System.out.println(arr[i][sc]);
                }
                sc++;
            }
        }
    }
}