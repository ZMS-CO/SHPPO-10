public class Figure {
    double x = 0;
    double y = 0;
    double resizeSpeed = 0;
    double dH=0;
    double speed = 0;
    double alpha = 0;
    double h = 0;
    boolean isMoving = false;
    public void initCoord(double _x, double _y)
    {
        x = _x;
        y = _y;
    }
    public void reset()
    {
        resizeSpeed = 0;
        dH = 0;
        speed = 0;
        alpha = 0;
        h = 0;
        isMoving = false;

    }
    public void speed(double _Speed)
    {
        speed = _Speed;
    }
    public void color()
    {

    }
    public void resizeSpeed(double _ResizeSpeed)
    {
        resizeSpeed=_ResizeSpeed;
    }
    public void move()
    {
        x = x + (Math.cos(alpha) * dH);
        y = y + (Math.sin(alpha) * dH);
        if(dH < h)
        {
            dH = dH + speed;
        }
    }

    public void tick()
    {
        move();
        if (dH >= h)
        {
            reset();
        }
    }
}