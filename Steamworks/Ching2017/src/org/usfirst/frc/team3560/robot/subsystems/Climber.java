package org.usfirst.frc.team3560.robot.subsystems;

import org.usfirst.frc.team3560.robot.RobotMap;
import org.usfirst.frc.team3560.robot.commands.SpinClimber;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Climber extends Subsystem {
	private VictorSP motor1,motor2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
public Climber() {
	motor1 = new VictorSP(RobotMap.motorMap.MOTORV_CLIMBER_LEFT);
	motor2 = new VictorSP(RobotMap.motorMap.MOTORV_CLIMBER_RIGHT);
	
	LiveWindow.addActuator("Climber","LeftClimber", motor1);
	LiveWindow.addActuator("Climber", "RightClimber", motor2);
}
public void Climb(double speed) {
	motor1.set(speed);
	motor2.set(speed);
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new SpinClimber());
    }
}

