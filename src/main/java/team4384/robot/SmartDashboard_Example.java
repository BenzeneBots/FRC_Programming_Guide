package team4384.robot;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SmartDashboard_Example {
    public void main() {
        // Must include key and value
        SmartDashboard.putBoolean("bool", true);
        SmartDashboard.putNumber("int", 4);

        // Retrieve Values
        // Must Include Key and Value if not found
        SmartDashboard.getBoolean("bool", true);
        SmartDashboard.getNumber("int", 0);
    }
}
