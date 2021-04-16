public class Handler
{
    Handler nextHandler = null;
    public void handle(InstructionPart intr)
    {

    }

    public void setNext(Handler next)
    {
        nextHandler = next;
    }
}
