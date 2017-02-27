package org.usfirst.frc.team3560.robot.commands;

import org.usfirst.frc.team3560.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinIntake extends Command {

    public SpinIntake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.getToolRightBumper()) { // Binds Right Trigger on Toolstick to Intake balls
    		Robot.Intake.MotorIntake(.75);
    	}
    	else if (Robot.oi.getToolLeftBumper()) { // Binds Left Trigger on Toolstick to Outake balls
    		Robot.Intake.MotorIntake(-.75);
    	}
    	else {
    		Robot.Intake.MotorIntake(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Intake.MotorIntake(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Intake.MotorIntake(0);

    }
}
