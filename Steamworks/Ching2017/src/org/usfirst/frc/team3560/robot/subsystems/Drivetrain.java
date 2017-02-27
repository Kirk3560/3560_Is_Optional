package org.usfirst.frc.team3560.robot.subsystems;

import org.usfirst.frc.team3560.robot.RobotMap;
import org.usfirst.frc.team3560.robot.commands.JoystickDriving;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Drivetrain extends Subsystem {
private CANTalon motor1,motor2,motor3,motor4;

public Drivetrain() {
	motor1 = new CANTalon(RobotMap.motorMap.MOTORT_FRONT_LEFT);
	motor2 = new CANTalon(RobotMap.motorMap.MOTORT_FRONT_RIGHT);
	motor3 = new CANTalon(RobotMap.motorMap.MOTORT_BACK_LEFT);
	motor4 = new CANTalon(RobotMap.motorMap.MOTORT_BACK_RIGHT);
	
	LiveWindow.addActuator("Drivetrain", "Front Left CIM", (CANTalon)motor1);
	LiveWindow.addActuator("Drivetrain", "Front Right CIM", (CANTalon)motor2);
	LiveWindow.addActuator("Drivetrain", "Back Left CIM", (CANTalon)motor3);
	LiveWindow.addActuator("Drivetrain", "Back Right CIM", (CANTalon)motor4);
}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new JoystickDriving());
    }
    public void driveRight(double speed) {
    	motor2.set(speed);
    	motor4.set(speed);
    	Timer.delay(.01);
    }
    public void driveLeft(double speed) {
    	motor1.set(-speed);
    	motor3.set(-speed);
    	Timer.delay(.01);
    }
    public void drive(double speed) {
    	driveLeft(speed);
    	driveRight(speed);
    }
    public void fullStop() {
    	drive(0);
    }
}

