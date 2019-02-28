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
public class ScentedCandle extends Candle{
    private String Olor;
    public ScentedCandle(String Color, Integer Altura,String olor) {
        super(Color, Altura);
        this.Olor=olor;
        setPRECIO(3);
    }

    public String toString(){
        System.out.println("\nEjercicio 2");
        return String.format("Color:%s\nAltura:%d\nOlor:%s\nPrecio:%d",this.getColor(),this.getAltura(),this.getOlor(),this.getAltura()*getPRECIO());
    }
    public String getOlor() {
        return Olor;
    }

    public void setOlor(String Olor) {
        this.Olor = Olor;
    }
    
}
