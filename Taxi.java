public class Taxi extends Public_transport{

    public static long basic_distance = 1; //기본거리
    public static long destination_distance = 0; //목적지까지 거리
    public static long basic_price = 3000; //기본 요금
    public static long distance_price = 1000;
    public static long present_people = 0;
    public static String situaion ="일반";

    Taxi(){
        this.basic_distance = basic_distance;
        this.destination_distance = destination_distance;

    }

    public void Ride_start() {
        if (taxi_oil <= 10) {
            System.out.println("주유가 필요합니다");
        } else {
            System.out.println("택시 운행을 시작합니다");
            taxi_speed = 60;
        }
    }

    public void Get_on_taxi(long people){
        if(taxi_oil >= 10){
            present_people += people;
            if(situaion == "일반" && present_people >= taxi_max_people){
                situaion = "운행중";
                System.out.println(situaion);
            }
            else{
                present_people -= people;
                situaion = "탑승불가";
                System.out.println(situaion);
            }
        }
    }

    public void Change_speed(long c_speed){
        if(taxi_oil > 10){
            taxi_speed += (c_speed);
            System.out.println("현재 택시 주행 속도 : " + taxi_speed);
        }
        else{
            System.out.println("주유량을 확인하세요");
        }
    }

    public void Plus_money(long distance){
        if(distance <= basic_distance){
            Print_money(distance);
        }
        else{
            Print_money(distance);
        }
    }

    public void Print_money(long pdistance){

        if(pdistance <= basic_distance){
            System.out.println(basic_price);
        }
        else{
            pdistance -=basic_distance;
            distance_price = basic_price + (1000*pdistance);
            System.out.println(distance_price);
        }

    }



}
