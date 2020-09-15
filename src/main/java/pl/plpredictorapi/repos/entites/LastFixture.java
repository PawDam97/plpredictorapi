package pl.plpredictorapi.repos.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "last_fixture")
public class LastFixture {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String RoundNumber;
    private String HomeTeam;
    private String AwayTeam;
    private String Date;
    private String Halftime;
    private String Fulltime;
    public LastFixture(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getRoundNumber() {
        return RoundNumber;
    }

    public void setRoundNumber(String roundNumber) {
        RoundNumber = roundNumber;
    }

    public String getHomeTeam() {
        return HomeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        HomeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return AwayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        AwayTeam = awayTeam;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getHalftime() {
        return Halftime;
    }

    public void setHalftime(String halftime) {
        Halftime = halftime;
    }

    public String getFulltime() {
        return Fulltime;
    }

    public void setFulltime(String fulltime) {
        Fulltime = fulltime;
    }
    @Override
    public String toString() {
        return "[ id: " + String.valueOf(Id) + ", round_number: " + String.valueOf(RoundNumber)  + ", home_team: " + HomeTeam +
                ", away_team: " + AwayTeam + ", date: " + Date +", halftime: " + Halftime+
                ", fulltime: " + Fulltime +"]";
    }
}
