package pl.plpredictorapi.repos.entites;

import javax.persistence.*;

@Entity
@Table(name = "table2015_16")
public class TableOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;
    @Column(name = "Position")
    private Integer Position;
    @Column(name = "ClubName")
    private String ClubName;
    @Column(name = "Wins")
    private Float Wins;
    @Column(name = "Draws")
    private Float Draws;
    @Column(name = "Losses")
    private Float Losses;
    @Column(name = "GoalsScored")
    private Float GoalsScored;
    @Column(name = "GoalsLost")
    private Float GoalsLost;
    @Column(name = "GoalsDifference")
    private Float GoalsDifference;
    @Column(name = "GoalsScoredHome")
    private Float GoalsScoredHome;
    @Column(name = "GoalsLostHome")
    private Float GoalsLostHome;
    @Column(name = "GoalsScoredAway")
    private Float GoalsScoredAway;
    @Column(name = "GoalsLostAway")
    private Float GoalsLostAway;
    @Column(name = "YellowCards")
    private Float YellowCards;
    @Column(name = "RedCards")
    private Float RedCards;
    @Column(name = "Points")
    private Float Points;
    @Column(name = "League")
    private String League;

    public TableOne(){

    }

    public TableOne(Integer id,Integer position, String clubName, Float wins, Float draws, Float losses, Float goalsScored, Float goalsLost, Float goalsDifference, Float goalsScoredHome, Float goalsLostHome, Float goalsScoredAway, Float goalsLostAway, Float yellowCards, Float redCards, Float points, String league) {
        this.Id = id;
        this.Position = position;
        this.ClubName = clubName;
        this.Wins = wins;
        this.Draws = draws;
        this.Losses = losses;
        this.GoalsScored = goalsScored;
        this.GoalsLost = goalsLost;
        this.GoalsDifference = goalsDifference;
        this.GoalsScoredHome = goalsScoredHome;
        this.GoalsLostHome = goalsLostHome;
        this.GoalsScoredAway = goalsScoredAway;
        this.GoalsLostAway = goalsLostAway;
        this.YellowCards = yellowCards;
        this.RedCards = redCards;
        this.Points = points;
        this.League = league;
    }



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

    public Float getYellowCards() {
        return YellowCards;
    }

    public void setYellowCards(Float yellowCards) {
        YellowCards = yellowCards;
    }

    public Float getRedCards() {
        return RedCards;
    }

    public void setRedCards(Float redCards) {
        RedCards = redCards;
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
}
