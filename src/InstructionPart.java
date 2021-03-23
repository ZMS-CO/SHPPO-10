public class InstructionPart {
    int alpha;
    int h;
    int dh;
    int r;
    int dr;

    InstructionPart()
    {
        alpha = 0;
        h = 0;
        dh = 0;
        r = 0;
        dr = 0;
    }

    InstructionPart(int _alpha, int _h, int _dh, int _r, int _dr)
    {
        alpha = _alpha;
        h = _h;
        dh = _dh;
        r = _r;
        dr = _dr;
    }

    public void setParameters(int _alpha, int _h, int _dh, int _r, int _dr)
    {
        alpha = _alpha;
        h = _h;
        dh = _dh;
        r = _r;
        dr = _dr;
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
