/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author 1893541
 */
public class Flight {

  
    
    Plane plane1=new Plane();
    Details details1=new Details();
    String Id;
    String origin;
    String destination;
    Date traveldate;
    Time time;
    
   public static String Flight(String Id,String origin,String destination,Date date){
       //Id=Id;
       //origin=origin;
       //this.destination=destination;
      // this.traveldate=traveldate;
     //  this.time=time;
       return Id+" "+origin+" "+destination+" "+date;
   }
   public static void Display(){
       System.out.println("1893541");
   }
    
   public String getId(){
       return Id;
   }
   public String getOrigin(){
       return origin;
   }
   public String getDestination(){
       return destination;
   }
   public Date getDate(){
       return traveldate;
   }
   public Time getTime(){
       return time;
   }
   public void setId(String Id){
       this.Id=Id;
   }
   public void setOrigin(String origin){
       this.origin=origin;
   }
   public void setDestination(String destination){
       this.destination=destination;
   }
   public void setTravelDate(Date traveldate){
       this.traveldate=traveldate;
   }
   public void setTime(Time time){
       this.time=time;
   }
}
