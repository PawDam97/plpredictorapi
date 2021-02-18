package pl.plpredictorapi.entites;

import javax.persistence.*;

@Entity
@Table(name = "playerstatslive")
public class PlayerStatsLive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer PlayerId;
    private String firstname;
    private String lastname;
    private String teamName;
    private Integer minutesPlayed;
    private Integer totalGoals;
   // private Integer totalAssists;
    private Integer redCards;
    private Integer yellowCards;
    private Integer shoots;
    private Integer penalties;
    public PlayerStatsLive(){
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(Integer playerId) {
        PlayerId = playerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Integer getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(Integer totalGoals) {
        this.totalGoals = totalGoals;
    }


    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getShoots() {
        return shoots;
    }

    public void setShoots(Integer shoots) {
        this.shoots = shoots;
    }

    public Integer getPenalties() {
        return penalties;
    }

    public void setPenalties(Integer penalties) {
        this.penalties = penalties;
    }
    @Override
    public String toString() {
        return "TableLive{" +
                "Id=" + Id +
                ", PlayerId=" + PlayerId +
                ", firstname=" + firstname +
                ", lastname='" + lastname +
                ", teamName=" + teamName +
                ", minutesPlayed=" + minutesPlayed +
                ", totalGoals=" + totalGoals +
                ", redCards=" + redCards +
                ", yellowCards=" + yellowCards +
                ", shoots=" + shoots +
                ", penalties=" + penalties +
                '}';
    }
}
