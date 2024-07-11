package frc.robot.commands;

import frc.robot.subsystems.PrototypeShooter;
import edu.wpi.first.wpilibj2.command.Command;

public class RollbackShoot extends Command {
  private final PrototypeShooter prototype;

  public RollbackShoot(PrototypeShooter prototype) {
    this.prototype = prototype;
    addRequirements(this.prototype);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    this.prototype.setShooterUpper(0.4);
  }

  @Override
  public void end(boolean interrupted) {
  this.prototype.setShooterUpper(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
