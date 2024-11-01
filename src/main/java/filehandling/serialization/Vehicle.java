package filehandling.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1842539957097220079L;
    private final String type;
    private final String number;

    public Vehicle(String type, String number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
