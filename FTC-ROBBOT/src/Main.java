package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "OP01 (Blocks to Java)")
public class OP01 extends LinearOpMode {

  private DcMotor motor1;
  private DcMotor motor2;
  private Servo servo0;
  private DcMotor garraHaste;

  @Override
  public void runOpMode() {
    float servoLet;
    float servoLet2;

    motor1 = hardwareMap.get(DcMotor.class, "motor1");
    motor2 = hardwareMap.get(DcMotor.class, "motor2");
    servo0 = hardwareMap.get(Servo.class, "servo0");
    garraHaste = hardwareMap.get(DcMotor.class, "garraHaste");

    waitForStart();
    if (opModeIsActive()) {

      while (opModeIsActive()) {
        if (opModeIsActive()) {
          motor1.setPower(gamepad1.right_trigger);
        } else {
          motor1.setPower(gamepad1.right_trigger);
        }
        if (opModeIsActive()) {
          motor2.setPower(gamepad1.left_trigger);
        } else {
          motor2.setPower(gamepad1.left_trigger);
        }
        if (gamepad1.left_bumper) {
          motor1.setDirection(DcMotor.Direction.REVERSE);
          motor2.setDirection(DcMotor.Direction.FORWARD);
        }
        if (gamepad1.right_bumper) {
          motor1.setDirection(DcMotor.Direction.FORWARD);
          motor2.setDirection(DcMotor.Direction.REVERSE);
        }
        if (opModeIsActive()) {
          servoLet = gamepad1.left_stick_y + 1;
          servoLet2 = servoLet / 2;
          servo0.setPosition(servoLet2);
        } else {
        }
        if (opModeIsActive()) {
          garraHaste.setPower(gamepad1.right_stick_y);
          telemetry.update();
        }
        telemetry.update();
      }
    }
  }
}