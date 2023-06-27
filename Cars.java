import java.util.Scanner;
import java.util.UUID;

public class Cars extends Showroom implements Utility{
    String car_name;
    String car_color;
    int car_price;
    String car_fueltype;
    String car_type;
    String car_transmission;
    @Override
    public void get_details() {
        System.out.println("Name : " + car_name);
        System.out.println("Color : " + car_color);
        System.out.println("Fuel Type : " + car_fueltype);
        System.out.println("Price: " + car_price);
        System.out.println("Car Type: " + car_type);
        System.out.println("Transmission : " + car_transmission);

    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ******************************************* ENTER CAR DETAILS ******************************************* ");
        System.out.println();
        System.out.println("Car Name : " );
        car_name=sc.nextLine();
        System.out.println("Car Color : " );
        car_color=sc.nextLine();
        System.out.println("Car Fuel Type (Petrol/Diesel) : " );
        car_fueltype=sc.nextLine();
        System.out.println("Car Price : " );
        car_price=sc.nextInt();
        System.out.println("Car Type : " );
        car_type=sc.nextLine();
        System.out.println("Transmission Type ( Automatic/ Manaual");
        car_transmission=sc.nextLine();
        total_cars_in_stock++;

    }
}
