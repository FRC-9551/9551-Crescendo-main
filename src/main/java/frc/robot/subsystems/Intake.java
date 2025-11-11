package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.RobotContainer;

public class Intake extends SubsystemBase {
  private CANSparkMax intakeMotor = new CANSparkMax(15, MotorType.kBrushless);
  /** Creates a new Elevator. */
  public Intake() 
  {
    intakeMotor.restoreFactoryDefaults();

    intakeMotor.setSmartCurrentLimit(65);

    intakeMotor.burnFlash();
    
  }
  public void rotate(double speed)
  {
    intakeMotor.set(speed);
  }

  public void stop()
  {
    intakeMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}