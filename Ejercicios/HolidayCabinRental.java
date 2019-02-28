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
public class HolidayCabinRental extends CabinRental {
    
    public HolidayCabinRental(Integer NumC) {
        super(NumC);
    }
    
    public String toString(){
        return String.format("Numero de habitacion:%d\nTarifa:%.2f",getNumC(),getTarifa()+150);
    }
    
    
}
