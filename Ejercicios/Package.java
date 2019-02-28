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
public class Package {
    private double Peso;
    private Envio envio;
    private double Costo;

    public Package(double Peso, Envio envio) {
        this.Peso = Peso;
        this.envio = envio;
        this.Costo=calculateCost(envio, Peso);
    }

    public String toString(){
        return String.format("Peso:%.1f\nEnvio:%s\nCosto:%.2f\n",this.getPeso(),this.getEnvio(),this.getCosto());
    }
    public double calculateCost(Envio envio,Double peso){
        switch(envio){
            case A:
                if(peso>=1&&peso<=8){
                    return 2;
                }else{
                    if(peso>=9&&peso<=16){
                        return 3;
                    }else{
                        return 4.5;
                    }
                }
            case T:
                if(peso>=1||peso<=8){
                    return 1.5;
                }else{
                    if(peso>=9||peso<=16){
                        return 2.35;
                    }else{
                        return 3.25;
                    }
                }
            case M:
                if(peso>=1||peso<=8){
                    return 0.5;
                }else{
                    if(peso>=9||peso<=16){
                        return 1.5;
                    }else{
                        return 2.15;
                    }
                }
             default:
                 return 0;
        }
    }
    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
}
