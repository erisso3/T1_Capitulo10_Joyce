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
public class TennisGame {
    private String P1;
    private  String P2;
    private Integer Punt1;
    private Integer Punt2;
    private String Fpunt1;
    private String Fpunt2;

    public TennisGame(String P1, String P2, Integer Punt1, Integer Punt2) {
        this.P1 = P1;
        this.P2 = P2;
        this.Punt1 = Punt1;
        this.Punt2 = Punt2;
        this.Fpunt1 =Final(this.getPunt1());
        this.Fpunt2 =Final(this.getPunt2());
        setPunt1(Punt1*Valolar(Punt1, Punt2));
        setPunt2(Punt2*Valolar(Punt1,Punt2));
    }


    public Integer Valolar(Integer a,Integer b){
        if(a>=4||a<0||b>=4||b<0){
            return  0;
        }else{
            return 1;
        }
    }
    
    public String Final(Integer x){
        if(this.Punt1>4||this.Punt1<0||this.Punt1==4||this.Punt2>4||this.Punt2<0||this.Punt2==4){
            return String.format("Error");
        }else{
            return String.format("La funtuacion final es %d",x);
        }
    }
    public String getP1() {
        return P1;
    }

    public void setP1(String P1) {
        this.P1 = P1;
    }

    public String getP2() {
        return P2;
    }

    public void setP2(String P2) {
        this.P2 = P2;
    }

    public Integer getPunt1() {
        return Punt1;
    }

    public void setPunt1(Integer Punt1) {
        this.Punt1 = Punt1;
    }

    public Integer getPunt2() {
        return Punt2;
    }

    public void setPunt2(Integer Punt2) {
        this.Punt2 = Punt2;
    }

    public String getFpunt1() {
        return Fpunt1;
    }

    public void setFpunt1(String Fpunt1) {
        this.Fpunt1 = Fpunt1;
    }

    public String getFpunt2() {
        return Fpunt2;
    }

    public void setFpunt2(String Fpunt2) {
        this.Fpunt2 = Fpunt2;
    }
    
  
}
