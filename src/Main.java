import java.util.ArrayList;
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

        System.out.println("Enter initial position:");

        double x = scan.nextDouble();

        System.out.println("Enter your instructions:");

        while (frame.isEnabled())
        {
            System.out.println("== Instruction #" + (i + 1) + " ==\nEnter SubInstructions amount:");
            int k = scan.nextInt();

            ArrayList<InstructionPart> SubInstructions = new ArrayList<>();

            for (int j = 0; j < k; j++) {
                System.out.print("SubInstruction #" + (j + 1) + ":\tTowards border (0 - no, 1 - up, 2 - down, 3 - left, 4 - right): ");

                //double[] buff_parameters = new double[5];

                int alphaGrad = 0;
                double h = 0;

                int toBorder = scan.nextInt();
                if (toBorder < 0 || toBorder > 4) {
                    throw new IllegalArgumentException("Incorrect input!");
                }
                if (toBorder > 0)
                {
                    switch (toBorder) {
                        case 1 ->
                            alphaGrad = 0;
                        case 2 ->
                            alphaGrad = 90;
                        case 3 ->
                            alphaGrad = -180;
                        case 4 ->
                            alphaGrad = -90;

                    }


                }
                else {


                    System.out.print("\tAngle: ");
                    alphaGrad = -scan.nextInt();

                    System.out.print("\tH: ");
                    h = scan.nextDouble();
                    if (h < 0) {
                        throw new IllegalArgumentException("Incorrect input!");
                    }
                }

                System.out.print("\tdH: ");
                double dh = scan.nextDouble();
                if (dh < 0)
                {
                    throw new IllegalArgumentException("Incorrect input!");
                }

                System.out.print("\tRadius: ");
                double r = scan.nextDouble();
                if (r < 0)
                {
                    throw new IllegalArgumentException("Incorrect input!");
                }

                System.out.print("\tRadius velocity: ");
                double dr = scan.nextDouble();
                if (dr < 0)
                {
                    throw new IllegalArgumentException("Incorrect input!");
                }



                //instr_arr[i] = new Instruction(alphaGrad, dh, dr);


                SubInstructions.add(new InstructionPart(alphaGrad, h, dh, r, dr));
                SubInstructions.get(i).printParameters();
            }

            Instruction instr = new Instruction(SubInstructions);
            frame.sendInstruction(instr);

            frame.panel.printInstructions();

            if (i >= 8)
            {
                break;
            }

            i ++;
        }
        
    }
}
