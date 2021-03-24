public class GasPumpContext {
    private IGasPumpState state;

    public GasPumpContext() {
        state = null;
    }

    public void setState(IGasPumpState state) {
        this.state = state;
    }

    public IGasPumpState getState() {
        return state;
    }
}
