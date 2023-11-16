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
        addCommands(new AutoDriveCommand(drivebaseSubsystem, 1, 0), new WaitCommand(4), new AutoDriveCommand(drivebaseSubsystem, 0.3, 0.5), new WaitCommand(4), new AutoDriveCommand(drivebaseSubsystem, 0, 0));
    }
}
