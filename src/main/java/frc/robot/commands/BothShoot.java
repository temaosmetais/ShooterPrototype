package frc.robot.commands;

import frc.robot.subsystems.PrototypeShooter;
import edu.wpi.first.wpilibj2.command.Command;

public class BothShoot extends Command {
  private final PrototypeShooter prototype;

  public BothShoot(PrototypeShooter prototype) {
    this.prototype = prototype;
    addRequirements(this.prototype);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    this.prototype.setShooterUpper(0.8);
    this.prototype.setShooterLower(-0.9);
  }

  @Override
  public void end(boolean interrupted) {
    this.prototype.setShooterUpper(0);
    this.prototype.setShooterLower(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
