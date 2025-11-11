package frc.robot.commands.SubSystemCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class ArmCommand extends Command
{
    Arm Arms;
    double power;
   public ArmCommand(Arm arms1, double speed)
   {
        this.Arms = arms1;
        power = speed;
        addRequirements(Arms);
   } 
   public void setSpeed(double speed)
   {
     this.power = speed;
   }
   @Override
   public void execute()
   {
        Arms.armsMove(power);
   }
}