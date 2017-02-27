    
package org.usfirst.frc.team3560.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team3560.robot.commands.AutonLeft;
import org.usfirst.frc.team3560.robot.commands.AutonMiddle;
import org.usfirst.frc.team3560.robot.commands.AutonRight;
import org.usfirst.frc.team3560.robot.commands.NoAuton;
import org.usfirst.frc.team3560.robot.subsystems.Drivetrain;
import org.usfirst.frc.team3560.robot.subsystems.Climber;
import org.usfirst.frc.team3560.robot.subsystems.Intake;
import org.usfirst.frc.team3560.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final Drivetrain Drivetrain = new Drivetrain();
	public static final Climber Climber = new Climber();
	public static final Intake Intake = new Intake();
	public static final Shooter Shooter = new Shooter();
	public static OI oi;

    Command autonomousCommand;
    SendableChooser<Command> autoChooser;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		CameraServer.getInstance().startAutomaticCapture(); // Camera Enabling
		autoChooser = new SendableChooser<Command>();
		autoChooser.addDefault("No Auton", new NoAuton());
		autoChooser.addObject("Auton Middle", new AutonMiddle());
		autoChooser.addObject("Auton Left", new AutonLeft());
		autoChooser.addObject("Auton Right", new AutonRight());
		SmartDashboard.putData("Auton Selecter", autoChooser);
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        autonomousCommand = (Command) autoChooser.getSelected(); // Giving different Options for Auton towards Dashboard
        autonomousCommand.start();        
		 /*String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "AutonMiddle":
			autonomousCommand = new AutonMiddle();
			break;
		case "AutonLeft":
			autonomousCommand = new AutonLeft();
			break;
		case "AutonRight":
			autonomousCommand = new AutonRight();
			break;
		case "NoAuton":
		default:
			autonomousCommand = new NoAuton();
			break;
		} 
    	*/
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
