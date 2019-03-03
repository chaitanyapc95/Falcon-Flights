/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 1896052
 */
public class FalconFlights {
      
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Agent agent1=new Agent("","male",new Date());
//    Booking booking1=new Booking();
    Details details1=new Details();
    Employee employee1=new Employee();
    Flight flight1=new Flight("Nishanth","montreal","india",new Date());
    Plane plane1=new Plane();
    person person1=new person();
    Certification certification1=new Certification();
    Pilot p1=new Pilot();
//    Customer customer1=new Customer();
    Booking book1=new Booking("",new Date());
    }
}
