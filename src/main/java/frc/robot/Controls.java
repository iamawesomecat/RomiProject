package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.drivebase.DriveCommand;
import frc.robot.commands.drivebase.SequentialCommand;

public class Controls {
    public static class ControlConstants {
		public static final int CONTROLLER_PORT = 0;
		public static final int CODRIVER_CONTROLLER_PORT = 1;

		public static final double FAST_WRIST_EXTEND_TOLERANCE = 0.5;
	}

    private final CommandXboxController driveController;    
    Subsystems subsystems;

    // Controller + Button Variables
    public final Trigger driveCommand;
    public final Trigger AutoButton;
    // Constructor
    public Controls(Subsystems subsystems) {
        this.subsystems = subsystems;
        driveController = new CommandXboxController(ControlConstants.CONTROLLER_PORT);
        driveCommand = driveController.leftStick();
        AutoButton = driveController.x();
        
        // Initialize Controller and Button variables here
        final Subsystems s;


        // Call Bind Methods
        bindDrivebaseControls();
    }

    // Control Bind Methods
    public void bindDrivebaseControls() {
        subsystems.drivebaseSubsystem.setDefaultCommand(new DriveCommand(subsystems.drivebaseSubsystem, driveController::getLeftY, driveController::getLeftX));
        AutoButton.onTrue(new SequentialCommand(subsystems.drivebaseSubsystem));
    }
}
