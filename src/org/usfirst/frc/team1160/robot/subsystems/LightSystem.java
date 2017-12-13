package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.RobotMap;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * lol nvm
 */
public class LightSystem extends Subsystem implements RobotMap {

	//public TimedLED one,two,three,four,five,six,seven,eight,nine,ten;
	private TimedLED solenoidOne;
	private TimedLED solenoidTwo;
	private Timer time;
	private static LightSystem instance;

	private LightSystem()
	{
		solenoidOne = new TimedLED(PCM,portOne);
		solenoidTwo = new TimedLED(PCM,portTwo);
		time = new Timer();
	}
	public static LightSystem getInstance()
	{
		if (instance == null)
		{
			instance = new LightSystem();
		}
		return instance;
	}
	public void startTime()
	{
		time.reset();
		time.start();
	}
	public boolean done(double finTime){
		if(time.get() >= finTime){
			time.start();
			return true;
		}
		return false;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

