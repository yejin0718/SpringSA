public class Bus extends Public_transport{
    public static long present_people = 0;
    public static boolean situation = true;
    public static long price = 1000;
    public Bus(){
        this.present_people = present_people;
        this.situation = situation;
        this.price = price;
    }

    public void Ride_start(){
        if(bus_oil < 10){
            situation = false;
            System.out.println("주유가 필요합니다");
        }
        else{
            System.out.println(bus_num+"번 버스가 운행 상태입니다");
            bus_speed = 60;
        }
    }

    public void Get_bus(long people){
        if(situation == true){
            present_people += people;
            if(present_people <= bus_max_people){
                System.out.println("현재 버스에 승객은 총"+present_people+"명 입니다.");
            }
            else {
                present_people -= people;
                System.out.println("만석입니다.");
            }
        }
    }

    public void change_speed(long c_speed){
        if(bus_oil > 10){
            bus_speed += (c_speed);
            System.out.println("현재 버스 주행 속도 : " + bus_speed);
        }
        else{
            System.out.println("주유량을 확인하세요");
        }
    }


}
