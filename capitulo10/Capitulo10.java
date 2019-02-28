/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo10;

import Ejercicios.CabinRental;
import Ejercicios.Car;
import Ejercicios.CarRental;
import Ejercicios.CollegeCourse;
import Ejercicios.DoublesTennisGame;
import Ejercicios.Envio;
import Ejercicios.HolidayCabinRental;
import Ejercicios.InsuredPackage;
import Ejercicios.LabCourse;
import Ejercicios.LeapYear;
import Ejercicios.LuxuryCarRental;
import Ejercicios.Meses;
import Ejercicios.MotorCycle;
import Ejercicios.RaceHorse;
import Ejercicios.ScentedCandle;
import Ejercicios.Year;
import Ejercicios.Package;
import Ejercicios.Person;
import Ejercicios.TamañoCar;
import Ejercicios.Vehicle;

/**
 *
 * @author eriss
 */
public class Capitulo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaceHorse rh=new RaceHorse("Sardina","Cafe",1999,33);
        System.out.println(rh);
        ScentedCandle sc=new ScentedCandle("Rojo",3,"Rosas");
        System.out.println(sc);
        DoublesTennisGame dt=new DoublesTennisGame("Mitchell","Luis","Victor","Santiago",5,3);
        System.out.println(dt);  
        Year y=new Year();
        System.out.println(y);
        LeapYear ly=new LeapYear();
        System.out.println(ly);
        System.out.println(y.daysElapsed(3, Meses.Marzo));
        System.out.println(ly.daysElapsed(3, Meses.Marzo));
        CabinRental cr=new CabinRental(1);
        System.out.println(cr);
        HolidayCabinRental hcr=new HolidayCabinRental(2);
        System.out.println(hcr);
        Package pa=new Package(0.5, Envio.A);
        System.out.println(pa);
        InsuredPackage ip=new InsuredPackage(0.5, Envio.A);
        System.out.println(ip);
        CarRental car=new CarRental("Erick",71200, TamañoCar.Mediana, 2);
        System.out.println(car);
        LuxuryCarRental lcr=new LuxuryCarRental("Luis",35473, TamañoCar.Mediana,2, true);
        System.out.println(lcr);
        CollegeCourse cc=new CollegeCourse("ENG",101,3);
        System.out.println(cc);
        LabCourse lc=new LabCourse("BIO",101,3);
        System.out.println(lc);
        System.out.println("\nEjercicio 9");
        Vehicle v=new Car(75,10000);
        System.out.println(v);
        MotorCycle mc=new MotorCycle(3242,234);
        System.out.println(mc);
    }
    
}
