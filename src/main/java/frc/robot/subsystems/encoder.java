package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;

public class encoder extends SubsystemBase{
  private CANSparkMax leftMotor = new CANSparkMax(4, MotorType.kBrushless);
  private CANSparkMax rightMotor = new CANSparkMax(15, MotorType.kBrushless);
    int x1;
    int y1;

    public encoder(int x, int y){
    x1 = x;
    y1 = y;
    encoder encoder1 = new encoder(0, 1);
    }
}