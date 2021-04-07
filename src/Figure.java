public class Figure {
    double x = 0;
    double y = 0;
    double ResizeSpeed = 0;
    double dH=0;
    double Speed = 0;
    double alpha = 0;
    double H = 0;
    boolean isMoving = false;
    public void initCoord(double _x, double _y)
    {
        x=_x;
        y=_y;
    }
    public void reset()
    {
        double ResizeSpeed = 0;
        double dH=0;
        double Speed = 0;
        double alpha = 0;
        double H = 0;
    }
    public void speed(double _Speed)
    {
        Speed = _Speed;
    }
    public void Color()
    {

    }
    public void resizeSpeed(double _ResizeSpeed)
    {
        ResizeSpeed=_ResizeSpeed;
    }
    public void Move()
    {
        x = x + (Math.cos(alpha)*dH);
        y = y + (Math.sin(alpha)*dH);
        if(dH<H)
        {
            dH=dH+Speed;
        }
    }
}