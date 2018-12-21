public class Strings
{
    public static void main(String[] args) 
    {   
        /*USAGE OF STRING CLASS IN JAVA*/
        String trial = "Hello World this is github";
        
        System.out.println("string:\t" + trial);
        System.out.println();

        System.out.println("METHODS IN STRING CLASS");
        
        //charAt()
        System.out.println("charAt(3):\t\t\t" + trial.charAt(3));
        
        //indexOf()
        System.out.println("indexOf('o'):\t\t\t" + trial.indexOf('o'));
        System.out.println("indexOf('o',3):\t\t\t" + trial.indexOf('o',3));
        System.out.println("indexOf(\"this\"):\t\t" + trial.indexOf("this"));
        System.out.println("indexOf(\"this\",3):\t\t" + trial.indexOf("this",3));

        //lastIndexOf()
        System.out.println("lastIndexOf('o'):\t\t" + trial.lastIndexOf('o'));
        System.out.println("lastIndexOf('o',3):\t\t" + trial.lastIndexOf('o',3));
        System.out.println("lastIndexOf(\"this\"):\t\t" + trial.lastIndexOf("this"));
        System.out.println("lastIndexOf(\"this\",4):\t\t" + trial.lastIndexOf("this",4));
        
        //length()
        System.out.println("length():\t\t\t" + trial.length());
        
        //substring()
        System.out.println("substring(1):\t\t\t" + trial.substring(1));
        System.out.println("substring(3,5):\t\t\t" + trial.substring(3,5));
        
        //replace()
        System.out.println("replace('a','b'):\t\t" + trial.replace('a','b'));
        System.out.println("replace(\"Hello\",\"world\"):\t" + trial.replace("Hello","world"));
        
        //concat()
        System.out.println("concat(\" Hello World\"):\t\t" + trial.concat(" Hello World"));
        
        //equals()
        System.out.println("equals(\"Hello World this is github\"):\t" + trial.equals("hello wotld a bac a"));  
        
        //toUpperCase()
        System.out.println("toUpperCase():\t\t\t" + trial.toUpperCase());

        //toLowerCase()
        System.out.println("toLowerCase():\t\t\t" + trial.toLowerCase());
    }
}