package pl.plpredictorapi.repos.entites;

import javax.persistence.*;


@Entity
@Table(name = "table2020_21")
public class TableLive {

	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer position;
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
	private Integer apiId;
	private Float LigueAvgGoalsScoredHome;
	private Float LigueAvgGoalsScoredAway;
	private Float LigueAvgGoalsLostHome;
	private Float LigueAvgGoalsLostAway;

	private Float OffHome;
	private Float DeffHome;
	private Float OffAway;
	private Float DeffAway;



	public void calculateOffHome(){
		if(MatchesPlayedHome == 0) { //poniewaz nie można dzielić przez 0
			OffHome = 0f;
		}
		else
			OffHome = (GoalsScoredHome/MatchesPlayedHome) / LigueAvgGoalsScoredHome;
	}

	public void calculateOffAway(){
		if(MatchesPlayedAway == 0) {
			OffAway = 0f;
		}
		else
			OffAway = (GoalsScoredAway/MatchesPlayedAway) / LigueAvgGoalsScoredAway;
	}

	public void calculateDeffHome(){
		if(MatchesPlayedHome == 0) {
			DeffHome = 0f;
		}
		else
		DeffHome = (GoalsLostHome/MatchesPlayedHome) / LigueAvgGoalsLostHome;
	}

	public void calculateDeffAway(){
		if(MatchesPlayedAway == 0) {
			DeffAway = 0f;
		}
		else
		DeffAway = (GoalsLostAway/MatchesPlayedAway) / LigueAvgGoalsLostAway;

	}


	public Integer getApiId() { return apiId; }

	public void setApiId(Integer apiId) { this.apiId = apiId; }

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
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
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

	public Float getLigueAvgGoalsScoredHome() {
		return LigueAvgGoalsScoredHome;
	}

	public void setLigueAvgGoalsScoredHome(Float ligueAvgGoalsScoredHome) {
		LigueAvgGoalsScoredHome = ligueAvgGoalsScoredHome;
	}

	public Float getLigueAvgGoalsScoredAway() {
		return LigueAvgGoalsScoredAway;
	}

	public void setLigueAvgGoalsScoredAway(Float ligueAvgGoalsScoredAway) {
		LigueAvgGoalsScoredAway = ligueAvgGoalsScoredAway;
	}

	public Float getLigueAvgGoalsLostHome() {
		return LigueAvgGoalsLostHome;
	}

	public void setLigueAvgGoalsLostHome(Float ligueAvgGoalsLostHome) {
		LigueAvgGoalsLostHome = ligueAvgGoalsLostHome;
	}

	public Float getLigueAvgGoalsLostAway() {
		return LigueAvgGoalsLostAway;
	}

	public void setLigueAvgGoalsLostAway(Float ligueAvgGoalsLostAway) {
		LigueAvgGoalsLostAway = ligueAvgGoalsLostAway;
	}

	public Float getOffHome() { return OffHome; }

	public void setOffHome(Float offHome) { OffHome = offHome; }

	public Float getDeffHome() { return DeffHome; }

	public void setDeffHome(Float deffHome) { DeffHome = deffHome; }

	public Float getOffAway() { return OffAway; }

	public void setOffAway(Float offAway) { OffAway = offAway; }

	public Float getDeffAway() { return DeffAway; }

	public void setDeffAway(Float deffAway) { DeffAway = deffAway; }

	@Override
	public String toString() {
		return "TableLive{" +
				"Id=" + Id +
				", ApiId=" + apiId +
				", Position=" + position +
				", ClubName='" + ClubName + '\'' +
				", Wins=" + Wins +
				", Draws=" + Draws +
				", Losses=" + Losses +
				", GoalsScored=" + GoalsScored +
				", GoalsLost=" + GoalsLost +
				", GoalsDifference=" + GoalsDifference +
				", GoalsScoredHome=" + GoalsScoredHome +
				", GoalsLostHome=" + GoalsLostHome +
				", GoalsScoredAway=" + GoalsScoredAway +
				", GoalsLostAway=" + GoalsLostAway +
				", Points=" + Points +
				", League='" + League + '\'' +
				", MatchesPlayedHome=" + MatchesPlayedHome +
				", MatchesPlayedAway=" + MatchesPlayedAway +
				", LigueAvgGoalsScoredHome=" + LigueAvgGoalsScoredHome +
				", LigueAvgGoalsScoredAway=" + LigueAvgGoalsScoredAway +
				", LigueAvgGoalsLostHome=" + LigueAvgGoalsLostHome +
				", LigueAvgGoalsLostAway=" + LigueAvgGoalsLostAway +
				", OffHome=" + OffHome +
				", DeffHome=" + DeffHome +
				", OffAway=" + OffAway +
				", DeffAway=" + DeffAway +
				'}';
	}
}
