import java.util.ArrayList;

public class Instruction
{
        ArrayList<InstructionPart> parts;
        int n;
        int iterator = 0;

        Instruction(ArrayList<InstructionPart> _parts)
        {
            parts = _parts;
            n = parts.size();
            iterator = 0;
        }

        public void newPart(int alpha, int h, int dh, int r, int dr)
        {
            n += 1;
            parts.add(new InstructionPart(alpha, h, dh, r, dr));
        }

        public int getIterator()
        {
            return iterator;
        }

        public void nextIterator()
        {

            iterator++;

            // System.out.println("next=" + iterator + " n=" + n);

            /*
            if (iterator < n)
            {

                return false;
            }
            else
            {
                iterator = 0;
                return true;
            }

             */
        }

        public boolean validIterator()
        {
            if (iterator < n)
            {

                return false;
            }
            else
            {
                iterator = 0;
                return true;
            }
        }

        public void printParameters()
        {
            for (int i = 0; i < n; i++)
            {
                parts.get(i).printParameters();
            }
            System.out.println();
        }

        public InstructionPart getIns()
        {
            //parts.get(iterator).printParameters();
            return parts.get(iterator);
        }
}
