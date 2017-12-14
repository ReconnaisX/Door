package org.usfirst.frc.team1160.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team1160.robot.RobotMap;
import org.usfirst.frc.team1160.robot.commands.JaguarStop;

import edu.wpi.first.wpilibj.Jaguar;
/**
 *
 */
public class SingleJaguar extends Subsystem implements RobotMap{

    private Jaguar jag;
    private static SingleJaguar instance;
    
    public static SingleJaguar getInstance()
    {
    	if (instance == null)
    	{
    		instance = new SingleJaguar();
    	}
    	return instance;
    }
    private SingleJaguar()
    {
    	jag = new Jaguar(JAGUAR);
    }
    public void startJaguar()
    {
    	jag.set(0.38);
    }
    public void stopJaguar()
    {
    	jag.set(0);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new JaguarStop());
    }
}

