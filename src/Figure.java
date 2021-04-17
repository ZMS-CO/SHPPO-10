public class Figure {

    double x = 0;
    double y = 0;

    double h = 0;
    double dH = 0;
    double speed = 0;

    double alpha = 0;

    double dimension = 0;
    double targetDimension = 0;
    double resizeSpeed = 0;

    boolean isMoving = false;

    public void initCoord(double _x, double _y, double _dim)
    {
        x = _x;
        y = _y;
        dimension = _dim;
    }

    public boolean isMoving()
    {
        return isMoving;
    }

    public void setMoving()
    {
        isMoving = true;
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

    public void setSpeed(double _Speed)
    {
        speed = _Speed;
    }

    public void setColor()
    {

    }

    public void setResizeSpeed(double _resizeSpeed)
    {
        resizeSpeed = _resizeSpeed;
    }

    public void setTargetDimension(double targetDim)
    {
        targetDimension = targetDim;
    }

    public void setH(double _h)
    {
        h = _h;
    }

    public void setAngle(double _alpha)
    {
        alpha = _alpha;
    }

    public void move()
    {
        x = x + (Math.cos(alpha) * speed);
        y = y + (Math.sin(alpha) * speed);
        if(dH < h)
        {
            dH = dH + speed;
        }
    }

    public void resize()
    {
        if (dimension < targetDimension && resizeSpeed > 0 || dimension > targetDimension && resizeSpeed < 0)
            dimension = dimension + resizeSpeed;
    }

    public void tick()
    {
        move();
        resize();
        if (dH >= h && (dimension >= targetDimension && resizeSpeed > 0) || (dimension <= targetDimension && resizeSpeed < 0) || resizeSpeed == 0)
        {
            reset();
        }
        //System.out.print(1);
        //printParams();
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void printParams()
    {
        System.out.println("x: " + x + "\ty: " + y + "\ntargetH: " + h + "\tcurrentH: " + dH + "\tspeed: " + speed + "\nalpha: " + alpha + "\ndimension: " + dimension + "\ttargetDimension: " + targetDimension + "\tresizeSpeed: " + resizeSpeed);
    }
}