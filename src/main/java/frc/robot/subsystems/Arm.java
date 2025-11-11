package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  private CANSparkMax Rarms = new CANSparkMax(4, MotorType.kBrushless);
  private CANSparkMax Larms = new CANSparkMax(10, MotorType.kBrushless);
  public Arm() 
  {
    Rarms.restoreFactoryDefaults();
    Larms.restoreFactoryDefaults();
    Rarms.setSmartCurrentLimit(5);
    Larms.setSmartCurrentLimit(5);
    Rarms.burnFlash();
    Larms.burnFlash();
    // rightWheel.burnFlash();
    // leftWheel.burnFlash();
  }
  public void armsMove(double speed)
  {
    Rarms.set(speed);
    Larms.set(-speed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}