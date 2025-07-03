public class Vehicle {
    private Owner onwer;
    private String type;
    Vehicle(Owner o, String type){
        this.type = type;
        this.onwer = o;
    }
    private Vehicle(){}
    public Owner getOnwer() {
        return onwer;
    }
}
