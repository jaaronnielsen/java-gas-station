import java.util.*;

import static java.lang.Thread.sleep;

class GasStation {
    private static GasStation maverick;

    private int carCounter = 0;

    public synchronized void setCarCounter() {
        this.carCounter += 1;
    }

    public int getCarCounter() {
        return this.carCounter;
    }

    public void resetValues() {
        carCounter = 0;
        lowCounter = 0;
        medCounter = 0;
        highCounter = 0;
        for(GasPump pump : pumps) {
            pump.resetValues();
        }
    }

    private int lowCounter = 0;

    public synchronized  void setLowCounter(int newAmt) {
        this.lowCounter += newAmt;
    }

    public int getLowCounter() {
        return lowCounter;
    }

    private int medCounter = 0;

    public synchronized  void setMedCounter(int newAmt) {
        this.medCounter += newAmt;
    }

    public int getMedCounter() {
        return medCounter;
    }

    private int highCounter = 0;

    public synchronized  void setHighCounter(int newAmt) {
        this.highCounter += newAmt;
    }

    public int getHighCounter() {
        return highCounter;
    }

    private GasStation() {}

    public static synchronized GasStation getInstance() {
        if (maverick == null)
            maverick = new GasStation();
        return maverick;
    }

    GasPump pump1 = new GasPump("Pump 1");
    GasPump pump2 = new GasPump("Pump 2");
    GasPump pump3 = new GasPump("Pump 3");
    GasPump pump4 = new GasPump("Pump 4");
    GasPump pump5 = new GasPump("Pump 5");
    GasPump pump6 = new GasPump("Pump 6");
    GasPump pump7 = new GasPump("Pump 7");
    GasPump pump8 = new GasPump("Pump 8");
    GasPump pump9 = new GasPump("Pump 9");
    GasPump pump10 = new GasPump("Pump 10");
    GasPump pump11 = new GasPump("Pump 11");
    GasPump pump12 = new GasPump("Pump 12");


    List<GasPump> pumps = new ArrayList<GasPump>(){{
        add(pump1);
        add(pump2);
        add(pump3);
        add(pump4);
        add(pump5);
        add(pump6);
        add(pump7);
        add(pump8);
        add(pump9);
        add(pump10);
        add(pump11);
        add(pump12);
    }};

   // List<Car> cars = new ArrayList<Car>();

   public synchronized boolean assignPump(Car car){
       for(GasPump pump:pumps){
           if(!pump.getBusy()) {
                //System.out.println(pump.pumpName + " is available sending " + car.carName + " to " + pump.pumpName + "\n");
                pump.setBusy(true);
                pump.carAssigned = car;
                car.assignedPump = pump;
                return true;
           }
       }
       return false;
   }

   public void useGasPump(Car car) {
       car.assignedPump.CardSwipe();
       car.assignedPump.SelectFuel();
       car.assignedPump.Trigger();
       car.assignedPump.AutoPumpStop();
       car.assignedPump.PumpReturnLever();
       maverick.setCarCounter();
       switch (car.fuelType) {
           case "L":
               setLowCounter(car.getTankCapacity());
               break;
           case "M":
               setMedCounter(car.getTankCapacity());
               break;
           case "H":
               setHighCounter(car.getTankCapacity());
               break;
       }

       for (int i = 0; i < car.getTankCapacity() * 10; ++i) {
           try {
               sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       System.out.println(car.carName + " has completed");

       car.assignedPump.setBusy(false);
   }
}