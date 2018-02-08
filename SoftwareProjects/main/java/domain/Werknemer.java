/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author gydo194
 */
@Entity
@Table(name="Werknemer")
public class Werknemer {

    /**
     * @return the projects
     */
    public Collection<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }
    
    @Id
    @Column(name="code",length=3)
    private String code;
    
    @Column(name="name")
    private String name;
    
    @Column(name="prefix")
    private String wprefix;
    
    @Column(name="insertion")
    private String insertion;
    
    @Column(name="adress")
    private String adress;
    
    @Column(name="postalCode")
    private String postalCode;
    
    @Column(name="city")
    private String city;
    
    @Column(name="applicationDate")
    private String applicationDate;
    
    @Column(name="salary")
    private double salary;
    
    @Column //notice no name, will this work?
    private char salaryScale;
    
   
    @ManyToMany
    private Collection<Project> projects;
    
    /*
    @Id
    private int id;
*/
    
    
    
    
    
    public Werknemer(String code, String name, String wprefix, String insertion, String adress, String postalCode, String city, String applicationDate, double salary, char salaryScale, ArrayList<Project> projects) {
        //this.id = id;
        this.code = code;
        this.name = name;
        this.wprefix = wprefix;
        this.insertion = insertion;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
        this.applicationDate = applicationDate;
        this.salary = salary;
        this.salaryScale = salaryScale;
        this.projects = projects;
    }
    
    
    
    
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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

    private String getWprefix() { return wprefix; }
    private void setWprefix(String w) { wprefix = w; }


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
     * @return the address
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param address the address to set
     */
    public void setAdress(String address) {
        this.adress = address;
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
     * @return the applicationDate
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * @param applicationDate the applicationDate to set
     */
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
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
     * @return the salaryScale
     */
    public char getSalaryScale() {
        return salaryScale;
    }

    /**
     * @param salaryScale the salaryScale to set
     */
    public void setSalaryScale(char salaryScale) {
        this.salaryScale = salaryScale;
    }
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/
}
