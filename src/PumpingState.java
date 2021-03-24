public class PumpingState implements IGasPumpState {
    @Override
    public void stateAction(GasPumpContext context, IGasPumpState newState) {
        //System.out.println("*** Current State: Pumping");
        context.setState(newState);
    }
}
