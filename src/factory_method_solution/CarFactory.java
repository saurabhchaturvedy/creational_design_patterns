package factory_method_solution;

public class CarFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Car();
    }
}
