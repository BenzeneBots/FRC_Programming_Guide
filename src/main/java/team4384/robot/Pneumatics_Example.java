package team4384.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics_Example {
    private final Compressor comp = new Compressor(PneumaticsModuleType.CTREPCM);
    private final Solenoid solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 1);

    public void main() {
        // Disable Compressor
        comp.disable();

        // Changing Solenoid Position (Single Solenoid)
        solenoid.set(true);
        solenoid.set(false);
    }
}
