/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

import static falconflights.Flight.dateType;
import static falconflights.Flight.generateID;
import java.util.Date;

/**
 *
 * @author 1893541
 */
public class Booking {
   // Flight flight1=new Flight();
    String ID_CODE;
    String Id;
    Date dateOfBooking;
    
    public Booking(String Id1,Date dateOfBooking1){
        Id=Id1;
        dateOfBooking=dateOfBooking1;
         String y=dateOfBooking.toString();
         y=y.toUpperCase();
         Id=Id.toUpperCase();
         char c=dateType(y);
         ID_CODE= generateID(Id,y,c);
         Display();
        //this.dateOfBooking=dateOfBooking;
       // return dateOfBooking;
    }
    
    public static char dateType(String y){//EVEN OR ODD
       char c1=y.charAt(9);
     int b=Character.getNumericValue(c1);
     if(b%2==0){
        c1='E';
          }else{
        c1='O';
    } 
     return c1;
   }
   public static String generateID(String Fname,String y,char c1){
       String u;
        if("".equals(Fname)){
           u=""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+"XX";
    // System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+"XX");
        }else if(Fname.length()==1){
            u=""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+"X";
           // System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+"X");
        }else{
            u=""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+Fname.charAt(Fname.length()-1);
           // System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+Fname.charAt(Fname.length()-1));
        }
        return u;
    }
   public void Display(){
       System.out.println(ID_CODE);
       System.out.println("Id:"+Id+"\ndateOfBookin:"+dateOfBooking);
   }

    public Date getdateOfBooking(){
        return dateOfBooking;
    }
    public void setdateOfBooking(Date dateOfBooking){
        this.dateOfBooking=dateOfBooking;
    }
}
