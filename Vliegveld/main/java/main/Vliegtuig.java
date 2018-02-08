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
@Table(name="vliegtuigen")
public class Vliegtuig {
    
    @Id
    @Column
    private int registrationNo; //pk
    
    @Column
    private int modelNo;
    
    @Column
    private String type;
    
    @Column
    private int capacity;
    
    @Column
    private int weight;

    public Vliegtuig() {
    }

    public Vliegtuig(int registrationNo, int modelNo, String type, int capacity, int weight) {
        this.registrationNo = registrationNo;
        this.modelNo = modelNo;
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }
    
    

    /**
     * @return the registrationNo
     */
    public int getRegistrationNo() {
        return registrationNo;
    }

    /**
     * @param registrationNo the registrationNo to set
     */
    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    /**
     * @return the modelNo
     */
    public int getModelNo() {
        return modelNo;
    }

    /**
     * @param modelNo the modelNo to set
     */
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
