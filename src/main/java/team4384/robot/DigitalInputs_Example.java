package team4384.robot;

import edu.wpi.first.wpilibj.DigitalInput;

public class DigitalInputs_Example {
    // Ask Electrical Team about Pin
    DigitalInput limitSwitch = new DigitalInput(0);

    public void main() {
        if (limitSwitch.get()) {
            System.out.println("Limit Switch is Pressed");
        } else {
            // No Pressed
        }

        // Add Additional Input Types
    }
}
