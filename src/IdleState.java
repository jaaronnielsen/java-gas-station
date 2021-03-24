public class IdleState implements IGasPumpState {
    @Override
    public void stateAction(GasPumpContext context, IGasPumpState newState) {
        //System.out.println("*** Current State: Idle");
        context.setState(newState);
    }
}
