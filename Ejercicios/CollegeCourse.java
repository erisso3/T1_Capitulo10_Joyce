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
public class CollegeCourse {
   private String Dep;
   private Integer Ncurso;
   private Integer Credito;
   private Integer Tarifa;

    public CollegeCourse(String Dep, Integer Ncurso, Integer Credito) {
        this.Dep = Dep;
        this.Ncurso = Ncurso;
        this.Credito = Credito;
        this.Tarifa=Tarifa();
    }

    public String toString(){
        System.out.println("\nEjercicio 8");
        return String.format("Dep:%s\nCurso:%d\nCreditos:%d\nTarifa:%d",this.getDep(),this.getNcurso(),this.getCredito(),this.getTarifa());
    }
    
    public Integer Tarifa(){
        return 120*this.getCredito();
    }
    
    
    public String getDep() {
        return Dep;
    }

    public void setDep(String Dep) {
        this.Dep = Dep;
    }

    public Integer getNcurso() {
        return Ncurso;
    }

    public void setNcurso(Integer Ncurso) {
        this.Ncurso = Ncurso;
    }

    public Integer getCredito() {
        return Credito;
    }

    public void setCredito(Integer Credito) {
        this.Credito = Credito;
    }

    public Integer getTarifa() {
        return Tarifa;
    }

    public void setTarifa(Integer Tarifa) {
        this.Tarifa = Tarifa;
    }
   
   
   
}
