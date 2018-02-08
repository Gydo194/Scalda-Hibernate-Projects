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
@Table(name="bestuursleden")
public class Bestuurslid {
    
    @Id
    private int id;
    
    @OneToOne
    private Speler player;
    
    @Column
    private String startDate;
    
    @Column
    private String endDate;
    
    @Column
    private String bfunction;

    public Bestuurslid() {}
    
    public Bestuurslid(Speler p, String sdate, String edate, String func) {
        player = p;
        startDate = sdate;
        endDate = edate;
        bfunction = func;
        
    }

    /**
     * @return the player
     */
    public Speler getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Speler player) {
        this.player = player;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the function
     */
    public String getFunction() {
        return bfunction;
    }

    /**
     * @param function the function to set
     */
    public void setFunction(String function) {
        this.bfunction = function;
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
