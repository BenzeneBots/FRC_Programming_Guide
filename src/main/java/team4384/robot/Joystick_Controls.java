package team4384.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class Joystick_Controls {
    // Find Port on FRC Driver Station
    private final Joystick j1 = new Joystick(0);
    // Find Button Number in FRC Driver Station
    private final JoystickButton b1 = new JoystickButton(j1, 0);

    public void main() {
        if(b1.getAsBoolean()) {
            System.out.println("Button is pressed");
        }

        // Determine Raw Axes in FRC Driver Station
        if(j1.getRawAxis(0) > 0.1) {
            System.out.println("Joystick is moved");
        }
    }
}
