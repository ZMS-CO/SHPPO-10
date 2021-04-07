public class MoveHandler extends Handler {
    @Override
    public void handle(InstructionPart instr)
    {

        nextHandler.handle(instr);
    }
}
