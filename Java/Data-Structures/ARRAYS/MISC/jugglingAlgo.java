abstract class jugglingAlgo
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        leftRotation(arr,3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }        
        System.out.println();
    }
    public static int[] leftRotation(int[] arr,int k)
    {
        int set = gcd(arr.length, k);

        for(int i=0;i<set;i++)
        {
            int temp = arr[i];
            int j=i;
            while(true)
            {
                int d = (j+k) % arr.length;
                
                if(d==i)
                {
                    break;
                }
                arr[j] = arr[d];
                j=d;
            }
            arr[j] = temp;
        }
        return arr;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}