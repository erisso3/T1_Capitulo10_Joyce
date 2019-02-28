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
public class CabinRental {
    private Integer NumC;
    private double Tarifa;

    public CabinRental(Integer NumC) {
        this.NumC = NumC;
        this.Tarifa=Tarifa(NumC);
    }

    public String toString(){
        System.out.println("\nEjercicio 5");
        return String.format("Numero de cabaña:%d\nTarifa:%.2f",this.getNumC(),this.getTarifa());
    }
    public Integer Tarifa(Integer n){
        if(n==1||n==2||n==3){
            return 950;
        }else{
            return 1100;
        }
    }
    public Integer getNumC() {
        return NumC;
    }

    public double getTarifa() {
        return Tarifa;
    }
    
    
}
