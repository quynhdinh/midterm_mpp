public class Vehicle {
    private Owner onwer;
    private String type;
    Vehicle(Owner o, String type){
        this.type = type;
        this.onwer = o;
    }
    // make sure user can only instantiate Vehicle using the other constructor
    private Vehicle(){}
    public Owner getOnwer() {
        return onwer;
    }
    public String getType() {
        return type;
    }
}
