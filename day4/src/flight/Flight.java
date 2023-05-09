package flight;

public class Flight {
    int seats; //instance variables
    int passengers; //instance variables
    int availableSeats;

    Flight(){
        seats = 10;
        passengers = 0;
        availableSeats = seats;
    }

    //TODO validate if there are available seats left. If none, display "Full"
    public void addPassenger(){
        //this.passengers += passenger; //ding's method
       // this.passengers++; //+1 to passengers everytime addPassenger is called
        if(passengers >= this.seats){
            System.out.println("Full");
        }else{
            this.passengers++;
            this.availableSeats = this.seats - this.passengers;
        }
    }

    //TODO set new value of seat so addPassenger is allowed again
    public void setNumberOfSeats(int seats){
       this.seats = seats; //this.seats is the instance variable
       this.availableSeats = this.seats;
    }
}
