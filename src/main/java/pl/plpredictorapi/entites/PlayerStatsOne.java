package pl.plpredictorapi.entites;

import javax.persistence.*;

@Entity
@Table(name = "playerstats2015_16")
public class PlayerStatsOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PlayerId;
    private Integer Position;
    private String Name;
    private String Surname;
    private String Club;
    private Integer Goals;
    private Integer Assists;
    private Integer YellowCards;
    private Integer RedCards;
    private Integer CleanSheets;
    private String League;

    public PlayerStatsOne(){
    }

    public Integer getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(Integer playerId) {
        PlayerId = playerId;
    }

    public Integer getPosition() {
        return Position;
    }

    public void setPosition(Integer position) {
        Position = position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }

    public Integer getGoals() {
        return Goals;
    }

    public void setGoals(Integer goals) {
        Goals = goals;
    }

    public Integer getAssists() {
        return Assists;
    }

    public void setAssists(Integer assists) {
        Assists = assists;
    }

    public Integer getYellowCards() {
        return YellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        YellowCards = yellowCards;
    }

    public Integer getRedCards() {
        return RedCards;
    }

    public void setRedCards(Integer redCards) {
        RedCards = redCards;
    }

    public Integer getCleanSheets() {
        return CleanSheets;
    }

    public void setCleanSheets(Integer cleanSheets) {
        CleanSheets = cleanSheets;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String league) {
        League = league;
    }
}
