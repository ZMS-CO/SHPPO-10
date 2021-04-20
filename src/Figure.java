public class Figure {

    double x = 0;
    double y = 0;

    double initX = 0;
    double initY = 0;

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
        initX = _x;
        initY = _y;
        dimension = _dim;
    }

    public void initFigure(double _x, double _y, double _r)
    {
        initCoord(_x, _y, _r);
        printParams();
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
        initX = x;
        initY = y;
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
        x = initX + (Math.cos(Math.toRadians(alpha)) * dH);
        y = initY + (Math.sin(Math.toRadians(alpha)) * dH);
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

    public void towardsBorder(int width, int height, int direction)
    {
        System.out.print("dir=" + direction);
        switch (direction) {

            case -1: {
                h = y - dimension;
                break;
            }

            case -2: {
                h = height - y - dimension;
                break;
            }

            case -3: {
                h = x - dimension;
                break;
            }

            case -4: {
                h = width - x - dimension;
                break;
            }
        }
        System.out.print("h(circle)=" + h + "\n");

    }
}