package team4384.robot;

import com.ctre.phoenix.sensors.CANCoder;
import com.ctre.phoenix.sensors.CANCoderConfiguration;

public class Encoders_Example {
    private int CAN_ID = 0;
    private CANCoder encoder = new CANCoder(CAN_ID);

    public void main() {
        // Config
        CANCoderConfiguration configs = new CANCoderConfiguration();
        encoder.setPositionToAbsolute();
        encoder.configFactoryDefault();

        // Getters
        int id = encoder.getDeviceID();
        double pos = encoder.getAbsolutePosition();
        double velocity = encoder.getVelocity();
        double timestamp = encoder.getLastTimestamp();
    }
}
