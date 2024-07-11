package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PrototypeShooter extends SubsystemBase {
  
  private final TalonFX shooterLower;
  private TalonFX shooterUpper;

  public PrototypeShooter() {
    this.shooterLower = new TalonFX(1);
    this.shooterLower.setInverted(false);

    this.shooterUpper = new TalonFX(2);
    this.shooterUpper.setInverted(false);
  }

  public void setShooterLower(double percentageSpeed) {
    this.shooterLower.set(ControlMode.PercentOutput, percentageSpeed);
  }

  public void setShooterUpper(double percentageSpeed) {
    this.shooterUpper.set(ControlMode.PercentOutput, percentageSpeed);
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
