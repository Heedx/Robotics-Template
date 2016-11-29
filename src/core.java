/*
* 
* File Name - core.java
* Description -
*   core.java initializes all commands and gives each one a purpose and function.
*   this also runs the code. so what ever we want it to do we would initialize it here.
* 
* Author - Josh Brown
* Date - Nov 29
* Time 4:32
*/

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
