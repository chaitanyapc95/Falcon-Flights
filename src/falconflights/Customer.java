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
public  class Customer extends person{
    String address;
    String passport;
    public static String  Customer(String address, String passport){
        
        address=address;
        passport=passport;
        return address+passport;
        
    }
    public String getaddress(){
        return address;
    }
    public String getpassport(){
        return passport;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setpassport(){
        this.passport=passport;
    }
    Booking bk=new Booking();
}
