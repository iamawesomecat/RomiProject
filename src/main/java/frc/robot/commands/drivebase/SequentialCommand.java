package frc.robot.commands.drivebase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Subsystems;
import frc.robot.subsystems.DrivebaseSubsystem;
 
public class SequentialCommand extends SequentialCommandGroup {
 
    private DrivebaseSubsystem drivebaseSubsystem;
 
    public SequentialCommand(DrivebaseSubsystem drivebaseSubsystem) {
        this.drivebaseSubsystem = drivebaseSubsystem;
 
        // adds the commands in order 4!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("Sequence started?");
        addCommands(new AutoDriveCommand(drivebaseSubsystem, 1, 0).withTimeout(4),
                    new AutoDriveCommand(drivebaseSubsystem, 0.3, 0.5).withTimeout(4),
                    new AutoDriveCommand(drivebaseSubsystem, 0, 0).withTimeout(1));
    }
}
