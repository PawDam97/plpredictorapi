package pl.plpredictorapi.repos.entites;

import javax.persistence.*;

@Entity
@Table(name = "teams_strength")
public class TeamStrength {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clubId;
    private String clubName;
    private String league;
    private Float wAvgOffHome;
    private Float wAvgDeffHome;
    private Float wAvgOffAway;
    private Float wAvgDeffAway;
    private Float avgOffHome;
    private Float avgDeffHome;
    private Float avgOffAway;
    private Float avgDeffAway;
    private Float avgTeamGoals;
    private Float wAvgTeamGoals;

    public TeamStrength(){

    }

    public TeamStrength(Integer clubId, String clubName, String league, Float wAvgOffHome, Float wAvgDeffHome, Float wAvgOffAway, Float wAvgDeffAway, Float avgOffHome, Float avgDeffHome ,Float avgOffAway, Float avgDeffAway,Float avgTeamGoals,Float wavgTeamGoals){
        super();
        this.clubId = clubId;
        this.clubName = clubName;
        this.league = league;
        this.wAvgOffHome = wAvgOffHome;
        this.wAvgDeffHome = wAvgDeffHome;
        this.wAvgOffAway = wAvgOffAway;
        this.wAvgDeffAway = wAvgDeffAway;
        this.avgOffHome = avgOffHome;
        this.avgDeffHome = avgDeffHome;
        this.avgOffAway = avgOffAway;
        this.avgDeffAway = avgDeffAway;
        this.avgTeamGoals = avgTeamGoals;
        this.wAvgTeamGoals = wavgTeamGoals;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public Float getwAvgOffHome() {
        return wAvgOffHome;
    }

    public void setwAvgOffHome(Float wAvgOffHome) {
        this.wAvgOffHome = wAvgOffHome;
    }

    public Float getwAvgDeffHome() {
        return wAvgDeffHome;
    }

    public void setwAvgDeffHome(Float wAvgDeffHome) {
        this.wAvgDeffHome = wAvgDeffHome;
    }

    public Float getwAvgOffAway() {
        return wAvgOffAway;
    }

    public void setwAvgOffAway(Float wAvgOffAway) {
        this.wAvgOffAway = wAvgOffAway;
    }

    public Float getwAvgDeffAway() {
        return wAvgDeffAway;
    }

    public void setwAvgDeffAway(Float wAvgDeffAway) {
        this.wAvgDeffAway = wAvgDeffAway;
    }

    public Float getAvgOffHome() {
        return avgOffHome;
    }

    public void setAvgOffHome(Float avgOffHome) {
        this.avgOffHome = avgOffHome;
    }

    public Float getAvgDeffHome() {
        return avgDeffHome;
    }

    public void setAvgDeffHome(Float avgDeffHome) {
        this.avgDeffHome = avgDeffHome;
    }

    public Float getAvgOffAway() {
        return avgOffAway;
    }

    public void setAvgOffAway(Float avgOffAway) {
        this.avgOffAway = avgOffAway;
    }

    public Float getAvgDeffAway() {
        return avgDeffAway;
    }

    public void setAvgDeffAway(Float avgDeffAway) {
        this.avgDeffAway = avgDeffAway;
    }

    public Float getAvgTeamGoals() {
        return avgTeamGoals;
    }

    public void setAvgTeamGoals(Float avgTeamGoals) {
        this.avgTeamGoals = avgTeamGoals;
    }

    public Float getwAvgTeamGoals() {
        return wAvgTeamGoals;
    }

    public void setwAvgTeamGoals(Float wAvgTeamGoals) {
        this.wAvgTeamGoals = wAvgTeamGoals;
    }
}
