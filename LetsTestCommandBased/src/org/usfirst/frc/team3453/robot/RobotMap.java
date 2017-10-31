package org.usfirst.frc.team3453.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Talons: Drive motors
	public static final int DRIVETRAIN_LEFT_FRONT_SRX = 0;
	public static final int DRIVETRAIN_LEFT_BACK_SRX = 1;
	public static final int DRIVETRAIN_RIGHT_FRONT_SRX = 2;
	public static final int DRIVETRAIN_RIGHT_BACK_SRX = 3;
	
	
	// Solenoids: Drivetrain Shifters
	public static final int DRIVETRAIN_LEFT_SHIFT_UP = 0;
	public static final int DRIVETRAIN_LEFT_SHIFT_DOWN = 1;
	public static final int DRIVETRAIN_RIGHT_SHIFT_UP = 2;
	public static final int DRIVETRAIN_RIGHT_SHIFT_DOWN = 3;
	
	// Joysticks: 
	public static final int JOYSTICK_DRIVER = 0;
	public static final int JOYSTICK_OPERATOR = 1;
	
	// Joystick Axis: 
	public static final int AXIS_DRIVER_SPEED = 1; 
	public static final int AXIS_DRIVER_MOVE = 2;
	public static final int AXIS_DRIVER_ROTATE = 3;
}
