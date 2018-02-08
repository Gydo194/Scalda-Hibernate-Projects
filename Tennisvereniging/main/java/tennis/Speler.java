/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

/**
 *
 * @author gydo194
 */
import javax.persistence.*;

@Entity
@Table(name = "spelers")
public class Speler {

    @Id
    @Column
    private int number;

    @Column
    private String name;

    @Column
    private String prefix;

    @Column
    private String insertion;

    @Column
    private String birthdate;

    @Column
    private char gender;

    @Column
    private String startYear;

    @Column
    private String street;

    @Column
    private int houseno;

    @Column
    private String postalCode;

    @Column
    private String city;

    @Column
    private String phoneNo;

    @Column
    private int bond_no;

    //empty constructor
    public Speler() {
    }

    //setting constructor
    public Speler(int spNo, String spName, String spPrefix, String spInsertion, String spBirthDate, char spGender, String spStartYear, String spStreet, int spHouseNo, String spPostalCode, String spCity, String spPhoneNo, int spBondNo) {
        number = spNo;
        name = spName;
        prefix = spPrefix;
        insertion = spInsertion;
        birthdate = spBirthDate;
        gender = spGender;
        startYear = spStartYear;
        street = spStreet;
        houseno = spHouseNo;
        postalCode = spPostalCode;
        city = spCity;
        phoneNo = spPhoneNo;
        bond_no = spBondNo;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
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
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return the insertion
     */
    public String getInsertion() {
        return insertion;
    }

    /**
     * @param insertion the insertion to set
     */
    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the startYear
     */
    public String getStartYear() {
        return startYear;
    }

    /**
     * @param startYear the startYear to set
     */
    public void setStartYear(String startYear) {
        this.startYear = startYear;
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
     * @return the houseno
     */
    public int getHouseno() {
        return houseno;
    }

    /**
     * @param houseno the houseno to set
     */
    public void setHouseno(int houseno) {
        this.houseno = houseno;
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

    /**
     * @return the bond_no
     */
    public int getBond_no() {
        return bond_no;
    }

    /**
     * @param bond_no the bond_no to set
     */
    public void setBond_no(int bond_no) {
        this.bond_no = bond_no;
    }
}
