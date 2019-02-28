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
public class RaceHorse extends Horse {
    private Integer Ncarreras;

    public RaceHorse(String N,String c,Integer a, Integer Ncarreras) {
        this.Ncarreras = Ncarreras;
        setNombre(N);
        setColor(c);
        setAno(a);
    }

    public String toString(){
        System.out.println("\nEjercicio 1");
        return String.format("Nombre:%s\nColor:%S\nAño:%d\nNumero de carreras:%d",this.getNombre(),this.getColor(),this.getAno(),this.getNcarreras());
    }
    public Integer getNcarreras() {
        return Ncarreras;
    }

    public void setNcarreras(Integer Ncarreras) {
        this.Ncarreras = Ncarreras;
    }
    
    
}
