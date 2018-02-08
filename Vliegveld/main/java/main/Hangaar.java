/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;


/**
 *
 * @author gydo194
 */

@Entity
@Table(name="hangaren")
public class Hangaar {

    @Id
    @Column
    private int number;

  
    @OneToMany
    private Collection<Vliegtuig> planes = new ArrayList<>();
    
    @Column
    private int surface;

    
    public Hangaar(int Id, Collection<Vliegtuig> planes, int surface) {
        this.number = Id;
        this.planes = planes;
        this.surface = surface;
    }

    public Hangaar() {
    }
    
    
    public void addPlane(Vliegtuig a) { planes.add(a); }
    
    
    
    
      /**
     * Get the value of Id
     *
     * @return the value of Id
     */
    public int getId() {
        return number;
    }

    /**
     * Set the value of Id
     *
     * @param Id new value of Id
     */
    public void setId(int Id) {
        this.number = Id;
    }
    
    
    /**
     * @return the planes
     */
    public Collection<Vliegtuig> getPlanes() {
        return planes;
    }

    /**
     * @param planes the planes to set
     */
    public void setPlanes(Collection<Vliegtuig> planes) {
        this.planes = planes;
    }

    /**
     * @return the surface
     */
    public int getSurface() {
        return surface;
    }

    /**
     * @param surface the surface to set
     */
    public void setSurface(int surface) {
        this.surface = surface;
    }
    
    
    
}
