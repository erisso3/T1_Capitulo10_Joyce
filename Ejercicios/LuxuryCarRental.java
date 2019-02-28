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
public class LuxuryCarRental extends CarRental {
    private boolean Chofer;
    public LuxuryCarRental(String Nombre, Integer CP, TamañoCar Tamaño, Integer Dias,boolean chofer) {
        super(Nombre, CP, Tamaño, Dias);
        setTarifa(79.99);
        setTarifaT(getTarifa()*getDias()+Chofe(chofer));
        this.Chofer=chofer;
    }
    public String toString(){
        return String.format("\nDias:%d\nTarifa por dia:%.2f\nChofer:%b\nTarifa total:%.2f",this.getDias(),this.getTarifa(),this.Chofer,this.getTarifaT());
    }

    public Integer Chofe( boolean c){
        if(c==true){
            return 200*getDias();
        }else{
            return 0;
        }
    }
    public boolean isChofer() {
        return Chofer;
    }
    
    
}
