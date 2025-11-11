package frc.robot.commands.DefaultCommands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.JoystickConstants;
import frc.robot.commands.SubSystemCommands.ArmCommand;
import frc.robot.subsystems.Arm;

public class ArmDefaultCommand extends Command{
    
    Arm _arm;
    
    Joystick _joystick;
    
    ArmCommand _ArmsCommand;

    public ArmDefaultCommand(Arm _Arm, Joystick _Joystick)
    {
        _arm = _Arm;

        _joystick = _Joystick;

        _ArmsCommand = new ArmCommand(_Arm, 1);

        addRequirements(_arm);
    }

    @Override
    public void execute()
    {
        if(_joystick.getPOV() == JoystickConstants.PovUp)
        {
            _ArmsCommand.setSpeed(1);
            _ArmsCommand.execute();
        }
        else if(_joystick.getPOV() == JoystickConstants.PovDown)
        {
            _ArmsCommand.setSpeed(-0.85);
            _ArmsCommand.execute();
        }
        else if(_joystick.getPOV() == JoystickConstants.PovIdle)
        {
            _ArmsCommand.setSpeed(0);
            _ArmsCommand.execute();
        }
    }
}
