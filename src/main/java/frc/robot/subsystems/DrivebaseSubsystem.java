package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DrivebaseSubsystem extends SubsystemBase {




    private Spark m_leftMotor;
    private Spark m_rightMotor;


    private Encoder m_leftEncoder;
    private Encoder m_rightEncoder;

    
    private DifferentialDrive m_diffDrive;


    public DrivebaseSubsystem() {
        //Deadband takes care of the range of values for stick drift
        //O is for very accurate controllers
        m_leftMotor = new Spark(0);
        m_rightMotor = new Spark(1);
        m_leftMotor.setInverted(true);
        m_leftEncoder = new Encoder(4, 5);
        m_rightEncoder = new Encoder(6, 7);
        m_diffDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
        m_diffDrive.setDeadband(0);
    }
    //reference this method in the DriveCommand, then bind the command to controls.
    public void arcadeDrive(double xaxisSpeed, double zaxisRotate, boolean squareInputs){
        m_diffDrive.arcadeDrive(xaxisSpeed, zaxisRotate, squareInputs);
        //System.out.println(m_leftMotor.get());
    }

    public void forward() {
        m_leftMotor.set(1);
        m_rightMotor.set(1);
        //System.out.println("forward");
    }
}
