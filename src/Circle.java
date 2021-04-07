public class Circle implements Figure{
    double x = 0;
    double y = 0;
    double x1=0;
    double y1=0;
    double xVelocity=0;
    double yVelocity=0;
    double ResizeSpeed = 0;
    double dH=0;
    double Speed = 0;
    double alpha = 0;
    double H = 0;
    public void initCoord(double _x, double _y)
    {
        x=_x;
        y=_y;
    }
    public void targetCoord(double alpha, double H)
    {
        double x1 = x + (Math.cos(alpha)*H);
        double y1 = y + (Math.sin(alpha)*H);
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
        x = x + Speed*(Math.cos(alpha)*dH);
        y = y + Speed*(Math.sin(alpha)*dH);
        if(dH<H)
        {
            dH++;
        }
    }
}
