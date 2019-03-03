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
   // Flight flight1=new Flight();
    
    Date dateOfBooking;
    
    public static Date Booking(Date dateOfBooking){
        //this.dateOfBooking=dateOfBooking;
        return dateOfBooking;
    }
    public Date getdateOfBooking(){
        return dateOfBooking;
    }
    public void setdateOfBooking(Date dateOfBooking){
        this.dateOfBooking=dateOfBooking;
    }
}
