import java.util.*;
class reverse_no
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int no, rem=0, rev=0;
    	System.out.println("enter a no: ");
    	no = s1.nextInt();
    	while(no>0){
        	rem = no % 10;
        	rev = rev * 10 + rem;
        	no = no/10;
    	}
    	System.out.println("Reversed no = " + rev);
	}
}