package org.usfirst.frc.team3560.robot.subsystems;

import org.usfirst.frc.team3560.robot.RobotMap;
import org.usfirst.frc.team3560.robot.commands.SpinShooter;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Shooter extends Subsystem {
	private VictorSP motor1, motor2;
	private Encoder enc;
	 
	public Shooter() {
		motor1 = new VictorSP(RobotMap.motorMap.MOTORV_SHOOTER_LEFT);
		motor2 = new VictorSP(RobotMap.motorMap.MOTORV_SHOOTER_RIGHT);
		
		enc = new Encoder(4,5,false,Encoder.EncodingType.k4X);
		enc.setMaxPeriod(.1);
		enc.setMinRate(50);
		enc.setDistancePerPulse(90);
		enc.setReverseDirection(false);
		
		
		LiveWindow.addActuator("Shooter", "Shooter Left Motor", motor1);
		LiveWindow.addActuator("Shooter", "Shooter Right Motor", motor2);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand (new SpinShooter());
    }
    public void Spin(double speed) {
    	motor1.set(-speed);
    	motor2.set(speed);
    }
}

