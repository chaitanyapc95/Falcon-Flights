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
public class person {
    String Fname;
    String Lname;
    Double phone;
    String email;
    public static String person(String Fname, String Lname, Double phone, String email){
//        this.Fname=Fname;
//        this.Lname=Lname;
//        this.phone=phone;
//        this.email=email;
        return Fname+Lname+phone+email;
    }
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public Double getphone(){
        return phone;
    }
    public String getemail(){
        return email;
    }
    public void setFname(String Fname){
        this.Fname=Fname;
    }
    public void setLname(String Lname){
        this.Lname=Lname;
    }
    public void setphone(Double phone){
        this.phone=phone;
    }
    public void setemail(String email){
        this.email=email;
    }
}