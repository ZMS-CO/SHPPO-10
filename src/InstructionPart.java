public class InstructionPart {
    int alpha = 0;
    int h = 0;
    int dh = 0;
    int r;
    int dr = 0;

    InstructionPart()
    {
        alpha = 0;
        h = 0;
        dr = 0;
    }

    InstructionPart(int _alpha, int _h, int _dr)
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
        System.out.println("Alpha=" + alpha + " H=" + h + " dr=" + dr);
    }
}
