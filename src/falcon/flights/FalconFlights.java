/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcon.flights;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 1896052
 */
public class FalconFlights {
   

    public static void Display(String Fname,String Lname,String y,char c1){
        if("".equals(Fname) && "".equals(Lname)){
            System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+"XX");
        }else if("".equals(Lname) && !"".equals(Fname)){
            System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+"X");
        }else{
            System.out.println(""+y.charAt(26)+y.charAt(27)+"-"+y.charAt(4)+y.charAt(5)+y.charAt(6)+"-"+c1+"-"+Fname.charAt(0)+Lname.charAt(0));
        }
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Agent agent1=new Agent();
    Booking booking1=new Booking();
    Details details1=new Details();
    Employee employee1=new Employee();
    Flight flight1=new Flight();
    Plane plane1=new Plane();
    person person1=new person();
    Certification certification1=new Certification();
    
    Customer customer1=new Customer();
        // TODO code application logic here
   
   // plane1.modelnumber="sajhdkj";
   // details1.Details("adfad");
    //details1.setRole("asjgdh");
    //System.out.println(details1.getRole());
    String ID;
    String f,l;
    Date de = new Date();
    String y=de.toString();
    y=y.toUpperCase();
    System.out.println(y);
    String Fname="",Lname="";
    
        System.out.println("Enter First Name");
        f=sc.next();
        System.out.println("Enter Last Name");
        l=sc.next();
    char c1 = y.charAt(8);
    char c2=y.charAt(9);
   int a=Character.getNumericValue(c1);
   int b=Character.getNumericValue(c2);
    if(b%2==0){
        c1='E';
          }else{
        c1='O';
    } 
    Fname=f;
    Lname=l;
    //String x="19-FEB-OD-XX";
    Display(Fname,Lname,y,c1);
    }
}
