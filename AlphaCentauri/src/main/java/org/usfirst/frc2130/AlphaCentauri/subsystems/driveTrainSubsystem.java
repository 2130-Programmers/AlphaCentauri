// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2130.AlphaCentauri.subsystems;


import org.usfirst.frc2130.AlphaCentauri.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class driveTrainSubsystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX leftMotorMaster;
    private WPI_VictorSPX leftMotorSlave;
    private SpeedControllerGroup leftSideGroup;
    private WPI_TalonSRX rightMotorMaster;
    private WPI_VictorSPX rightMotorSlave;
    private SpeedControllerGroup rightSideGroup;
    private DifferentialDrive differentialDrive;
    private DoubleSolenoid shiftingSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public driveTrainSubsystem() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftMotorMaster = new WPI_TalonSRX(2);
        
        
        
        leftMotorSlave = new WPI_VictorSPX(8);
        
        
        
        leftSideGroup = new SpeedControllerGroup(leftMotorMaster, leftMotorSlave  );
        addChild("leftSideGroup",leftSideGroup);
        
        
        rightMotorMaster = new WPI_TalonSRX(0);
        
        
        
        rightMotorSlave = new WPI_VictorSPX(1);
        
        
        
        rightSideGroup = new SpeedControllerGroup(rightMotorMaster, rightMotorSlave  );
        addChild("rightSideGroup",rightSideGroup);
        
        
        differentialDrive = new DifferentialDrive(leftSideGroup, rightSideGroup);
        addChild("differentialDrive",differentialDrive);
        differentialDrive.setSafetyEnabled(true);
        differentialDrive.setExpiration(0.1);
        differentialDrive.setMaxOutput(1.0);

        
        shiftingSolenoid = new DoubleSolenoid(0, 4, 5);
        addChild("shiftingSolenoid",shiftingSolenoid);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

