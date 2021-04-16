public class InstructionPart {
    int alpha = 0;
    double h = 0;
    double dh = 0;
    double r = 0;
    double dr = 0;

    InstructionPart()
    {
    }

    InstructionPart(int _alpha, double _h, double _dh, double _r, double _dr)
    {
        alpha = _alpha;
        h = _h;
        dh = _dh;
        r = _r;
        dr = _dr;
    }

    public void setParameters(int _alpha, double _h, double _dh, double _r, double _dr)
    {
        alpha = _alpha;
        h = _h;
        dh = _dh;
        r = _r;
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

    public double getDr()
    {
        return dr;
    }

    public double getH()
    {
        return h;
    }

    public double getDh()
    {
        return dh;
    }

    public double getR()
    {
        return r;
    }

    public void printParameters()
    {
        System.out.println("Alpha=" + alpha + " H=" + h + " dH=" + dh + " R=" + r + " dR=" + dr);
    }
}
