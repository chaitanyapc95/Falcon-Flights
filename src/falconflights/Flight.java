/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    String ID_CODE;
  //  Time time;
    
   public Flight(String Id1,String origin1,String destination1,Date traveldate1){
       Id=Id1;
       origin=origin1;
       destination=destination1;
       traveldate=traveldate1;
     //  this.time=time;
     String y=traveldate.toString();
         y=y.toUpperCase();
      char c=dateType(y);
        ID_CODE= generateID(Id,y,c);
         Display();
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
       System.out.println("Id:"+Id+"/norigin:"+origin+"/nDestination:"+destination+"/nTravelDate:"+traveldate);
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
//   public Time getTime(){
//       return time;
//   }
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
}