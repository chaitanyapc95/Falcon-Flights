/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
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
    
    
   public Flight(String Id,String origin,String destination,Date traveldate){
       Id=Id;
       origin=origin;
       destination=destination;
       traveldate=traveldate;
      
    DisplayFlight(Id,origin,destination,traveldate);
   }
  
   public static String DisplayFlight(String Id,String origin,String destination,Date traveldate){
    String f,l;
    String y=traveldate.toString();
    y=y.toUpperCase();
        f=Id.toUpperCase();  
    char c1 = y.charAt(8);
    char c2=y.charAt(9);
   int a=Character.getNumericValue(c1);
   int b=Character.getNumericValue(c2);
    if(b%2==0){
        c1='E';
          }else{
        c1='O';
    } 
    String Fname=f;
    if("".equals(Fname)){
            System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+"XX");
        }else{
            System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+Fname.charAt(Fname.length()-1));
        }
       
    System.out.println(Id+"/n"+origin+"/n"+destination+"/n"+traveldate);
    return Id+origin+destination+traveldate;
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