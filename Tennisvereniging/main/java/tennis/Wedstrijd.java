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
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "wedstrijden")
public class Wedstrijd {

    @Id
    @Column
    private int no;

    @ManyToMany
    private Collection<Team> teams;
    
 

    @Column
    private int won;

    @Column
    private int lost;

    public Wedstrijd() {
    }

    public Wedstrijd(int cnum, Collection<Team> cteam, int cwon, int clost) {
        no = cnum;
        teams = cteam;
        won = cwon;
        lost = clost;
    }

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }


    /**
     * @return the won
     */
    public int getWon() {
        return won;
    }

    /**
     * @param won the won to set
     */
    public void setWon(int won) {
        this.won = won;
    }

    /**
     * @return the lost
     */
    public int getLost() {
        return lost;
    }

    /**
     * @param lost the lost to set
     */
    public void setLost(int lost) {
        this.lost = lost;
    }

    /**
     * @return the teams
     */
    public Collection<Team> getTeams() {
        return teams;
    }

    /**
     * @param teams the teams to set
     */
    public void setTeams(Collection<Team> teams) {
        this.teams = teams;
    }
}
