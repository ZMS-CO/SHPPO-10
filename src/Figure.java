public class Figure {

    /*************Параметры круга*******/

    double x = 0;                   // координата x
    double y = 0;                   // координата y

    double initX = 0;               // координата x в начале движения
    double initY = 0;               // координата y в начале движения

    double h = 0;                   // дальность движения
    double dH = 0;                  // вспомогательная переменная для движения
    double speed = 0;               // скорость движения

    double alpha = 0;               // угол движения

    double dimension = 0;           // размер фигуры
    double targetDimension = 0;     // конечный размер
    double resizeSpeed = 0;         // скорость изменения размера

    boolean isMoving = false;       // состояние движения

    /*************Начальные координаты*******/
    public void initCoord(double _x, double _y, double _dim)
    {
        x = _x;
        y = _y;
        initX = _x;
        initY = _y;
        dimension = _dim;
    }

    /*************Инициализация фигуры*******/
    public void initFigure(double _x, double _y, double _r)
    {
        initCoord(_x, _y, _r);
        //printParams();
    }

    /*************Проверка на движение*******/
    public boolean isMoving()
    {
        return isMoving;
    }

    /*************Установка состояния движения*******/
    public void setMoving()
    {
        isMoving = true;
    }

    /*************Сброс параметров*******/
    public void reset() {
        initX = x;
        initY = y;
        resizeSpeed = 0;
        dH = 0;
        speed = 0;
        alpha = 0;
        h = 0;
        isMoving = false;

        //System.out.println("dim=" + dimension);
    }

    /*************Установка параметров*******/
    public void setSpeed(double _Speed)
    {
        speed = _Speed;
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

    /*************Шаг движения*******/
    public void move()
    {
        x = initX + (Math.cos(Math.toRadians(alpha)) * dH);
        y = initY + (Math.sin(Math.toRadians(alpha)) * dH);
        if(dH < h)
        {
            dH = dH + speed;
        }
    }

    /*************Шаг изменения размера*******/
    public void resize()
    {
        if (dimension < targetDimension && resizeSpeed > 0 || dimension > targetDimension && resizeSpeed < 0)
            dimension = dimension + resizeSpeed;
    }

    /*************Что происходит при срабатывании таймера*******/
    public void tick()
    {
        move();
        resize();
        if (dH >= h && ((dimension >= targetDimension && resizeSpeed > 0) || (dimension <= targetDimension && resizeSpeed < 0) || resizeSpeed == 0 || targetDimension == 0))
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

        //System.out.print("dir=" + direction + " targetDim=" + targetDimension);

        switch (direction)
        {
            case -1:
            {
                h = y - targetDimension;
                break;
            }
            case -2:
            {
                h = height - y - targetDimension;
                break;
            }
            case -3:
            {
                h = x - targetDimension;
                break;
            }
            case -4:
            {
                h = width - x - targetDimension;
                break;
            }
        }

        //System.out.print("h(circle)=" + h + "\n");

    }
}