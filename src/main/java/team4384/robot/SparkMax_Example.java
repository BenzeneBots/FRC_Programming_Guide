package team4384.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

public class SparkMax_Example {
    int CAN_ID = 0;
    int CAN_ID_2 = 1;
    // MotorType.kBrushless or MotorType.kBrushed
    // Most Likely Brushless
    CANSparkMax motor = new CANSparkMax(CAN_ID_2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax motor_1 = new CANSparkMax(CAN_ID, CANSparkMaxLowLevel.MotorType.kBrushless);

    public void main() {
        // 10 is the speed
        motor.set(10.0);
        motor.follow(motor_1);
        motor.stopMotor();
        // Get Position
        motor.get();

        // Follows motor but in opposite direction
        motor.follow(motor_1, true);

        motor.setInverted(true);
        boolean inverted = motor.getInverted();
    }
}
