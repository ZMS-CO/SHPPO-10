import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // write your code here

        System.out.println("Check this out! o.o");

        MyFrame frame = new MyFrame();

        System.out.println("Enter your instructions:");

        while (frame.isEnabled())
        {
            System.out.print("Towards border (1- :");
            scan.nextInt();
        }
        

    }
}
