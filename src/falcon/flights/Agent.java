/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcon.flights;

/**
 *
 * @author 1893541
 */
public class Agent extends Employee{
    Details details1=new Details();
    String Gender;
    public void Agent(String Gender){
        this.Gender=Gender;
    }
    public void setGender(String Gender){
        this.Gender=Gender;
    }
     public String getGender(){
            return Gender;
        }
}
