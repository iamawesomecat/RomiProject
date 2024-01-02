package frc.robot.commands.drivebase;


import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivebaseSubsystem;

public class DriveCommand extends CommandBase {


    private DrivebaseSubsystem drivebaseSubsystem;
    private DoubleSupplier forward;
    private DoubleSupplier turning;


    public DriveCommand(DrivebaseSubsystem drivebaseSubsystem, DoubleSupplier forward, DoubleSupplier turning){
        this.drivebaseSubsystem = drivebaseSubsystem;
        this.forward = forward;
        this.turning = turning;
        addRequirements(drivebaseSubsystem);
    }


    @Override
    public void execute(){
        drivebaseSubsystem.arcadeDrive(forward.getAsDouble(), (turning.getAsDouble() * 0.5), true);
    }

    
}