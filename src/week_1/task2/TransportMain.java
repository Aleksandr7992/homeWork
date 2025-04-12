package week_1.task2;

public class TransportMain {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Embraer", 3, 2, 2, 20);
        Helicopter helicopter1 = new Helicopter("Sikorsky", 3, 2, 10);
        Cutter cutter1 = new Cutter("Apparel", 2, 5);
        Tanker tanker1 = new Tanker("K12", 2, 20000);
        Truck truck1 = new Truck("JAC", 6,40);
        Taxi taxi1 = new Taxi("Kia", 4);
        System.out.println(taxi1.getType() + " " + taxi1.getModelName()+ " Количество колес: " + taxi1.getNumberWheels());
    }
}
