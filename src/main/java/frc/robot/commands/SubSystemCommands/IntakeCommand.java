package frc.robot.commands.SubSystemCommands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Intake;

public class IntakeCommand extends Command
{
    Intake _intake;
    double power;
   public IntakeCommand(Intake _Intake, double speed)
   {
        this._intake = _Intake;
        power = speed;
        addRequirements(_intake);
   } 
   public void setSpeed(double speed)
   {
     this.power = speed;
   }
   @Override
   public void execute()
   {
        _intake.rotate(power);
   }
}