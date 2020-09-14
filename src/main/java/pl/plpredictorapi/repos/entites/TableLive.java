package pl.plpredictorapi.repos.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.net.http.HttpResponse;

@Entity
@Table(name = "table2020_21")
public class TableLive {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;
	private Integer ApiId;
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
	private Float MatchesPlayedHome;
	private Float MatchesPlayedAway;

	public Integer getApiId() { return ApiId; }

	public void setApiId(Integer apiId) { ApiId = apiId; }

	public Float getMatchesPlayedHome() { return MatchesPlayedHome; }

	public void setMatchesPlayedHome(Float matchesPlayedHome) { MatchesPlayedHome = matchesPlayedHome; }

	public Float getMatchesPlayedAway() { return MatchesPlayedAway; }

	public void setMatchesPlayedAway(Float matchesPlayedAway) { MatchesPlayedAway = matchesPlayedAway; }

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPosition() {
		return Position;
	}

	public void setPosition(Integer position) {
		Position = position;
	}

	public String getClubName() {
		return ClubName;
	}

	public void setClubName(String clubName) {
		ClubName = clubName;
	}

	public Float getWins() {
		return Wins;
	}

	public void setWins(Float wins) {
		Wins = wins;
	}

	public Float getDraws() {
		return Draws;
	}

	public void setDraws(Float draws) {
		Draws = draws;
	}

	public Float getLosses() {
		return Losses;
	}

	public void setLosses(Float losses) {
		Losses = losses;
	}

	public Float getGoalsScored() {
		return GoalsScored;
	}

	public void setGoalsScored(Float goalsScored) {
		GoalsScored = goalsScored;
	}

	public Float getGoalsLost() {
		return GoalsLost;
	}

	public void setGoalsLost(Float goalsLost) {
		GoalsLost = goalsLost;
	}

	public Float getGoalsDifference() {
		return GoalsDifference;
	}

	public void setGoalsDifference(Float goalsDifference) {
		GoalsDifference = goalsDifference;
	}

	public Float getGoalsScoredHome() {
		return GoalsScoredHome;
	}

	public void setGoalsScoredHome(Float goalsScoredHome) {
		GoalsScoredHome = goalsScoredHome;
	}

	public Float getGoalsLostHome() {
		return GoalsLostHome;
	}

	public void setGoalsLostHome(Float goalsLostHome) {
		GoalsLostHome = goalsLostHome;
	}

	public Float getGoalsScoredAway() {
		return GoalsScoredAway;
	}

	public void setGoalsScoredAway(Float goalsScoredAway) {
		GoalsScoredAway = goalsScoredAway;
	}

	public Float getGoalsLostAway() {
		return GoalsLostAway;
	}

	public void setGoalsLostAway(Float goalsLostAway) {
		GoalsLostAway = goalsLostAway;
	}

	public Float getPoints() {
		return Points;
	}

	public void setPoints(Float points) {
		Points = points;
	}

	public String getLeague() {
		return League;
	}

	public void setLeague(String league) {
		League = league;
	}

	public TableLive(){}

}
