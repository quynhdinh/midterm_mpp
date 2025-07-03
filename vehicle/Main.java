
public class Main {
    public static void main(String[] args) {
        Owner amine = new Owner("Amine");
        Vehicle car = new Vehicle(amine, "Bike");
        System.out.println(amine.getName());
        System.out.println(car.getOnwer().getName());
    }
}

