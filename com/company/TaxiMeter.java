import java.util.*;

class Taxi{
    int taxiNO,otp;
    String name;
    double km, bill;
    Scanner sc = new Scanner(System.in);
    Random rc = new Random();

    public void TaxiDetails(){

        System.out.println("You have booked a taxi using my app KUBER");
        System.out.println("Enter Rider's Name:");
        name = sc.nextLine();
        taxiNO = rc.nextInt(1000,9999);
        otp = rc.nextInt(1000,9999);

        System.out.println("\nHere are your taxi details :");
        System.out.println("Taxi No. " + taxiNO + "\tRider's Name: " + name + "\tYour OTP:" + otp );   
    }

    public void Calculate(){
        System.out.println("\nPLEASE NOTE:Our service provides maximum journey of 1000km only.");

        System.out.println("Enter the total distance of your journey in km ");
        km = sc.nextDouble();
        if(km<1000) {
        if (km < 1){
            bill = 6*km;
        }
        else if (km>1 && km<5){
            bill = 10*km;
        }
        else if (km>5 && km<10){
            bill = 15*km;
        }
        else if (km>10 && km< 20){
            bill = 20*km;
        }
        else {
            bill = 30*km;
        }
        System.out.println("\nTotal bill of the journey is Rs" + bill + "/-");
    }
    else{
        System.out.println("\nOur services is limited only under 1000 km.Sorry for the inconvenience! ");
    }
    }
}

public class TaxiMeter {
    public static void main(String [] args){
        Taxi cab = new Taxi();
        cab.TaxiDetails();
        cab.Calculate();
    }

}
