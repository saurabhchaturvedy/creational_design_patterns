package factory_method_solution;

public class Client {

    public static void main(String[] args) {
        TransportFactory transportFactory = new BikeFactory();
        Transport transport = transportFactory.create();
        transport.drive();
        transportFactory = new CarFactory();
        transport = transportFactory.create();
        transport.drive();
    }
}
