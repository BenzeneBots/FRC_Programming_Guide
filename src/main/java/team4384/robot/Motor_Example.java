package team4384.robot;

import com.revrobotics.CANSparkMax;

public class Motor_Example extends CANSparkMax {
    public Motor_Example(int CAN_ID) {
        super(CAN_ID, MotorType.kBrushless);
    }

    public void up() {
        this.setInverted(false);
        this.set(10);
    }

    public void down(){
        this.setInverted(true);
        this.set(10);
    }

    public void stop() {
        this.stopMotor();
    }
}
