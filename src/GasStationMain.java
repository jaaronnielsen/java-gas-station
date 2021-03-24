import java.util.*;

import static java.lang.Thread.sleep;

public class GasStationMain {
    public static void main(String[] args) {
        System.out.println("*** Gas Station Simulation ***");

        GasStation maverick = GasStation.getInstance();

        System.out.println("\n##### SCENARIO 1 #####");
        System.out.println("     Gas station starts out with 0 for all counters, Car1 asks for 10 gallons of low from pump1, Car2 asks for 8 gallons of low from pump2\n");
        Car car1 = new Car(10, "L", "Ford Pinto", maverick);
        Car car2 = new Car(8, "L", "Hummer", maverick);

        maverick.assignPump(car1);
        maverick.assignPump(car2);
        maverick.useGasPump(car1);
        maverick.useGasPump(car2);

        System.out.println("Maverick has pumped " + maverick.getLowCounter() + " gallons of low-grade gas.");
        if (maverick.getLowCounter() == 18) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println(car1.assignedPump.pumpName + " has pumped " + car1.assignedPump.getLowCounter() + " gallons of low-grade gas");
        if (car1.assignedPump.getLowCounter() == 10) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println(car2.assignedPump.pumpName + " has pumped " + car2.assignedPump.getLowCounter() + " gallons of low-grade gas");
        if (car2.assignedPump.getLowCounter() == 8) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println("Maverick has served " + maverick.getCarCounter() + " cars" );
        if (maverick.getCarCounter() == 2) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        maverick.resetValues();

        System.out.println("\n##### SCENARIO 2 ######");
        System.out.println("     Setup your station with 12 pumps, send 24 cars to the pumps (likely 2 each pump).  Have each car request 7 gallons of gas, all low grade.\n");

        car1.setTankCapacity(7);
        car2.setTankCapacity(7);
        Car car3 = new Car(7, "L", "Ford Squinto", maverick);
        Car car4 = new Car(7, "L", "Ford Binto", maverick);
        Car car5 = new Car(7, "L", "Ford Tinto", maverick);
        Car car6 = new Car(7, "L", "Ford Linto", maverick);
        Car car7 = new Car(7, "L", "Ford Hinto", maverick);
        Car car8 = new Car(7, "L", "Ford Ginto", maverick);
        Car car9 = new Car(7, "L", "Ford Finto", maverick);
        Car car10 = new Car(7, "L", "Ford Rinto", maverick);
        Car car11 = new Car(7, "L", "Ford Winto", maverick);
        Car car12 = new Car(7, "L", "Ford Sinto", maverick);
        Car car13 = new Car(7, "L", "Ford Zinto", maverick);
        Car car14 = new Car(7, "L", "Ford Vinto", maverick);
        Car car15 = new Car(7, "L", "Ford Minto", maverick);
        Car car16 = new Car(7, "L", "Ford Ninto", maverick);
        Car car17 = new Car(7, "L", "Ford Kinto", maverick);
        Car car18 = new Car(7, "L", "Ford Yinto", maverick);
        Car car19 = new Car(7, "L", "Ford Quinto", maverick);
        Car car20 = new Car(7, "L", "Ford Jinto", maverick);
        Car car21 = new Car(7, "L", "Ford Plinto", maverick);
        Car car22 = new Car(7, "L", "Ford Pintoo", maverick);
        Car car23 = new Car(7, "L", "Ford Ponto", maverick);
        Car car24 = new Car(7, "L", "Ford Punto", maverick);


        Thread c1 = new Thread(car1, "Car 1");
        Thread c2 = new Thread(car2, "Car 2");
        Thread c3 = new Thread(car3, "Car 3");
        Thread c4 = new Thread(car4, "Car 4");
        Thread c5 = new Thread(car5, "Car 5");
        Thread c6 = new Thread(car6, "Car 6");
        Thread c7 = new Thread(car7, "Car 7");
        Thread c8 = new Thread(car8, "Car 8");
        Thread c9 = new Thread(car9, "Car 9");
        Thread c10 = new Thread(car10, "Car 10");
        Thread c11 = new Thread(car11, "Car 11");
        Thread c12 = new Thread(car12, "Car 12");
        Thread c13 = new Thread(car13, "Car 13");
        Thread c14 = new Thread(car14, "Car 14");
        Thread c15 = new Thread(car15, "Car 15");
        Thread c16 = new Thread(car16, "Car 16");
        Thread c17 = new Thread(car17, "Car 17");
        Thread c18 = new Thread(car18, "Car 18");
        Thread c19 = new Thread(car19, "Car 19");
        Thread c20 = new Thread(car20, "Car 20");
        Thread c21 = new Thread(car21, "Car 21");
        Thread c22 = new Thread(car22, "Car 22");
        Thread c23 = new Thread(car23, "Car 23");
        Thread c24 = new Thread(car24, "Car 24");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
        c12.start();
        c13.start();
        c14.start();
        c15.start();
        c16.start();
        c17.start();
        c18.start();
        c19.start();
        c20.start();
        c21.start();
        c22.start();
        c23.start();
        c24.start();



        List<Car> cars = new ArrayList<Car>(){{
            add(car1);
            add(car2);
            add(car3);
            add(car4);
            add(car5);
            add(car6);
            add(car7);
            add(car8);
            add(car9);
            add(car10);
            add(car11);
            add(car12);
            add(car13);
            add(car14);
            add(car15);
            add(car16);
            add(car17);
            add(car18);
            add(car19);
            add(car20);
            add(car21);
            add(car22);
            add(car23);
            add(car24);
        }};

        Collections.shuffle(cars);

        List<Car> waitingCars = new ArrayList<Car>(){{
            for(Car car:cars) {
                if (car.assignedPump == null) {
                    add(car);
                }
            }
        }};

        Iterator<Car> itr = waitingCars.iterator();
        while (!waitingCars.isEmpty() && itr.hasNext()) {
            while(itr.hasNext()){
                Car car = itr.next();
                if (maverick.assignPump(car)) {
                    itr.remove();
                }
            }
        }

        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
            c6.join();
            c7.join();
            c8.join();
            c9.join();
            c10.join();
            c11.join();
            c12.join();
            c13.join();
            c14.join();
            c15.join();
            c16.join();
            c17.join();
            c18.join();
            c19.join();
            c20.join();
            c21.join();
            c22.join();
            c23.join();
            c24.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int pumpSum = 0;
        System.out.println("Maverick has pumped " + maverick.getLowCounter() + " gallons of low-grade gas.");
        if (maverick.getLowCounter() == 168) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        for(GasPump pump : maverick.pumps) {
            System.out.println(pump.pumpName + " has pumped " + pump.getLowCounter() + " gallons of low-grade gas");
            pumpSum += pump.getLowCounter();
        }
        System.out.println("All pumps have served a total of " + pumpSum + " gallons of gas");
        if (pumpSum == 168) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println("Maverick has served " + maverick.getCarCounter() + " cars" );
        if (maverick.getCarCounter() == 24) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        maverick.resetValues();


        System.out.println("\n##### SCENARIO 3 #####");
        System.out.println("     Setup your station with 12 pumps, send 8 cars each asking for 8 gallons of HIGH grade, 10 cars asking for 10 gallons each of MID grade, and 7 cars asking for 7 gallons each of LOW grade.");
        Car bcar2 = new Car(8, "H", "Nord Pinto", maverick);
        Car bcar1 = new Car(8, "H", "Hummber", maverick);
        Car bcar3 = new Car(8, "H", "Jord Squinto", maverick);
        Car bcar4 = new Car(8, "H", "Yord Binto", maverick);
        Car bcar5 = new Car(8, "H", "Tord Tinto", maverick);
        Car bcar6 = new Car(8, "H", "Rord Linto", maverick);
        Car bcar7 = new Car(8, "H", "Ford Hinto", maverick);
        Car bcar8 = new Car(8, "H", "Dord Ginto", maverick);

         Car bcar9 = new Car(10, "M", "Bord Finto", maverick);
        Car bcar10 = new Car(10, "M", "Lord Rinto", maverick);
        Car bcar11 = new Car(10, "M", "Quord Winto", maverick);
        Car bcar12 = new Car(10, "M", "Pord Sinto", maverick);
        Car bcar13 = new Car(10, "M", "Kord Zinto", maverick);
        Car bcar14 = new Car(10, "M", "Mord Vinto", maverick);
        Car bcar15 = new Car(10, "M", "Vord Minto", maverick);
        Car bcar16 = new Car(10, "M", "Zord Ninto", maverick);
        Car bcar17 = new Car(10, "M", "Sord Kinto", maverick);
        Car bcar18 = new Car(10, "M", "Cord Yinto", maverick);

        Car bcar19 = new Car(7, "L", "Hord Quinto", maverick);
        Car bcar20 = new Car(7, "L", "Word Jinto", maverick);
        Car bcar21 = new Car(7, "L", "Oord Plinto", maverick);
        Car bcar22 = new Car(7, "L", "Iord Pintoo", maverick);
        Car bcar23 = new Car(7, "L", "Plord Ponto", maverick);
        Car bcar24 = new Car(7, "L", "Stord Punto", maverick);
        Car bcar25 = new Car(7, "L", "Gourd Punto", maverick);


        Thread bc1 = new Thread(bcar1, "Car 1");
        Thread bc2 = new Thread(bcar2, "Car 2");
        Thread bc3 = new Thread(bcar3, "Car 3");
        Thread bc4 = new Thread(bcar4, "Car 4");
        Thread bc5 = new Thread(bcar5, "Car 5");
        Thread bc6 = new Thread(bcar6, "Car 6");
        Thread bc7 = new Thread(bcar7, "Car 7");
        Thread bc8 = new Thread(bcar8, "Car 8");
        Thread bc9 = new Thread(bcar9, "Car 9");
        Thread bc10 = new Thread(bcar10, "Car 10");
        Thread bc11 = new Thread(bcar11, "Car 11");
        Thread bc12 = new Thread(bcar12, "Car 12");
        Thread bc13 = new Thread(bcar13, "Car 13");
        Thread bc14 = new Thread(bcar14, "Car 14");
        Thread bc15 = new Thread(bcar15, "Car 15");
        Thread bc16 = new Thread(bcar16, "Car 16");
        Thread bc17 = new Thread(bcar17, "Car 17");
        Thread bc18 = new Thread(bcar18, "Car 18");
        Thread bc19 = new Thread(bcar19, "Car 19");
        Thread bc20 = new Thread(bcar20, "Car 20");
        Thread bc21 = new Thread(bcar21, "Car 21");
        Thread bc22 = new Thread(bcar22, "Car 22");
        Thread bc23 = new Thread(bcar23, "Car 23");
        Thread bc24 = new Thread(bcar24, "Car 24");
        Thread bc25 = new Thread(bcar25, "Car 25");

        bc1.start();
        bc2.start();
        bc3.start();
        bc4.start();
        bc5.start();
        bc6.start();
        bc7.start();
        bc8.start();
        bc9.start();
        bc10.start();
        bc11.start();
        bc12.start();
        bc13.start();
        bc14.start();
        bc15.start();
        bc16.start();
        bc17.start();
        bc18.start();
        bc19.start();
        bc20.start();
        bc21.start();
        bc22.start();
        bc23.start();
        bc24.start();
        bc25.start();

        List<Car> bcars = new ArrayList<Car>(){{
            add(bcar1);
            add(bcar2);
            add(bcar3);
            add(bcar4);
            add(bcar5);
            add(bcar6);
            add(bcar7);
            add(bcar8);
            add(bcar9);
            add(bcar10);
            add(bcar11);
            add(bcar12);
            add(bcar13);
            add(bcar14);
            add(bcar15);
            add(bcar16);
            add(bcar17);
            add(bcar18);
            add(bcar19);
            add(bcar20);
            add(bcar21);
            add(bcar22);
            add(bcar23);
            add(bcar24);
            add(bcar25);
        }};

        Collections.shuffle(bcars);

        List<Car> bwaitingCars = new ArrayList<Car>(){{
            for(Car car:bcars) {
                if (car.assignedPump == null) {
                    add(car);
                }
            }
        }};

        Iterator<Car> bitr = bwaitingCars.iterator();
        while (!bwaitingCars.isEmpty() && bitr.hasNext()) {
            while(bitr.hasNext()){
                Car car = bitr.next();
                if (maverick.assignPump(car)) {
                    bitr.remove();
                }
            }
        }

        try {
            bc1.join();
            bc2.join();
            bc3.join();
            bc4.join();
            bc5.join();
            bc6.join();
            bc7.join();
            bc8.join();
            bc9.join();
            bc10.join();
            bc11.join();
            bc12.join();
            bc13.join();
            bc14.join();
            bc15.join();
            bc16.join();
            bc17.join();
            bc18.join();
            bc19.join();
            bc20.join();
            bc21.join();
            bc22.join();
            bc23.join();
            bc24.join();
            bc25.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int lowAmt = 0;
        int medAmt = 0;
        int highAmt = 0;
        System.out.println("Maverick has pumped " + maverick.getLowCounter() + " gallons of low-grade gas.");
        if (maverick.getLowCounter() == 49) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println("Maverick has pumped " + maverick.getMedCounter() + " gallons of mid-grade gas.");
        if (maverick.getMedCounter() == 100) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println("Maverick has pumped " + maverick.getHighCounter() + " gallons of high-grade gas.");
        if (maverick.getHighCounter() == 64) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }

        for(GasPump pump : maverick.pumps) {
            System.out.println(pump.pumpName + " has pumped " + pump.getLowCounter() + " gallons of low-grade gas");
            lowAmt += pump.getLowCounter();
            System.out.println(pump.pumpName + " has pumped " + pump.getMedCounter() + " gallons of mid-grade gas");
            medAmt += pump.getMedCounter();
            System.out.println(pump.pumpName + " has pumped " + pump.getHighCounter() + " gallons of high-grade gas");
            highAmt += pump.getHighCounter();
        }
        System.out.println(lowAmt + " gallons of low-grade gas were across all pumps");
        if (lowAmt == 49) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println(medAmt + " gallons of mid-grade gas were across all pumps");
        if (medAmt == 100) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        System.out.println(highAmt + " gallons of high-grade gas were across all pumps");
        if (highAmt == 64) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }

        System.out.println("Maverick has served " + maverick.getCarCounter() + " cars" );
        if (maverick.getCarCounter() == 25) {
            System.out.println("***PASSED");
        } else { System.out.println("***FAILED"); }
        maverick.resetValues();

    }
}
