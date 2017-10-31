package org.usfirst.frc.team3453.robot.subsystems;

import org.usfirst.frc.team3453.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private CANTalon leftFrontSRX = null;
	private CANTalon leftBackSRX = null;
	private CANTalon rightFrontSRX = null;
	private CANTalon rightBackSRX = null;
	
	private DoubleSolenoid leftShifter = null;
	private DoubleSolenoid rightShifter = null;
	
	private RobotDrive robotDrive = null;
	
	public Drivetrain() {
		super();
		
		// Drive motors
		leftFrontSRX = new CANTalon(RobotMap.DRIVETRAIN_LEFT_FRONT_SRX);
		leftBackSRX = new CANTalon(RobotMap.DRIVETRAIN_LEFT_BACK_SRX);
		rightFrontSRX = new CANTalon(RobotMap.DRIVETRAIN_RIGHT_FRONT_SRX);
		rightBackSRX = new CANTalon(RobotMap.DRIVETRAIN_RIGHT_BACK_SRX);
		
		leftFrontSRX.enableBrakeMode(true);
		leftBackSRX.enableBrakeMode(true);
		rightFrontSRX.enableBrakeMode(true);
		rightFrontSRX.enableBrakeMode(true);
		
		leftFrontSRX.setSafetyEnabled(false);
		leftBackSRX.setSafetyEnabled(false);
		rightFrontSRX.setSafetyEnabled(false);
		rightBackSRX.setSafetyEnabled(false);
		
		// Drive shifters
		leftShifter = new DoubleSolenoid(RobotMap.DRIVETRAIN_LEFT_SHIFT_UP, RobotMap.DRIVETRAIN_LEFT_SHIFT_DOWN);
		rightShifter = new DoubleSolenoid(RobotMap.DRIVETRAIN_RIGHT_SHIFT_UP, RobotMap.DRIVETRAIN_RIGHT_SHIFT_DOWN);
		
		// Defining robotDrive
		robotDrive = new RobotDrive(leftFrontSRX, leftBackSRX, rightFrontSRX, rightBackSRX);
		
		robotDrive.setSafetyEnabled(false);
	}
	
	public void arcadeDrive(double moveSpeed, double rotateSpeed) {
		robotDrive.arcadeDrive(moveSpeed, rotateSpeed);
	}
	
	public void setSpeed(double speed) {
		leftFrontSRX.set(speed);
		leftBackSRX.set(speed);
		rightFrontSRX.set(-speed);
		rightBackSRX.set(-speed); //reverse these values after a test 
	}
	
	public void shiftUp() {
		leftShifter.set(Value.kForward);
		rightShifter.set(Value.kForward);
	}
	
	public void shiftDown() {
		leftShifter.set(Value.kReverse);
		rightShifter.set(Value.kReverse);
	}
	
	public double getLeftEncoderCount() {
		return leftFrontSRX.getEncPosition();
	}
	
	public double getRightEncoderCount() {
		return rightFrontSRX.getEncPosition();
	}
	
	public void resetEncoderCount() {
		leftFrontSRX.setEncPosition(0);
		rightFrontSRX.setEncPosition(0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		
		
	}
}

