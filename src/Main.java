import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Instruction[] instr_arr = new Instruction[9];

        Scanner scan = new Scanner(System.in);
        int j = 0;

        System.out.println("Check this out! o.o");

        MyFrame frame = new MyFrame();

        System.out.println("Enter your instructions:");

        while (frame.isEnabled())
        {

            System.out.print("Instruction #" + (j + 1) + ":");//\tTowards border (0 - no, 1 - up, 2 - down, 3 - left, 4 - right): ");

            //int toBorder = scan.nextInt();
            //if (toBorder < 0 || toBorder > 4)
            //{
            //    throw new IllegalArgumentException("Incorrect input!");
            //}



            //instr_arr[i] = new Instruction(alphaGrad, dh, dr);

            //instr_arr[i].printParameters();
            Instruction instr = new Instruction();
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Итерация " + i+1 + " из 10");
                System.out.print("\tAngle: ");
                int alphaGrad = scan.nextInt();

                System.out.print("\tH: ");
                int h = scan.nextInt();
                if (h < 0)
                {
                    throw new IllegalArgumentException("Incorrect input!");
                }

                System.out.print("\tdH: ");
                int dh = scan.nextInt();
                if (dh < 0)
                {
                    throw new IllegalArgumentException("Incorrect input!");
                }

                System.out.print("\tR: ");
                int r = scan.nextInt();

                System.out.print("\tdR: ");
                int dr = scan.nextInt();
                if (dr < 0)
                {
                    throw new IllegalArgumentException("Incorrect input!");
                }

                instr.newPart(i, alphaGrad, h, dh, r, dr);
            }

            frame.sendInstruction(instr);

            frame.printInstructions();

            if (j >= 8)
            {
                break;
            }

            j ++;
        }
        
    }
}
