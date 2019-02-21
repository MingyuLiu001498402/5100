/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author liumingyu
 */
public class Person {
    String lastname;
    String firstname;    
    
    Address workaddress;
    Address sweethomeaddress;
    Address localaddress;
    
    

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public Address getSweethomeaddress() {
        return sweethomeaddress;
    }

    public void setSweethomeaddress(Address sweethomeaddress) {
        this.sweethomeaddress = sweethomeaddress;
    }

    public Address getlocaladdress() {
        return localaddress;
    }

    public void setlocaladdress(Address localaddress) {
        this.localaddress = localaddress;
    }
    
    
    public static void main(String[]args){
        
        Person person = new Person();
        person.setFirstname("Joe");
        person.setLastname("Smith");
        
        
        Address workadd = new Address();
        workadd.setStreetline1("360 Huntington Ave");
        workadd.setStreetline2("130 Snell Engineering");
        workadd.setCity("Boston");
        workadd.setState("Massachusetts");
        workadd.setCountry("United States");
        workadd.setZipcode("02115");      
        person.setWorkaddress(workadd);
        System.out.println("First name:"+person.getFirstname());
        System.out.println("Last name:"+person.getLastname());
        System.out.println("Full name:"+person.getLastname()+" "+person.getFirstname());
        System.out.println("WorkAddress:"+ person.getWorkaddress().getStreetline1()+System.lineSeparator()+"            "+person.getWorkaddress().getStreetline2());
        System.out.println("WorkCity:"+person.getWorkaddress().getCity());
        System.out.println("WorkState:"+person.getWorkaddress().getState());
        System.out.println("WorkCounty:"+person.getWorkaddress().getCountry());
        System.out.println("WorkZipCode:"+person.getWorkaddress().getZipcode());
        System.out.println();
        System.out.println("#######################");
        
        
        Address address1 = new Address();
        address1.setStreetline1("201 Best Street");
        address1.setStreetline2(" ");
        address1.setCity("Cool-town");
        address1.setState("Shanghai");
        address1.setCountry("China");
        address1.setZipcode("03154");
        person.setSweethomeaddress(address1);
        System.out.println("SweethomeAddress:"+ person.getSweethomeaddress().getStreetline1()+System.lineSeparator()+"                 "+person.getSweethomeaddress().getStreetline2());
        System.out.println("SweethomeCity:"+person.getSweethomeaddress().getCity());
        System.out.println("SweethomeState:"+person.getSweethomeaddress().getState());
        System.out.println("SweethomeCountry:"+person.getSweethomeaddress().getCountry());
        System.out.println("SweethomeZipCode:"+person.getSweethomeaddress().getZipcode());
        System.out.println();
        System.out.println("#######################");
        
        Address address2 = new Address();
        address2.setStreetline1("100 Main Street");
        address2.setStreetline2("");
        address2.setCity("Natick");
        address2.setState("Massachusetts");
        address2.setCountry("United States");
        address2.setZipcode("01760");
        person.setlocaladdress(address2);
        System.out.println("LocalAddress:"+ person.getlocaladdress().getStreetline1()+System.lineSeparator()+"             "+person.getlocaladdress().getStreetline2());
        System.out.println("LocalCity:"+person.getlocaladdress().getCity());
        System.out.println("LocalState:"+person.getlocaladdress().getState());
        System.out.println("LocalCounty:"+person.getlocaladdress().getCountry());
        System.out.println("LocalZipCode:"+person.getlocaladdress().getZipcode());
        
        
    }
    
}
    

