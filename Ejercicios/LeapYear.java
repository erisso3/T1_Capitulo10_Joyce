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
public class LeapYear extends Year{

    public LeapYear() {
        setDIA(366);
    }
    
    public String toString(){
        return String.format("Dias:%d",getDIA());
    }
    
    public String daysElapsed(Integer numero,Meses year){
        if(year==Meses.Enero){
            return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-numero-1));
        }else{
            if(year==Meses.Febrero){
                return String.format("Dias trascurridos:%d", getDIA()-(getDIA()-(31+numero)));
            }else{
                if(year==Meses.Marzo){
                    return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(59+numero)));
                }else{
                    if(year==Meses.Abril){
                        return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(90+numero)));
                    }else{
                        if(year==Meses.Mayo){
                            return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(120+numero)));
                        }else{
                            if(year==Meses.Junio){
                                return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(151+numero)));
                            }else{
                                if(year==Meses.Julio){
                                    return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(181+numero)));
                                }else{
                                    if(year==Meses.Agosto){
                                        return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(212+numero)));
                                    }else{
                                        if(year==Meses.Septiembre){
                                            return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(243+numero)));
                                        }else{
                                            if(year==Meses.Octubre){
                                                return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(273+numero)));
                                            }else{
                                                if(year==Meses.Noviembre){
                                                    return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(304+numero)));
                                                }else{
                                                    if(year==Meses.Diciembre){
                                                        return String.format("Dias trascurridos:%d",getDIA()-(getDIA()-(334+numero)));
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
}
