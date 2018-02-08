/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/*
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
*/

import org.hibernate.*;
import javax.persistence.*;


//import org.hibernate.;



/**
 *
 * @author gydo194
 */

@Entity(name="Project")
@Table(name="Project")
public class Project {
/*
   // @Id
    private int id;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    */
    
    public Project() {}
    
    public Project(String projectCode, String projectName, String location, Date startDate, double budget, Werknemer leader) {
        projectcode = projectCode;
        projectnaam = projectName;
        locatie = location;
        this.startDate = startDate;
        this.budget = budget;
        projectleider = leader;
    }
    
    
    
    @Id
    @Column(name="p_code",length=5)
    private String projectcode;
    
    @Column(name="p_naam")
    private String projectnaam;
    
    @Column(name="locatie")
    private String locatie;
    
    @Column(name="startDate")
    private Date startDate;
    
    @Column(name="budget")
    private double budget;
    
    //@Column(name="p_leader")
    
    //tell hibernate what this references to
    @ManyToOne
    private Werknemer projectleider;

    /**
     * @return the projectcode
     */
    public String getProjectcode() {
        return projectcode;
    }

    /**
     * @param projectcode the projectcode to set
     */
    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    /**
     * @return the projectnaam
     */
    public String getProjectnaam() {
        return projectnaam;
    }

    /**
     * @param projectnaam the projectnaam to set
     */
    public void setProjectnaam(String projectnaam) {
        this.projectnaam = projectnaam;
    }

    /**
     * @return the locatie
     */
    public String getLocatie() {
        return locatie;
    }

    /**
     * @param locatie the locatie to set
     */
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the budget
     */
    public double getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * @return the projectleider
     */
    public Werknemer getProjectleider() {
        return projectleider;
    }

    /**
     * @param projectleider the projectleider to set
     */
    public void setProjectleider(Werknemer projectleider) {
        this.projectleider = projectleider;
    }
    
    

   

    
}
