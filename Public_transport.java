import java.util.Random;
import java.util.UUID;

public class Public_transport {
    public static long taxi_num = new Random(100).nextInt();
    public static String bus_num = UUID.randomUUID().toString();
    public static long bus_oil = 100;
    public static long taxi_oil = 100;
    public static long bus_speed = 0;
    public static long taxi_speed = 0;
    public static long change_speed = 0;
    public static long bus_max_people = 30;
    public static long taxi_max_people = 4;

    Public_transport(){
        this.taxi_num = taxi_num;
        this.bus_num = bus_num;
        this.bus_oil = bus_oil;
        this.taxi_oil = taxi_oil;
        this.bus_speed = bus_speed;
        this.taxi_speed = taxi_speed;
        this.change_speed = change_speed;
        this.bus_max_people = bus_max_people;
        this.taxi_max_people = taxi_max_people;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.Ride_start();
        bus.Get_bus(10);
        bus.change_speed(10);

        Taxi taxi = new Taxi();
        taxi.Ride_start();
        taxi.Get_on_taxi(4);
        taxi.Change_speed(10);
        taxi.Plus_money(2);

    }



}
