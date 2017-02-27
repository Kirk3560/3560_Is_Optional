package org.usfirst.frc.team3560.robot.commands;

import org.usfirst.frc.team3560.robot.Robot;
//import org.usfirst.frc.team3560.robot.RobotMap;
//import org.usfirst.frc.team3560.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDriving extends Command {

    public JoystickDriving() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires (Robot.Drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Drivetrain.fullStop();
    }
 
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	// Tank Drive
    	// /*
    	if (Robot.oi.getDriveLeftBumper()) {
			Robot.Drivetrain.driveLeft(-.35*Robot.oi.getDriveLeftY());
			Robot.Drivetrain.driveRight( -.35* Robot.oi.getDriveRightY()); 
    	
    	}
    		else if (Robot.oi.getDriveRightBumper()) {
        		Robot.Drivetrain.driveLeft(-.5* Robot.oi.getDriveLeftY());  
        		Robot.Drivetrain.driveRight(-.5* Robot.oi.getDriveRightY());
    	}
    		else {
    			Robot.Drivetrain.driveLeft(-.8*Robot.oi.getDriveLeftY());
    			Robot.Drivetrain.driveRight(-.8*Robot.oi.getDriveRightY());
    		}
    		 // */
    	}
    	//Arcade Drive
    	/*
    	 if (Robot.oi.getDriveLeftBumper()) {
    		 Robot.Drivetrain.driveLeft(.35*Robot.oi.getDriveLeftY()+.5*Robot.oi.getDriveLeftX());
		Robot.Drivetrain.driveRight(.35*Robot.oi.getDriveLeftY()-.5*Robot.oi.getDriveLeftX());
    	}
    		else if(Robot.oi.getDriveRightBumper()) {
    			 Robot.Drivetrain.driveLeft(.5*Robot.oi.getDriveLeftY()+.75*Robot.oi.getDriveLeftX());
		Robot.Drivetrain.driveRight(.5*Robot.oi.getDriveLeftY()-.75*Robot.oi.getDriveLeftX());
    	}
    		else {
    			 Robot.Drivetrain.driveLeft(.8*Robot.oi.getDriveLeftY()+.9*Robot.oi.getDriveLeftX());
		Robot.Drivetrain.driveRight(.8*Robot.oi.getDriveLeftY()-.9*Robot.oi.getDriveLeftX());
    		}
		*/
    	
    	// Surrogate Arcade Drive
    	 /*Creates left and right drive values
    	double driveLeft,driveRight;
    	double moveRobot, turnRobot;
    	
    	//creating and initializing the x and y axis
    	if (Robot.oi.driveStick.getIsXbox() == true )
    	{
	    	moveRobot = Robot.oi.driveStick.getRawAxis(1);
	    	turnRobot = Robot.oi.driveStick.getRawAxis(4);
    	} else 
    	{
        	moveRobot = Robot.oi.driveStick.getY();
        	turnRobot = Robot.oi.driveStick.getX();
    	}
    	
    	//Deadzone for the joystick axis 
    	if(Math.abs(moveRobot) < 0.15){
    		moveRobot = 0;
    	}
    	
    	if(Math.abs(turnRobot) < 0.15){
    		turnRobot = 0;
    	}
    	
    	driveLeft =	( moveRobot) - (turnRobot);
    	driveRight = (moveRobot) + (turnRobot);
    	
    	//applies the value to the drivetrain
    	 if (Robot.oi.getDriveLeftBumper()) {
    		 Robot.Drivetrain.driveLeft(.35*driveLeft); 
    		 Robot.Drivetrain.driveRight(.35*driveRight);
    	}
    		else if(Robot.oi.getDriveRightBumper()) {
    			Robot.Drivetrain.driveLeft(.5*driveLeft);
    	    	Robot.Drivetrain.driveRight(.5*driveRight);
    	}
    		else {
    			Robot.Drivetrain.driveLeft(.8*driveLeft);
    	    	Robot.Drivetrain.driveRight(.8*driveRight);
    		}
    	}
		 */

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Drivetrain.drive(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Drivetrain.drive(0);

    }
}
