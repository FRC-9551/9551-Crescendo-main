package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Chassis;

public class AutoDrive extends Command
{

    Chassis _autonChassis;
    int autonTurn;
    double autonSpeed;

    public AutoDrive(Chassis _Chassis, double speed)
    {
        _autonChassis = _Chassis;
        autonSpeed = speed;
        autonTurn = 0;
    }

    public AutoDrive(Chassis _Chassis, double speed, int turn)
    {
        _autonChassis = _Chassis;
        autonSpeed = speed;
        autonTurn = turn;
    }

    @Override
    public void execute()
    {
        _autonChassis.Drive(autonTurn, autonSpeed);
    }
}