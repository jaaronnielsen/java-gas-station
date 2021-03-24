public class FuelSelectionState implements IGasPumpState {
    @Override
    public void stateAction(GasPumpContext context, IGasPumpState newState) {
        //System.out.println("*** Current State: Fuel Selection");
        context.setState(newState);
    }
}
