/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

import java.util.Date;

/**
 *
 * @author 1893541
 */
public class Booking {

    public static String Booking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Flight flight1=new Flight();
    
    Date dateOfBooking;
    
    public static Date Booking(Date dateOfBooking){
        //this.dateOfBooking=dateOfBooking;
        //System.out.println("dateOfBooking");
    return dateOfBooking;
    }
    public Date getdateOfBooking(){
        return dateOfBooking;
    }
    public void setdateOfBooking(Date dateOfBooking){
        this.dateOfBooking=dateOfBooking;
    }
}
