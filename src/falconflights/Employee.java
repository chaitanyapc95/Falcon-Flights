/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

/**
 *
 * @author 1896052
 */
public class Employee extends person {
    String employeeid;
    Double salary;
    public static double employee(double employeeid, double salary){
        employeeid=employeeid;
        salary=salary;
        return employeeid+salary;
    }
    public  String getemployeeid(){
        return employeeid;
    }
    public double getsalary(){
        return salary;
    }
    public void setemployeeid(String employeeid){
        this.employeeid=employeeid;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
}
