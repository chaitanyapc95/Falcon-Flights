/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcon.flights;

import java.util.Date;

/**
 *
 * @author 1896052
 */
public class Id extends Name{
    String ID;
    Date dt=new Date();

  
    
    public void setID(String ID){
        this.ID=ID;
    }
    public String getID(){
        return ID;
    }
    
    public void Display(String Fname,String Lname){
        if("".equals(Fname) && "".equals(Lname)){
            System.out.println("XX");
        }else if("".equals(Lname) && !"".equals(Fname)){
            System.out.println(Fname.charAt(0)+"x");
        }else{
            System.out.println(Fname.charAt(0)+Lname.charAt(0));
        }
    }
}
