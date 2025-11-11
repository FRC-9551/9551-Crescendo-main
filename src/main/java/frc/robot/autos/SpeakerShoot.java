package frc.robot.autos;

import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.SubSystemCommands.IntakeCommand;
import frc.robot.commands.SubSystemCommands.ShooterCommand;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

//commands that run at the same time
public class SpeakerShoot extends SequentialCommandGroup {
    public SpeakerShoot(Shooter _Shooter, Intake _Intake) 
    {
        addCommands(
            new ParallelDeadlineGroup(
                //run shooter for 2.25 secs in speed 1
                new ShooterCommand(_Shooter, 1).withTimeout(2.25),
                //run intake from 1.75 to 2.25 for speed -0.65
                new IntakeCommand(_Intake, -0.65).beforeStarting(new WaitCommand(1.75)).withTimeout(2.25)
            )
        );
    }
}
