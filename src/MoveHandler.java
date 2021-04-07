public class MoveHandler extends Handler {
    @Override
    public void handle(InstructionPart intr)
    {
        
        nextHandler.handle(instr);
    }
}
