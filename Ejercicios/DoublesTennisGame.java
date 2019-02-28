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
public class DoublesTennisGame extends TennisGame {
    private String Sep1;
    private String Sep2;

    public DoublesTennisGame(String P1, String P2,String Sep1,String Sep2, Integer Punt1, Integer Punt2) {
        super(P1, P2, Punt1, Punt2);
        this.Sep1=Sep1;
        this.Sep2=Sep2;
    }
    
    public String toString(){
        System.out.println("\nEjercicio 3");
        return String.format("Jugador 1:%s\nJugador 2:%s\nJugador 3:%s\nJugador 4:%s\nPuntos 1:%d\nPuntos 2:%d\nPuntos F1:%s\nPuntos F2:%s",this.getP1(),this.getP2(),this.getSep1(),this.getSep2(),this.getPunt1(),getPunt2(),this.getFpunt1(),this.getFpunt2());
    }
    

    public String getSep1() {
        return Sep1;
    }

    public void setSep1(String Sep1) {
        this.Sep1 = Sep1;
    }

    public String getSep2() {
        return Sep2;
    }

    public void setSep2(String Sep2) {
        this.Sep2 = Sep2;
    }
    
}
