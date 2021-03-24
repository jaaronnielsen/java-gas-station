public class ReceiptState implements IGasPumpState {
    @Override
    public void stateAction(GasPumpContext context, IGasPumpState newState) {
        //System.out.println("*** Current State: Receipt");
        context.setState(newState);
    }
}
