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
@Table(name="piloten")
public class Piloot {
    //general info
    @Id
    @Column(length=30)
    private long BSN;
    
    @Column
    private long licenseNumber;
    
    //name
    @Column(name="firstName")
    private String name;
    
    @Column(name="lastName")
    private String lastName;
    
    //address
    @Column
    private String street;
    
    @Column
    private String city;
    
    @Column
    private int houseNo;
    
    @Column
    private String postalCode;
    
    //phone number
    @Column
    private String phoneNumber;
    
    //limitations
    @Column
    private String limitations;

    public Piloot() {
    }

    public Piloot(long BSN, long licenseNumber, String name, String lastName, String street, String city, int houseNo, String postalCode, String phoneNumber, String limitations) {
        this.BSN = BSN;
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.houseNo = houseNo;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.limitations = limitations;
    }

    
    
    
    
    
    
    
    
    /**
     * @return the BSN
     */
    public long getBSN() {
        return BSN;
    }

    /**
     * @param BSN the BSN to set
     */
    public void setBSN(long BSN) {
        this.BSN = BSN;
    }

    /**
     * @return the licenseNumber
     */
    public long getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(long licenseNumber) {
        this.licenseNumber = licenseNumber;
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
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the limitations
     */
    public String getLimitations() {
        return limitations;
    }

    /**
     * @param limitations the limitations to set
     */
    public void setLimitations(String limitations) {
        this.limitations = limitations;
    }
    
    
}
