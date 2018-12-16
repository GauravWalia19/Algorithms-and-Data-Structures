public class MainAR
{
    public static void main(String[] args)
    {
        ArrayStack S = new ArrayStack();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        S.print();
        
        S.pop();
        S.pop();
        S.print();

        System.out.println("SIZE: "+S.size());
        System.out.println("ISEMPTY OR NOT: "+S.isEmpty());
        System.out.println("TOP ELEMENT: "+S.top());
    }
}