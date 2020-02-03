/*----------------------------------------------------------------------------*/ /* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */ /* Open Source Software - may be modified and shared by FRC teams. The code   */ /* must be accompanied by the FIRST BSD license file in the root directory of */ /* the project.                                                               */ /*----------------------------------------------------------------------------*/
package frc.robot.subsystems

import edu.wpi.first.wpilibj.I2C
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.robot.Logic.LidarLite

class LidarSubsystem : SubsystemBase() {

    val cheddar = LidarLite(I2C.Port.kMXP)

    override fun periodic() { // This method will be called once per scheduler run

    }

    fun getLidar(): LidarLite {
        return cheddar
    }

    init {
          cheddar.startMeasuring()
    }
}