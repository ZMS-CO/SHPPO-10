public class InstructionPart {
    int alpha = 0;
    double h = 0;
    double dh = 0;
    double r = 0;
    double dr = 0;

    InstructionPart()
    {
    }

    Instruction(int _alpha, int _h, int _dr)
    {
        alpha = _alpha;
        h = _h;
        dr = _dr;
    }

    public void setParameters(int _alpha, int _h, int _dr)
    {
        alpha = _alpha;
        h = _h;
        dr = _dr;
    }

    public void setAlpha(int val)
    {
        alpha = val;
    }

    public void setDr(int val)
    {
        dr = val;
    }

    public void setH(int val)
    {
        h = val;
    }

    public int getAlpha()
    {
        return alpha;
    }

    public int getDr()
    {
        return dr;
    }

    public int getH()
    {
        return h;
    }

    public void printParameters()
    {
        System.out.println("Alpha=" + alpha + " H=" + h + " dH=" + dh + " R=" + r + " dR=" + dr);
    }
}
