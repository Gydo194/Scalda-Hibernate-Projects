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
@Table(name="onderhoud")
public class Onderhoudsbeurt {
    
    @Id
    @Column
    private int id;
    
    @OneToOne
    private Employee thisGuyDidIt;
    
    @Column
    private double hours;
    
    @Column
    private String description;

    public Onderhoudsbeurt(int id, Employee thisGuyDidIt, double hours, String description) {
        this.id = id;
        this.thisGuyDidIt = thisGuyDidIt;
        this.hours = hours;
        this.description = description;
    }

    public Onderhoudsbeurt() {
    }

    /**
     * @return the thisGuyDidIt
     */
    public Employee getThisGuyDidIt() {
        return thisGuyDidIt;
    }

    /**
     * @param thisGuyDidIt the thisGuyDidIt to set
     */
    public void setThisGuyDidIt(Employee thisGuyDidIt) {
        this.thisGuyDidIt = thisGuyDidIt;
    }

    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
}
