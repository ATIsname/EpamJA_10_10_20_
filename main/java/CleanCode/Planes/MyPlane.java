package CleanCode.Planes;

//Do we really need this class?
public class MyPlane  extends Plane {
    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
