
import java.util.Scanner;

public class Switch_String {
    public static void main(String[] args)
    {
      Scanner in = new  Scanner(System.in);
      System.out.println("Enter value of a:");
      int a = in.nextInt();
       switch(a)
       {
        case 1 :  System.out.println("One");
        break;
        case 2 :  System.out.println("Two");
        break;
        case 3 :  System.out.println("Three");
        break;
        case 4 :  System.out.println("Four");
        break;
        default:  System.out.println("Invalid Input");
       }
      
    }
}
