package InheritanceVehicles;

public class InheritanceVehicles {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        System.out.println("vehicles.speed : " + vehicles.speed(5, 5));
        System.out.println("vehicles.weight : " + vehicles.weight(5, 5, 5));

        Vans vans = new Vans();
        System.out.println("vans.speed : " + vans.speed(5, 5));
        System.out.println("vans.weight : " + vans.weight(5, 5, 5));

        Cars cars = new Cars(2);
        System.out.println("cars.speed : " + cars.speed(5, 5));
        System.out.println("cars.weight : " + cars.weight(5, 5, 5));
    }
}
