/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author eriss
 */
public class MotorCycle extends Vehicle{
    public MotorCycle(Integer nWheels, Integer milePerGallon) {
        super(nWheels, milePerGallon);
        super.setnWheels(2);
    }
}
