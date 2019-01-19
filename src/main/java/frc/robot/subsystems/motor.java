/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * Add your docs here.
 */
public class motor extends Subsystem {

  private final TalonSRX leftmaster;





public motor() {

  leftmaster = new TalonSRX(1);



}

public void setPower(double power){
  leftmaster.set(ControlMode.PercentOutput, power);
}

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void setLowPowerAuto10(){
    long startTime = System.currentTimeMillis();
    long elapsedTime = System.currentTimeMillis() - startTime;
    while(elapsedTime <= 10000){
      setPower(.5);
      elapsedTime = System.currentTimeMillis() - startTime;
      
    }
  }
  

  @Override
  public void initDefaultCommand() {
    leftmaster.set(ControlMode.PercentOutput,.1);
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
