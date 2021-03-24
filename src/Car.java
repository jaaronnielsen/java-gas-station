import java.util.Objects;

class Car implements Runnable {
    int requestedGallons;
    String fuelType;
    String carName;
    GasPump assignedPump;
    GasStation gasStation;

    public Car() {}

    public Car(int capacity, String fuelType, String name, GasStation station) {
        requestedGallons = capacity;
        this.fuelType = fuelType;
        carName = name;
        gasStation = station;
    }

    public int getTankCapacity(){
        return this.requestedGallons;
    }

    public void setTankCapacity(int tankCapacity) { this.requestedGallons = tankCapacity; }
    
    public String getFuelType(){
        return this.fuelType;
    }

    public void run() {
        try {
//            if (gasStation.assignPump(this)) {
//                gasStation.useGasPump(this);
//            }
            boolean stillRunning = true;
            while (stillRunning) {
                if (!gasStation.assignPump(this)) {
                    // Must sleep
                    Thread.sleep(2500);
                } else {
                    gasStation.useGasPump(this);
                    stillRunning = false;
                }
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}