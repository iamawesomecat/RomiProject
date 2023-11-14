package frc.robot;

import frc.robot.subsystems.DrivebaseSubsystem;

public class Subsystems {
    // Declare subsystem variables here
    public DrivebaseSubsystem drivebaseSubsystem;
    public static final boolean DRIVEBASE_ENABLED = true;


    // Constructor
    public Subsystems() {
        // initialize subsystems here
        if (DRIVEBASE_ENABLED) {
			drivebaseSubsystem = new DrivebaseSubsystem();
		}
    }
}
