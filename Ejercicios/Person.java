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
public class Person {
    private String fName;
    private String lName;
    private String sAdress;
    private Integer zCode;
    private Integer phone;

    public Person() {
        this.fName="";
        this.lName="";
        this.sAdress="";
        this.zCode=0;
        this.phone=0;
    }

    public Person(String fName, String lName, String sAdress, Integer zCode, Integer phone) {
        this.fName = fName;
        this.lName = lName;
        this.sAdress = sAdress;
        this.zCode = zCode;
        this.phone = phone;
    }
    
    public void display(){
        System.out.println("First Name: "+this.getfName()+
                "\nLast Name: "+this.lName+
                "\nStreet adress: "+this.sAdress+
                "\nZip code: "+this.zCode+
                "\nPhone number: "+this.phone);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getsAdress() {
        return sAdress;
    }

    public void setsAdress(String sAdress) {
        this.sAdress = sAdress;
    }

    public Integer getzCode() {
        return zCode;
    }

    public void setzCode(Integer zCode) {
        this.zCode = zCode;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
