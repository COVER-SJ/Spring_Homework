import java.lang.module.Configuration;
import java.util.concurrent.locks.Condition;

public class Transit {
    public static void main(String [] args) {
        PublicTransport transport = new PublicTransport();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        /*
        버스
         */
        System.out.println("<버스>");
        // 버스 2대 생성, 번호 지정
        int busNum1 = bus1.Number();
        int busNum2 = bus2.Number();
        transport.NumCompare("Bus", busNum1, busNum2);

        // 탑승 승객 수 : 2, 잔여 승객 수 : 28, 요금 확인
        bus1.busPassenger(2);

        // 주유량 -50
        bus1.Gas(-50);

        // 상태변경
        bus1.Condition(false);
        bus1.Gas(10);
        bus1.Condition(true);

        bus1.busPassenger(45);
        bus1.busPassenger(5);

        bus1.Gas(-55);
        bus1.Condition(false);


        /*
        택시
         */
        System.out.println("\n<택시>");
        int taxiNum1 = taxi1.Number();
        int taxiNum2 = taxi2.Number();
        transport.NumCompare("Taxi", taxiNum1, taxiNum2);

        taxi1.Gas(0);
        taxi1.Condition(false);

        taxi1.TaxiPassenger(2);
        taxi1.Distance("서울역", 2);
        taxi1.Condition(true);

        taxi1.Gas(-80);
        taxi1.TaxiPassenger(5);
        taxi1.TaxiPassenger(3);
        taxi1.Distance("구로디지털단지역", 12);
        taxi1.Gas(-20);
        taxi1.Condition(false);
        taxi1.Fare();
    }
}
