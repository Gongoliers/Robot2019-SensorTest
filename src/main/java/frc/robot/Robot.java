/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  private static final int CARGO_WRIST_POT_PORT = 0;
  private static final int HATCH_POT_PORT = 1;
  private static final int LIMIT_SWITCH_PORT = 0;


  private Potentiometer cargoPotentiometer, hatchPotentiometer;
  private DigitalInput limitSwitch; // Don't use DigitalInput in your Robot2019 project - Library of Gongolierium using LimitSwitch instead
  

  @Override
  public void robotInit() {
    cargoPotentiometer = new AnalogPotentiometer(CARGO_WRIST_POT_PORT);
    hatchPotentiometer = new AnalogPotentiometer(HATCH_POT_PORT);
    limitSwitch = new DigitalInput(LIMIT_SWITCH_PORT);    
  }

  @Override
  public void robotPeriodic() {
    SmartDashboard.putNumber("Cargo Potentiometer", cargoPotentiometer.get());
    SmartDashboard.putNumber("Hatch Potentiometer", hatchPotentiometer.get());
    SmartDashboard.putBoolean("Cargo Limit Switch", limitSwitch.get());
  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void testPeriodic() {}
}
