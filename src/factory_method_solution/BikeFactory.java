package factory_method_solution;

public class BikeFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Bike();
    }
}
