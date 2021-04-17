public class InstructionsHandler {

    int i = 0;
    int currentInstruction = 0;

    public void execInstruction(Circle circle, Instruction[] ins, int insNum)
    {
        if (currentInstruction != insNum)
        {
            currentInstruction = insNum;
            i = 0;
        }

        if (currentInstruction != 0)
        {
            circle.setAngle(ins[currentInstruction - 1].getIns().getAlpha());
            circle.setH(ins[currentInstruction - 1].getIns().getH());
            circle.setSpeed(ins[currentInstruction - 1].getIns().getDh());
            circle.setTargetDimension(ins[currentInstruction - 1].getIns().getR());
            circle.setResizeSpeed(ins[currentInstruction - 1].getIns().getDr());
            circle.setMoving();
            ins[currentInstruction - 1].nextIterator();
        }

        i++;

    }
}
