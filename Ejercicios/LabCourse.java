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
public class LabCourse extends CollegeCourse{
    
    public LabCourse(String Dep, Integer Ncurso, Integer Credito) {
        super(Dep, Ncurso, Credito);
        if(Dep=="BIO"||Dep=="CHM"||Dep=="CIS"||Dep=="PHY"){
            setTarifa(Tarifa()+50);
        }
    }
    
    public String toString(){
        if(this.getDep()=="BIO"||this.getDep()=="CHM"||this.getDep()=="CIS"||this.getDep()=="PHY"){
            System.out.println("\nEs un curso de labolarorio");
        }
        return String.format("Dep:%s\nCurso:%d\nCreditos:%d\nTarifa:%d",this.getDep(),this.getNcurso(),this.getCredito(),this.getTarifa());
    }
}
