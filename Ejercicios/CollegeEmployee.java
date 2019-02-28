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
public class CollegeEmployee extends Person{
    private Integer sNumber;
    private Double salary;
    private String dName;

    public CollegeEmployee(Integer sNumber, Double salary, String dName, String fName, String lName, String sAdress, Integer zCode, Integer phone) {
        super(fName, lName, sAdress, zCode, phone);
        this.sNumber = sNumber;
        this.salary = salary;
        this.dName = dName;
    }
    
    public void display(){
        super.display();
        System.out.println("Social security number: "+this.sNumber+
                "\nAnnual salary: "+this.salary+
                "\nDepartment name: "+this.dName);
    }

    public Integer getsNumber() {
        return sNumber;
    }

    public void setsNumber(Integer sNumber) {
        this.sNumber = sNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
