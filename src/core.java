import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

//Creating the package name maunualy.
package  org.usfirst.frc.team191.core;
  
/*
* This should call all commands and functions
* The main part is for initializing all code
* and making it available to run actions
*/
public class core extends IterativeRobot{
  //Defines variables as memebers of the core (filename)
  Drive myRobot;
  Joystick stick;
  int autoloopCounter;

  //Ininitalizes variables in the coreInit method. This function is called when it is initializing
  public void coreInit() {
    Drive = new RobotDrive(0,1); 
    // This variable assigns our joystick to USB prot one. (One on the farthes right.)
    // If having issues try keeping the Joystick plugged in to a port then change the number +1 to what ever number of usb ports.
    stick =  new Joystick(1);
  }
}

public class Turn {
  //initializing
  //This program will make just one motor turn while the rest of them will not turn.
  //if you have more than one motor then you need to make new var like jaguarmotor-1 or something like that
  Jaguar JaguarMotor = new Jaguar(0);
  //Deadband Elimination - Set to true to have the scaling algorithms eliminate the controller deadband. Set to false (default) to leave the controller deadband intact
  JaguarMotor.enableDeadbandElimination(true);
  //Talon exampleTalon = new Talon(1);
  //TalonSRX exampleTalonSRX = new TalonSRX(2);
  //Victor exampleVictor = new Victor(11);
  //VictorSP exampleVictorSP = new VictorSP(12);
  
  /*
  *
  * Setting Speed
  *
  */
  //this can be a int also with no need for the int command
  //Accepts from -1(Reverse) to 1(Full Speed Forward)
  //Suggested turn spead = 0.5 or 0.7
  JaguarMotor.set(0.5);
  
  
}  

public class Drive{
  RobotDrive drive = new RobotDrive(0,1,2,3) //4 motor drive
  //RobotDrive drive = new RobotDrive(0,1) //2 motor drive
  /*
  * object turn in the opposite direction. This often happens depending on the gearing of the motor and the rest of the drive train. If this happens, you can use the SetInvertedMotor() 
  * 
  * drive.setInvertedMotor(MotorType.kFrontLeft, true);
  *
  */
    
  /*
  Sample Code
  
  public class RobotTemplate extends SampleRobot {

	RobotDrive myDrive;
	Victor frontLeft, frontRight, rearLeft, rearRight;
	
    public void robotInit() {
    	frontLeft = new Victor(1);
    	frontRight = new Victor(2);
    	rearLeft = new Victor (3);
    	rearRight = new Victor (4);
    	myDrive = new RobotDrive(frontLeft, frontRight, rearLeft, rearRight);
    }
  */
    
  /*
  Joystick Driving
  
  public class RobotTemplate extends SampleRobot {

	RobotDrive myDrive;
	Joystick left, right;
	
    public void robotInit() {
    	myDrive = new RobotDrive(1,2,3,4);
    	left = new Joystick(1);
    	right = new Joystick(2);
    }

    public void autonomousPeriodic() {

    }

    public void operatorControl() {
    	while (isOperatorControl() && isEnabled()) {
    		myDrive.tankDrive(left,  right);;
    		Timer.delay(0.01);
    	}
    }
    
    
    
    If you wan the movement commands to be relative to the field, rather than relative to the robot's current heading, you will need to pass in the robot's current angle in place of the 0 above. This angle is usually derived using a Gyro.
  */
} 
// May the force be with you
// LiveWindow is a part of the SmartDashboard that allows you to see inputs and control outputs on the robot from the dashboard when the robot is in Test Mode
public void testPeriodic() {
  LiveWindow.run();
}
