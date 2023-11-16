package frc.robot.commands.drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivebaseSubsystem;

public class AutoDriveCommand extends CommandBase{
    

    private DrivebaseSubsystem drivebaseSubsystem;

    private double forward;
    private double turning;
    private int timesRan;

    public AutoDriveCommand(DrivebaseSubsystem drivebaseSubsystem, double forward, double turning){
        this.drivebaseSubsystem = drivebaseSubsystem;
        this.forward = forward;
        this.turning = turning;
        addRequirements(drivebaseSubsystem);
    }


	@Override
	public void initialize() {
        timesRan++;
        System.out.println("Initializing AutoDriveCommand\nTimes initialized: " + timesRan);
	}
    @Override
    public void execute(){
        drivebaseSubsystem.arcadeDrive(forward, turning, false);
    }
}
