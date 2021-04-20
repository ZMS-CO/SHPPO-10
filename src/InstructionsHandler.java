public class InstructionsHandler {

    //int i = 0;
    int currentInstruction = 0;
    int panel_width;
    int panel_height;

    InstructionsHandler(int _w, int _h)
    {
        panel_width = _w;
        panel_height = _h;
    }

    public boolean execInstruction(Circle circle, Instruction[] ins, int insNum)
    {
        if (currentInstruction != insNum)
        {
            currentInstruction = insNum;
            //i = 0;
        }

        if (currentInstruction != 0)
        {
            //System.out.println(ins[currentInstruction - 1].getIterator());

            if (ins[currentInstruction - 1].validIterator())
            {
                System.out.print(1);
                setIdle(circle);
                return true;
            }

            circle.setAngle(ins[currentInstruction - 1].getIns().getAlpha());
            double h = ins[currentInstruction - 1].getIns().getH();
            System.out.print("h=" + h + "\n");
            if (h < 0)
                circle.towardsBorder(panel_width, panel_height, (int) h);
            else circle.setH(h);
            circle.setSpeed(ins[currentInstruction - 1].getIns().getDh());
            circle.setTargetDimension(ins[currentInstruction - 1].getIns().getR());
            circle.setResizeSpeed(ins[currentInstruction - 1].getIns().getDr());
            circle.setMoving();

            //i++;
            ins[currentInstruction - 1].nextIterator();

        }
        else
            setIdle(circle);

        return false;

    }

    public void setIdle(Circle circle)
    {
        circle.reset();
    }
}
