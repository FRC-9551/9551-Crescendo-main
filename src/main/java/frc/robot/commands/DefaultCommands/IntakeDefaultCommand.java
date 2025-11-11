package frc.robot.commands.DefaultCommands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.JoystickConstants;
import frc.robot.commands.SubSystemCommands.IntakeCommand;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Intake;

public class IntakeDefaultCommand extends Command{
    
    Intake _intake;
    
    Joystick _joystick;

    IntakeCommand _IntakeCommand;

    public IntakeDefaultCommand(Intake _Intake, Joystick _Joystick)
    {
        _intake = _Intake;

        _joystick = _Joystick;

        _IntakeCommand = new IntakeCommand(_intake, 0);

        addRequirements(_intake);
    }

    @Override
    public void execute()
    {
        if(_joystick.getRawAxis(JoystickConstants.AxisRightStickY) > 0.05)
        {
            _IntakeCommand.setSpeed(0.45);
            _IntakeCommand.execute();
        }
        else if(_joystick.getRawAxis(JoystickConstants.AxisRightStickY) < -0.05)
        {
            _IntakeCommand.setSpeed(-0.45);
            _IntakeCommand.execute();
        }
        else{
        _IntakeCommand.setSpeed(0);
        _IntakeCommand.execute();
        }
    }
}
