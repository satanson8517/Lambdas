package lambdas;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 05/01/2016
 */
public class Vehicles implements Runnable {

    @Override
    public void run() {
        Vehicle vehicle = new Car();
        vehicle.print();
    }

    interface Vehicle {

        default void print() {
            System.out.println("I am a vehicle!");
        }

        static void blowHorn() {
            System.out.println("Blowing horn!!!");
        }
    }

    interface FourWheeler {

        default void print() {
            System.out.println("I am a four wheeler!");
        }
    }

    class Car implements Vehicle, FourWheeler {

        @Override
        public void print() {
            Vehicle.super.print();
            FourWheeler.super.print();
            Vehicle.blowHorn();
            System.out.println("I am a car!");
        }
    }

}
