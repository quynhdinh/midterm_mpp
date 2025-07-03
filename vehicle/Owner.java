import java.util.ArrayList;
import java.util.List;

public class Owner {
    private List<Vehicle> vehicles;
    private String name;
    public Owner(String n) {
        this.name = n;
        this.vehicles = new ArrayList<>();
    }
    private Owner(){}
    public void addVehicle(Vehicle v){
        this.vehicles.add(v);
    }
    @Override
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
}
