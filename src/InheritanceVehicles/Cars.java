package InheritanceVehicles;

public class Cars extends Vehicles {
    int oneway_count;

    Cars(int oneway_count) {
        this.oneway_count = oneway_count;

    }

    public int speed(int kms, int hour) {
        int result = kms / hour + this.oneway_count;

        return result;
    }
}
