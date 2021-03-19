import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // write your code here
        int i = 0;

        System.out.println("Check this out! o.o");

        MyFrame frame = new MyFrame();

        System.out.println("Enter your instructions:");

        while (frame.isEnabled())
        {

            System.out.print("Instruction #" + (i + 1) + ":\tTowards border (0 - no, 1 - up, 2 - down, 3 - left, 4 - right): ");
            i ++;
            int toBorder = scan.nextInt();
            if (toBorder < 0 || toBorder > 4)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }
            switch (toBorder) {
                case 1: {continue;}
                case 2: {continue;}
                case 3: {continue;}
                case 4: {continue;}
                case 0: {break;}
            }

            System.out.print("\tAngle: ");
            int alphaGrad = scan.nextInt();
            if (alphaGrad < 0 || alphaGrad > 360)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }

            System.out.print("\tdH: ");
            int dh = scan.nextInt();

            System.out.print("\tdR: ");
            int dr = scan.nextInt();

        }
        

    }
}
