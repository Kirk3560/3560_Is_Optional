package org.usfirst.frc.team3560.robot.commands;

import org.usfirst.frc.team3560.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonBase extends Command {
	
	double timeOut,leftSpeed,rightSpeed,delay;

    public AutonBase(double timeOut, double leftSpeed, double rightSpeed, double delay) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.timeOut = timeOut;
    	this.leftSpeed = leftSpeed;
    	this.rightSpeed = rightSpeed;
    	this.timeOut = delay;
    	requires (Robot.Drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(timeOut);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drivetrain.driveLeft(leftSpeed);
    	Robot.Drivetrain.driveRight(rightSpeed);
    	Timer.delay(delay);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Drivetrain.driveLeft(0);
    	Robot.Drivetrain.driveRight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Drivetrain.driveLeft(0);
    	Robot.Drivetrain.driveRight(0);
    }
}
