package org.usfirst.frc.team3560.robot;

//import edu.wpi.first.wpilibj.GenericHID.Hand;

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
	
	public class motorMap {
		public static final int MOTORT_FRONT_LEFT               = 1;
		public static final int MOTORT_FRONT_RIGHT              = 3;
		public static final int MOTORT_BACK_LEFT                = 2;
		public static final int MOTORT_BACK_RIGHT               = 4;
		
		public static final int MOTORV_CLIMBER_LEFT             = 0;
		public static final int MOTORV_CLIMBER_RIGHT            = 1;
		
		public static final int MOTORT_INTAKE                   = 3;
		
		public static final int MOTORV_SHOOTER_LEFT             = 2;
		public static final int MOTORV_SHOOTER_RIGHT            = 3;
	}
	
	public class buttonMap {
	    public static final int X_BUTTON                        = 3;
	    public static final int A_BUTTON                        = 1;
	    public static final int B_BUTTON                        = 2;
	    public static final int Y_BUTTON                        = 4;
	    
	    public static final int LEFT_BUMPER                     = 5;
	    public static final int RIGHT_BUMPER                    = 6;
	    public static final int LEFT_TRIGGER                    = 7;
	    public static final int RIGHT_TRIGGER                   = 8;
	    
	    public static final int BACK_BUTTON                     = 9;
	    public static final int START_BUTTON                    = 10;
	    public static final int LEFT_ANALOG_BUTTON              = 11;
	    public static final int RIGHT_ANALOG_BUTTON             = 12;
	}
	
	public class JoyMap {
		public static final int LEFT_ANALOG_X                   = 0;
	    public static final int LEFT_ANALOG_Y                   = 1;
	    public static final int RIGHT_ANALOG_X                  = 4;
	    public static final int RIGHT_ANALOG_Y                  = 5;
	    
	    public static final int DPAD_X                          = 4;
	    public static final int DPAD_Y                          = 5;
	    
		public static final int DRIVESTICK                      = 0;
		public static final int TOOLSTICK                       = 1;
	}
}