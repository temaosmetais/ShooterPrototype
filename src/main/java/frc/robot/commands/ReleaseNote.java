package frc.robot.commands;

import frc.robot.subsystems.Prototype;
import edu.wpi.first.wpilibj2.command.Command;

public class ReleaseNote extends Command {
  private final Prototype prototype;

  public ReleaseNote(Prototype prototype) {
    this.prototype = prototype;
    addRequirements(this.prototype);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    this.prototype.setIntakeLower(-0.4);
    this.prototype.setIntakeUpper(0.4);
  }

  @Override
  public void end(boolean interrupted) {
    this.prototype.setIntakeLower(0);
    this.prototype.setIntakeUpper(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
