package pl.plpredictorapi.repos.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.net.http.HttpResponse;

@Entity
@Table(name = "table2020_21")
public class TableLive {
    //HttpResponse<String> response = Unirest.get("https://api-football-v1.p.rapidapi.com/v2/leagueTable/524")
     //       .header("x-rapidapi-host", "api-football-v1.p.rapidapi.com")
      //      .header("x-rapidapi-key", "ad53fe4823msh08e98e190c82629p19577djsn5a6af4d40f2c")
      //      .asString();
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;
    private Integer Position;
    private String ClubName;
    private Float Wins;
    private Float Draws;
    private Float Losses;
    private Float GoalsScored;
    private Float GoalsLost;
    private Float GoalsDifference;
    private Float GoalsScoredHome;
    private Float GoalsLostHome;
    private Float GoalsScoredAway;
    private Float GoalsLostAway;
    private Float Points;
    private String League;

    public TableLive(){}
    @Override
    public String toString() {
        return "[ id: " + String.valueOf(Id) + ", position: " + String.valueOf(Position)  + ", club_name: " + ClubName +
                ", wins: " + String.valueOf(Wins) + ", draws: " + String.valueOf(Draws) +", losses: " + String.valueOf(Losses) +
                ", goals_scored: " + String.valueOf(GoalsScored) +", goals_lost: " + String.valueOf(GoalsLost) +", " +
                "goals_difference: " + String.valueOf(GoalsDifference) + ", goals_scored_home: " + String.valueOf(GoalsScoredHome) +
                ", goals_lost_home: " + String.valueOf(GoalsLostHome) +", goals_scored_away: " + String.valueOf(GoalsScoredAway) +
                ", goals_lost_away: " + String.valueOf(GoalsLostAway) +", points: " + String.valueOf(Points) +", league: " + League +" ]";
    }
}
