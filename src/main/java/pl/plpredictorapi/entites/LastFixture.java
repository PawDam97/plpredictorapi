package pl.plpredictorapi.entites;

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
    private String date;
    private String Halftime;
    private String Fulltime;
    private Integer fixtureId;
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
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public Integer getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    @Override
    public String toString() {
        return "[ id: " + String.valueOf(Id) + ", round_number: " + String.valueOf(RoundNumber)  + ", home_team: " + HomeTeam +
                ", away_team: " + AwayTeam + ", date: " + date +", halftime: " + Halftime+
                ", fulltime: " + Fulltime +", fixture_id: " + String.valueOf(fixtureId) +"]";
    }
}
