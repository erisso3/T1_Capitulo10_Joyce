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
public class CarRental {
    private String Nombre;
    private Integer CP;
    private TamañoCar Tamaño;
    private double Tarifa;
    private Integer Dias;
    private double TarifaT;

    public CarRental(String Nombre, Integer CP, TamañoCar Tamaño, Integer Dias) {
        this.Nombre = Nombre;
        this.CP = CP;
        this.Tamaño = Tamaño;
        this.Dias = Dias;
        this.Tarifa=CalcularTarifa(Tamaño);
        this.TarifaT=getTarifa()*getDias();
    }
    
    public String toString(){
        System.out.println("\nEjercicio 7");
        return String.format("Nombre:%s\nCodigo Postal:%s\nTamaño:%s\nDias:%d\nTarifa por dia:%.2f\nTarifa total:%.2f",this.getNombre(),this.getCP(),this.getTamaño(),this.getDias(),this.getTarifa(),this.getTarifaT());
    }
    
    public double CalcularTarifa(TamañoCar tamano){
        switch (tamano) {
            case Economica:
                return 29.99;
            case Mediana:
                return 38.99;
            case Completa:
                return 43.50;
            default:
                throw new AssertionError();
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getCP() {
        return CP;
    }

    public void setCP(Integer CP) {
        this.CP = CP;
    }

    public TamañoCar getTamaño() {
        return Tamaño;
    }

    public void setTamaño(TamañoCar Tamaño) {
        this.Tamaño = Tamaño;
    }

    public double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(double Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Integer getDias() {
        return Dias;
    }

    public void setDias(Integer Dias) {
        this.Dias = Dias;
    }

    public double getTarifaT() {
        return TarifaT;
    }

    public void setTarifaT(double TarifaT) {
        this.TarifaT = TarifaT;
    }

    
    
}
