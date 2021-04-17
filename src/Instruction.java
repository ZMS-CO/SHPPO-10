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

        public boolean nextIterator()
        {
            if (iterator < n)
            {
                iterator++;
                return false;
            }
            else return true;
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
            return parts.get(iterator);
        }
}
