package team4384.robot;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Talons_Example {
    // In actually code include CAN_ID in different class and then import
    // CAN_ID can be found on Phoenix Tuner
    private int CAN_ID_1 = 0;
    private int CAN_ID_2 = 1;

    // Very rarely used, on the old tank drives
    private final WPI_TalonSRX front_left = new WPI_TalonSRX(CAN_ID_1);
    // Most likely what you will be using
    private final WPI_TalonFX front_right = new WPI_TalonFX(CAN_ID_1);

    public void main() {
        // Same Control Modes for TalonFX
        front_left.set(TalonSRXControlMode.Current, 10.0);
        front_left.set(TalonSRXControlMode.PercentOutput, 75.0);
        front_left.set(TalonSRXControlMode.Velocity, 75.0);
        front_left.set(TalonSRXControlMode.Position, 75.0);

        // TalonFX
        front_right.set(TalonFXControlMode.PercentOutput, 100.0);

        // For Coupled Motors
        front_left.follow(front_right);
    }
}
