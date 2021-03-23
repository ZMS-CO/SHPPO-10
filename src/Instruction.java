public class Instruction
{
    InstructionPart[] part;

    Instruction()
    {
        part = new InstructionPart[10];
    }

    public void newPart(int index, int alpha, int h, int dh, int r, int dr)
    {
        part[index] = new InstructionPart(alpha, h, dh, r, dr);
    }



    public void printParameters()
    {
        for (int i = 0; i < 10; i++)
        {
            part[i].printParameters();
        }
        System.out.println();
    }
}
