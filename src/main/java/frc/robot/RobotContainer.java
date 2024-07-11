package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.BothShoot;
import frc.robot.commands.CollectNote;
import frc.robot.commands.ReleaseNote;
import frc.robot.commands.RollbackShoot;
import frc.robot.commands.Shoot;
import frc.robot.commands.BothShoot;
import frc.robot.subsystems.Prototype;
import frc.robot.subsystems.PrototypeShooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  private final Prototype prototype = new Prototype();
  private final PrototypeShooter prototypeShooter = new PrototypeShooter();

  private final CommandXboxController driver;

  public RobotContainer() {
    this.driver = new CommandXboxController(OperatorConstants.kDriverControllerPort);

    configureBindings();
  }

  private void configureBindings() {
    //this.driver.leftBumper().whileTrue(new CollectNote(this.prototype));
    //this.driver.leftTrigger().whileTrue(new ReleaseNote(this.prototype));
    this.driver.leftBumper().whileTrue(new Shoot(this.prototypeShooter));
    this.driver.rightBumper().whileTrue(new RollbackShoot(this.prototypeShooter));
    this.driver.rightTrigger().whileTrue(new BothShoot(this.prototypeShooter));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
