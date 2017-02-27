package org.usfirst.frc.team3560.robot.commands;

import org.usfirst.frc.team3560.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinClimber extends Command {
	
    public SpinClimber() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.getToolXButton()) {
    		Robot.Climber.Climb(.1);
    	} 
    	// Binds left bumper to motor - spins backward
    	
    	else if (Robot.oi.getToolYButton()) {
    		Robot.Climber.Climb(.95);
    	}
    	//Binds right bumper to motor - spins forward
    	
    	else if (Robot.oi.getToolAButton()) {
    		Robot.Climber.Climb(.25);
    	}
    	else if (Robot.oi.getToolBButton()) {
    		Robot.Climber.Climb(.7);
    	}
    	else {
    		Robot.Climber.Climb(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Climber.Climb(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Climber.Climb(0);
    }
}
