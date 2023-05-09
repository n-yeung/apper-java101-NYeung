package flight;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();

        /*
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.setNumberOfSeats(200);

        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);
         */

        System.out.println("passengers: " + manilaToBoracay.passengers);
        System.out.println("seats: " + manilaToBoracay.seats);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        manilaToBoracay.addPassenger(); //OUTPUT FULL
        System.out.println(
                "Validate Current # of available seats: " + manilaToBoracay.availableSeats);// 0
        System.out.println(
                "Validate Current # of passengers: " + manilaToBoracay.passengers);// 10


        manilaToBoracay.setNumberOfSeats(20);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        System.out.println(
                "Current # of available seats: " + manilaToBoracay.availableSeats);// 7
        System.out.println(
                "Current # of passengers: " + manilaToBoracay.passengers);// 13





    }
}
