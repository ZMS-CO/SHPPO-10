public class Instruction
{


        InstructionPart[] part;
        int n;
        int iterator;

        Instruction()
        {
            part = new InstructionPart[10];
            n = 0;
            iterator = 0;
        }

        public void newPart(int alpha, int h, int dh, int r, int dr)
        {
            n += 1;
            part[n] = new InstructionPart(alpha, h, dh, r, dr);
        }

        public int getIterator()
        {
            return iterator;
        }

        public void nextIterator()
        {
            iterator ++;
        }

        public void printParameters()
        {
            for (int i = 0; i < n; i++)
            {
                part[i].printParameters();
            }
            System.out.println();
        }



}
