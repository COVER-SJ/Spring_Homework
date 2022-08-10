import javax.xml.transform.Source;

public class Taxi extends PublicTransport{
    String distance = ""; // 목적지
    int fare = 3000; //기본요금
    int maxPay = 0;

    int distanceFare = 1000; //거리당 요금

    //지불할 요금
    public void plusDistance(int arrivalDistance) {
        int sumFare = 0;
        System.out.println("기본 요금 확인 = "+fare);
        sumFare += arrivalDistance*1000;
        System.out.println("지불할 요금 = " + sumFare);
    }

    public void TaxiPassenger (int boardingNum) {
        super.TaxiPassenger(boardingNum);
    }

    public void Distance (String space, int arrivalDistance){
        int pay = 3000+distanceFare*(arrivalDistance-1);
        maxPay += pay;
        System.out.println("목적지 = "+space);
        System.out.println("목적지까지 거리 = "+arrivalDistance+"km");
        System.out.println("지불할 요금 = "+pay);
    }

    public void Fare() {

        System.out.println("누적 요금 = "+maxPay);
        maxPay = 0;
    }
}
