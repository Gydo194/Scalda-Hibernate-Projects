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
@Table(name="boetes")
public class Boete {
    
    @Id
    @Column
    private int paymentNumber;
    
    @OneToOne
    private Speler player;
    
    @Column
    private String date;
    
    @Column
    private int amount;

    
    public Boete() {}
    public Boete(int pnum, Speler p, String bdate, int charge) {
        //check date
        paymentNumber = pnum;
        player = p;
        date = bdate;
        amount = charge;
    }
    
    
    /**
     * @return the paymentNumber
     */
    public int getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * @param paymentNumber the paymentNumber to set
     */
    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
