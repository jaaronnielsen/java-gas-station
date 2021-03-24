public class GasPump {
    private GasPumpContext gasPumpContext = new GasPumpContext();
    private IdleState idleState = new IdleState();
    private FuelSelectionState fuelSelectionState = new FuelSelectionState();
    private PumpingState pumpingState = new PumpingState();
    private ReceiptState receiptState = new ReceiptState();
    String pumpName;
    Car carAssigned;

    private boolean isBusy = false;

    public synchronized void setBusy(boolean busy) { this.isBusy = busy; }
    public synchronized boolean getBusy() { return this.isBusy; }

    public void resetValues() {
        lowCounter = 0;
        medCounter = 0;
        highCounter = 0;
    }

    private int lowCounter = 0;

    public synchronized  void setLowCounter(int newAmt) {
        this.lowCounter += newAmt;
    }

    public int getLowCounter() {
        return lowCounter;
    }

    private int medCounter;

    public synchronized  void setMedCounter(int newAmt) {
        this.medCounter += newAmt;
    }

    public int getMedCounter() {
        return medCounter;
    }

    private int highCounter;

    public synchronized  void setHighCounter(int newAmt) {
        this.highCounter += newAmt;
    }

    public int getHighCounter() {
        return highCounter;
    }

    //add a current state and switch on that
//make a car class that has what fuel he wants, how much he takes, 
//gas station class that has multiple pumps (to say when a pump is busy make it a bool) make a list of cars for cars arriving, pumps will have locks
// make it threaded and make the threads sleep after a part of a gallon is given

    private boolean triggerPressed = false;

    public GasPump(String name) {
        pumpName = name;
        idleState.stateAction(gasPumpContext, idleState);
    }

    public void AutoPumpStop() {
        //System.out.println(pumpName + ": has automatically stopped, your tank is full");
        switch (carAssigned.fuelType) {
            case "L":
                setLowCounter(carAssigned.getTankCapacity());
                break;
            case "M":
                setMedCounter(carAssigned.getTankCapacity());
                break;
            case "H":
                setHighCounter(carAssigned.getTankCapacity());
                break;
        }
        pumpingState.stateAction(gasPumpContext, pumpingState);
    }

    public void CardSwipe() {
        //System.out.println("Card Swiped");
        idleState.stateAction(gasPumpContext, fuelSelectionState);
    }

    public void SelectFuel() {
        //System.out.println(carAssigned.carName + " is making selection (Low / Medium / High)");
        //System.out.print("Fuel Grade set to ");
//        switch (carAssigned.fuelType) {
//            case "L":
//                //System.out.println("Selected Unleaded (Low) fuel");
//                break;
//            case "M":
//                System.out.println("Selected Plus (Medium) fuel");
//                break;
//            case "H":
//                System.out.println("Selected Premium (High) fuel");
//                break;
//        }
        fuelSelectionState.stateAction(gasPumpContext, pumpingState);
    }

    public void Trigger() {
        if (triggerPressed == false) {
            triggerPressed = true;
            //System.out.println("Trigger is pressed, gas is pumping on " + pumpName + " for " + carAssigned.carName);
        }
        else {
            triggerPressed = false;
            //System.out.println("Trigger released, gas no longer pumping on " + pumpName + " for " + carAssigned.carName);
        }
        pumpingState.stateAction(gasPumpContext, pumpingState);
    }

    public void PumpReturnLever() {
        //System.out.println("Nozzle placed in the return lever for "  + pumpName + " for " + carAssigned.carName);
        pumpingState.stateAction(gasPumpContext, receiptState);
        receiptState.stateAction(gasPumpContext, idleState);
        
    }
}
