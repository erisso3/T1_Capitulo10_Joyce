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
public class Candle {
    private String Color;
    private Integer Altura;
    private static Integer PRECIO;

    public Candle(String Color, Integer Altura) {
        this.Color = Color;
        this.Altura = Altura;
        PRECIO=2;
    }

    public static Integer getPRECIO() {
        return PRECIO;
    }

    public static void setPRECIO(Integer PRECIO) {
        Candle.PRECIO = PRECIO;
    }

    
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer Altura) {
        this.Altura = Altura;
    }
    
    
    
}
