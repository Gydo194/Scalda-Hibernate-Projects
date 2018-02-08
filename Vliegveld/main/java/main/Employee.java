/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.persistence.*;
/**
 *
 * @author gydo194
 */


@Entity
@Table(name="werknemers")
public class Employee {
    
    @Id
    @Column(length = 30)
    private String BSN;
    
    @Column
    private String name;
    
    @Column
    private String lastName;
    
    @Column
    private String street;
    
    @Column
    private String postalCode;
    
    @Column
    private String city;
    
    @Column
    private int houseNo;
    
    @Column
    private double salary;
    
    @Column
    private String shift;
    
    @Column
    private String phoneNo;

    public Employee() {
    }

    public Employee(String BSN, String name, String lastName, String street, String postalCode, String city, int houseNo, double salary, String shift, String phoneNo) {
        this.BSN = BSN;
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.houseNo = houseNo;
        this.salary = salary;
        this.shift = shift;
        this.phoneNo = phoneNo;
    }
    
    
    
    
    

    /**
     * @return the BSN
     */
    public String getBSN() {
        return BSN;
    }

    /**
     * @param BSN the BSN to set
     */
    public void setBSN(String BSN) {
        this.BSN = BSN;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the houseNo
     */
    public int getHouseNo() {
        return houseNo;
    }

    /**
     * @param houseNo the houseNo to set
     */
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the shift
     */
    public String getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(String shift) {
        this.shift = shift;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
