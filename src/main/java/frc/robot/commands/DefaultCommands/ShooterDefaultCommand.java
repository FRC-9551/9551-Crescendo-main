package frc.robot.commands.DefaultCommands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.SubSystemCommands.ShooterCommand;
import frc.robot.subsystems.Shooter;

public class ShooterDefaultCommand extends Command{
    
    Shooter _shooter;
    
    Joystick _joystick;

    ShooterCommand _shooterCommand;

    public ShooterDefaultCommand(Shooter _Shooter, Joystick _Joystick)
    {
        _shooter = _Shooter;

        _joystick = _Joystick;

        _shooterCommand = new ShooterCommand(_shooter, 0);

        addRequirements(_shooter);
    }

    @Override
    public void execute()
    {
        if(_joystick.getRawButton(8))
        {
            _shooterCommand.setSpeed(1);
            _shooterCommand.execute();
        }
        else
        {
            _shooterCommand.setSpeed(0);
            _shooterCommand.execute();
        }
    }
}
