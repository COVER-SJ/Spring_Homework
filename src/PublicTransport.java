public class PublicTransport {
    int gas = 100;

    // 차량 번호
    public int Number() {
        return (int)(Math.random()*10000+1);
    }

    //번호가 같은지 확인
    public void NumCompare(String name, int num1, int num2) {
        if(num1 == num2) {
            System.out.println(name+"번호가 같습니다. 다시 설정합니다.");
            num2 = Number();
        }else System.out.println(name+"1의 번호 : "+ num1 +", "+name+"2의 번호 : "+num2);
    }

    // 주유량
    public void Gas (int useGas) {

        gas += useGas;
        if(gas <= 0) {
            System.out.println("주유량 = "+ gas +"\n주유 필요");
        }else {
            System.out.println("주유량 = "+ gas);
        }
    }

    //속도
    public int Speed (int plus) {
        int speed = 0;
        speed += plus;
        return speed;
    }

    //승객 수
    public void BusPassenger (int boardingNum) {
        int MaxPassenger = 0;
        int busPassenger = 30;
        int fare = 1000;

        busPassenger -= boardingNum;
        MaxPassenger += boardingNum;

        if(MaxPassenger > 30 ) {
            System.out.println("최대 승객 수 초과");
            MaxPassenger -= boardingNum;
        }else {
            System.out.println("탑승 승객 수 = " + boardingNum);
            System.out.println("잔여 승객 수 = " + busPassenger);
            System.out.println("기본 요금 확인 = " + fare);
        }
    }

    public void TaxiPassenger (int boardingNum) {
        int MaxPassenger = 0;
        int Passenger = 4;
        int fare = 3000;

        Passenger -= boardingNum;
        MaxPassenger += boardingNum;

        if(MaxPassenger > 4 ) {
            System.out.println("최대 승객 수 초과");
            MaxPassenger -= boardingNum;
        }else {
            System.out.println("탑승 승객 수 = " + boardingNum);
            System.out.println("잔여 승객 수 = " + Passenger);
            System.out.println("기본 요금 확인 = " + fare);
        }
    }

    public void Condition(Boolean condition) {
        if(condition == true) System.out.println("상태 = 운행 중");
        else System.out.println("상태 = 운행 불가");
    }
}
