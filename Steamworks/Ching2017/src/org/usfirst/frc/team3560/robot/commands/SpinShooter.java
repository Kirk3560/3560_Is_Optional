package org.usfirst.frc.team3560.robot.commands;

import org.usfirst.frc.team3560.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinShooter extends Command {

    public SpinShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.getToolRightTrigger()) {
    		Robot.Shooter.Spin(.5);
    	}
    	else if(Robot.oi.getToolLeftTrigger()) {
    		Robot.Shooter.Spin(-.5);
    	}
    	else {
    		Robot.Shooter.Spin(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Shooter.Spin(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Shooter.Spin(0);
    }
}
