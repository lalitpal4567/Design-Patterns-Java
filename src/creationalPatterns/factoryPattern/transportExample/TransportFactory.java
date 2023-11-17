package creationalPatterns.factoryPattern.transportExample;

public class TransportFactory{
        public Transport createTransport(String transportType) {
            if (transportType == null) {
                return null;
            }

            if (transportType.equalsIgnoreCase("CAR")) {
                return new Car();
            } else if (transportType.equalsIgnoreCase("BICYCLE")) {
                return new Cycle();
            } else if (transportType.equalsIgnoreCase("MOTORCYCLE")) {
                return new MotorCycle();
            }

            return null;
        }
}
