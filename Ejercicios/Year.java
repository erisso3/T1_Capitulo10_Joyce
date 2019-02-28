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
public class Year {
    private static Integer DIA;
    public Year() {
     DIA=365;   
    }
    
    public String toString(){
        return String.format("\nEjercicio 4\nA)\nDia:%d",getDIA());
    }


    public String daysElapsed(Integer numero,Meses year){
        System.out.println("B)");
        if(year==Meses.Enero){
            return String.format("Dias trascurridos:%d",DIA-(DIA-numero-1));
        }else{
            if(year==Meses.Febrero){
                return String.format("Dias trascurridos:%d", DIA-(DIA-(31+numero-1)));
            }else{
                if(year==Meses.Marzo){
                    return String.format("Dias trascurridos:%d",DIA-(DIA-(59+numero-1)));
                }else{
                    if(year==Meses.Abril){
                        return String.format("Dias trascurridos:%d",DIA-(DIA-(90+numero-1)));
                    }else{
                        if(year==Meses.Mayo){
                            return String.format("Dias trascurridos:%d",DIA-(DIA-(120+numero-1)));
                        }else{
                            if(year==Meses.Junio){
                                return String.format("Dias trascurridos:%d",DIA-(DIA-(151+numero-1)));
                            }else{
                                if(year==Meses.Julio){
                                    return String.format("Dias trascurridos:%d",DIA-(DIA-(181+numero-1)));
                                }else{
                                    if(year==Meses.Agosto){
                                        return String.format("Dias trascurridos:%d",DIA-(DIA-(212+numero-1)));
                                    }else{
                                        if(year==Meses.Septiembre){
                                            return String.format("Dias trascurridos:%d",DIA-(DIA-(243+numero-1)));
                                        }else{
                                            if(year==Meses.Octubre){
                                                return String.format("Dias trascurridos:%d",DIA-(DIA-(273+numero-1)));
                                            }else{
                                                if(year==Meses.Noviembre){
                                                    return String.format("Dias trascurridos:%d",DIA-(DIA-(304+numero-1)));
                                                }else{
                                                    if(year==Meses.Diciembre){
                                                        return String.format("Dias trascurridos:%d",DIA-(DIA-(334+numero-1)));
                                                    }else{
                                                        return String.format("Dias trascurridos:%d",0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static Integer getDIA() {
        return DIA;
    }

    public static void setDIA(Integer DIA) {
        Year.DIA = DIA;
    }
    
    
    
    
}
