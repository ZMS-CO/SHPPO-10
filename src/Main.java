import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Instruction[] instr_arr = new Instruction[9];
        ArrayList<ArrayList<int[]>> Instructions = new ArrayList<ArrayList<int[]>>();
        int[] buff_parameters = new int[5];

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
            int alphaGrad = -scan.nextInt();
            buff_parameters[0]=alphaGrad;
            //if (alphaGrad < 0 || alphaGrad > 360)
            //{
            //    throw new IllegalArgumentException("Incorrect input!");
            //}


            System.out.print("\tdH: ");
            int dh = scan.nextInt();
            if (dh < 0)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }
            else buff_parameters[1]=dh;

            System.out.print("\tdR: ");
            int dr = scan.nextInt();
            buff_parameters[2]=dr;

            System.out.print("\tRadius velocity: ");
            int dhr = scan.nextInt();
            if (dhr < 0)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }
            else buff_parameters[3]=dhr;

            System.out.print("\tLength: ");
            int l = scan.nextInt();
            if (l < 0)
            {
                throw new IllegalArgumentException("Incorrect input!");
            }
            else buff_parameters[4]=l;

            //instr_arr[i] = new Instruction(alphaGrad, dh, dr);

            //instr_arr[i].printParameters();

            for (int j=0; j<5; j++) {
                Instructions.add(i, buff_parameters[j]);
            }
            //System.out.println(Instructions.get(i));

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
