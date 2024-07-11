package frc.robot.commands;

import frc.robot.subsystems.Prototype;
import edu.wpi.first.wpilibj2.command.Command;

public class CollectNote extends Command {
  private final Prototype prototype;

  public CollectNote(Prototype prototype) {
    this.prototype = prototype;
    addRequirements(this.prototype);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
   // this.prototype.setIntakeLower(0.8);
    this.prototype.setIntakeUpper(-0.8);
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
