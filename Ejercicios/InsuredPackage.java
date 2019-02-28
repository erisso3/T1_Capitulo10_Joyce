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
public class InsuredPackage extends Package {
    
    public InsuredPackage(double Peso, Envio envio) {
        super(Peso, envio);
    }
    
    public String toString(){
        return String.format("Peso:%.1f\nEnvio:%s\nCosto:%.2f",this.getPeso(),this.getEnvio(),this.getCosto()+AdditionalCost(this.getCosto())); 
    }
    public double AdditionalCost(Double costo){
       if(costo>=0&&costo<=1.00){
           return 2.45;
       }else{
           
       }if(costo>=1.01&&costo<=3.00){
           return 3.96;
       }else{
           return 5.55;
       }
   }
}
