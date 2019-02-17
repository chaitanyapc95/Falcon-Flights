/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcon.flights;

/**
 *
 * @author 1896052
 */
public class Employee extends person {
    String employeeid;
    Double salary;
    public void Employee(String employeeid, Double salary){
        this.employeeid=employeeid;
        this.salary=salary;
    }
    public  String getemployeeid(){
        return employeeid;
    }
    public Double getsalary(){
        return salary;
    }
    public void setemployeeid(String employeeid){
        this.employeeid=employeeid;
    }
    public void setsalary(Double salary){
        this.salary=salary;
    }
}
