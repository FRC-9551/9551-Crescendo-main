package frc.robot.commands.SubSystemCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShooterCommand extends Command
{
    Shooter _Shooter;
    double power;
   public ShooterCommand(Shooter shooter, double speed)
   {
        this._Shooter = shooter;
        power = speed;
        addRequirements(_Shooter);
   } 

   public void setSpeed(double speed)
   {
     this.power = speed;
   }

   @Override
   public void execute()
   {
        _Shooter.Shooting(power);
   }
}