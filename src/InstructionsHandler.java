public class InstructionsHandler {

    //int i = 0;
    int currentInstruction = 0;
    int k = 0;
    Instruction[] instr_arr = new Instruction[9];
    int panel_width;
    int panel_height;

    InstructionsHandler(int _w, int _h)
    {
        panel_width = _w;
        panel_height = _h;
    }

    /**************Выполнение инструкции***************/
    public boolean execInstruction(Circle circle)
    {
        /*
        if (currentInstruction != insNum)
        {
            currentInstruction = insNum;
            //i = 0;
        }

         */

        if (currentInstruction != 0)
        {
            //System.out.println(ins[currentInstruction - 1].getIterator());

            boolean toBorderFlag = false;

            if (instr_arr[currentInstruction - 1].validIterator())
            {

                //System.out.print(1);

                setIdle(circle);
                return true;
            }

            circle.setAngle(instr_arr[currentInstruction - 1].getIns().getAlpha());
            double h = instr_arr[currentInstruction - 1].getIns().getH();

            //System.out.print("h=" + h + "\n");

            if (h < 0)
                toBorderFlag = true;
            else circle.setH(h);
            circle.setSpeed(instr_arr[currentInstruction - 1].getIns().getDh());
            double r = instr_arr[currentInstruction - 1].getIns().getR();
            circle.setTargetDimension(r);
            if (toBorderFlag)
                circle.towardsBorder(panel_width, panel_height, (int) h);

            double dr = instr_arr[currentInstruction - 1].getIns().getDr();
            if (r < circle.getRadius())
                dr = -dr;
            circle.setResizeSpeed(dr);
            circle.setMoving();

            //i++;
            instr_arr[currentInstruction - 1].nextIterator();

        }
        else
            setIdle(circle);

        return false;

    }

    public void setIdle(Circle circle)
    {
        circle.reset();
    }

    /**************Методы инстукций***************/
    public void setInstruction(int instr)
    {
        currentInstruction = instr;
        //System.out.println(instr);
    }

    public int getIstruction()
    {
        return currentInstruction;
    }

    public void addInstruction(Instruction instr)
    {
        instr_arr[k++] = instr;
    }

    public void printInstructions()
    {
        for (int i = 0; i < k; i++)
        {
            instr_arr[i].printParameters();
        }
    }
}
