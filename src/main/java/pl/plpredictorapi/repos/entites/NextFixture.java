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
    private String date;
    private Integer HomeTeamId;
    private Integer AwayTeamId;
    private Integer fixtureId;

    public NextFixture(){}

    public Integer getId() { return Id; }

    public void setId(Integer id) { Id = id; }

    public String  getRoundNumber() { return RoundNumber; }

    public void setRoundNumber(String  roundNumber) { RoundNumber = roundNumber; }

    public String getHomeTeam() { return HomeTeam; }

    public void setHomeTeam(String homeTeam) { HomeTeam = homeTeam; }

    public String getAwayTeam() { return AwayTeam; }

    public void setAwayTeam(String awayTeam) { AwayTeam = awayTeam; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public Integer getHomeTeamId() { return HomeTeamId; }

    public void setHomeTeamId(Integer homeTeamId) { HomeTeamId = homeTeamId; }

    public Integer getAwayTeamId() { return AwayTeamId; }

    public void setAwayTeamId(Integer awayTeamId) { AwayTeamId = awayTeamId; }

    public Integer getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    @Override
    public String toString() {
        return "[ id: " + String.valueOf(Id) + ", round_number: " + String.valueOf(RoundNumber)  + ", home_team: " + HomeTeam +
                ", away_team: " + AwayTeam + ", date: " + date +", home_team_id: " + String.valueOf(HomeTeamId) +
                ", away_team_id: " + String.valueOf(AwayTeamId) +", fixture_id: " + String.valueOf(fixtureId) +"]";
    }
}
