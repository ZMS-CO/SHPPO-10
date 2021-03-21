import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Instruction[] instr_arr = new Instruction[9];

        Scanner scan = new Scanner(System.in);
        int i = 0;

        System.out.println("Check this out! o.o");

        MyFrame frame = new MyFrame();

        System.out.println("Enter your instructions:");

        while (frame.isEnabled())
        {

            System.out.print("Instruction #" + (i + 1) + ":");//\tTowards border (0 - no, 1 - up, 2 - down, 3 - left, 4 - right): ");

            //int toBorder = scan.nextInt();
            //if (toBorder < 0 || toBorder > 4)
            //{
            //    throw new IllegalArgumentException("Incorrect input!");
            //}

            System.out.print("\tAngle: ");
            int alphaGrad = scan.nextInt();
            if (alphaGrad < 0 || alphaGrad > 360)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }


            System.out.print("\tdH: ");
            int dh = scan.nextInt();
            if (dh < 0)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }

            System.out.print("\tdR: ");
            int dr = scan.nextInt();

            //instr_arr[i] = new Instruction(alphaGrad, dh, dr);

            //instr_arr[i].printParameters();

            Instruction instr = new Instruction(alphaGrad, dh, dr);
            frame.sendInstruction(instr);

            frame.printInstructions();

            if (i >= 8)
            {
                break;
            }

            i ++;
        }
        
    }
}
