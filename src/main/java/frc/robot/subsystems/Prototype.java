package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Prototype extends SubsystemBase {
  //Baixo
  private final VictorSPX intakeLower;
  //Cima
  private TalonSRX intakeUpper;
  //private TalonFX motorShooterTwo;

  public Prototype() {
    this.intakeLower = new VictorSPX(4);
    this.intakeLower.setInverted(false);

    this.intakeUpper = new TalonSRX(5);
    this.intakeUpper.setInverted(false);

    //this.motorShooterTwo = new TalonFX(2);
    //this.motorShooterTwo.setInverted(true);
  }

  public void setIntakeLower(double percentageSpeed) {
    this.intakeLower.set(ControlMode.PercentOutput, percentageSpeed);
  }

  public void setIntakeUpper(double percentageSpeed) {
    this.intakeUpper.set(ControlMode.PercentOutput, percentageSpeed);
    //this.motorShooterTwo.set(ControlMode.PercentOutput, percentageSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
