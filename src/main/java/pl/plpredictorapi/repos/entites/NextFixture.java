package pl.plpredictorapi.repos.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "next_fixture")
public class NextFixture {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String RoundNumber;
    private String HomeTeam;
    private String AwayTeam;
    private String Date;
    private String HalftimeResult;
    private String Result;

    public NextFixture(){}

    public Integer getId() { return Id; }

    public void setId(Integer id) { Id = id; }

    public String  getRoundNumber() { return RoundNumber; }

    public void setRoundNumber(String  roundNumber) { RoundNumber = roundNumber; }

    public String getHomeTeam() { return HomeTeam; }

    public void setHomeTeam(String homeTeam) { HomeTeam = homeTeam; }

    public String getAwayTeam() { return AwayTeam; }

    public void setAwayTeam(String awayTeam) { AwayTeam = awayTeam; }

    public String getDate() { return Date; }

    public void setDate(String date) { Date = date; }

    public String getHalftimeResult() { return HalftimeResult; }

    public void setHalftimeResult(String halftimeResult) { HalftimeResult = halftimeResult; }

    public String getResult() { return Result; }

    public void setResult(String result) { Result = result; }

    @Override
    public String toString() {
        return "[ id: " + String.valueOf(Id) + ", round_number: " + String.valueOf(RoundNumber)  + ", home_team: " + HomeTeam +
                ", away_team: " + AwayTeam + ", date: " + Date +", halftime_result: " + HalftimeResult +
                ", result: " + Result +"]";
    }
}
