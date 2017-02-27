package org.usfirst.frc.team3560.robot.subsystems;

import org.usfirst.frc.team3560.robot.RobotMap;
import org.usfirst.frc.team3560.robot.commands.SpinIntake;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Intake extends Subsystem {
private CANTalon motor1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Intake() {
		motor1 = new CANTalon(RobotMap.motorMap.MOTORT_INTAKE);
		
		LiveWindow.addActuator("Intake", "Intake Motor", motor1);
	}
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new SpinIntake());
    }
    
    public void MotorIntake(double speed) {
    	motor1.set(speed);
    }
}

