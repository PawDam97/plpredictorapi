package pl.plpredictorapi.repos.entites;

import javax.persistence.*;

@Entity
@Table(name = "team_strengths")
public class TeamsStrengths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String clubName;
    private Float offHome_15_16;
    private Float deffHome_15_16;
    private Float offAway_15_16;
    private Float deffAway_15_16;
    private Float offHome_16_17;
    private Float deffHome_16_17;
    private Float offAway_16_17;
    private Float deffAway_16_17;
    private Float offHome_17_18;
    private Float deffHome_17_18;
    private Float offAway_17_18;
    private Float deffAway_17_18;
    private Float offHome_18_19;
    private Float deffHome_18_19;
    private Float offAway_18_19;
    private Float deffAway_18_19;
    private Float offHome_19_20;
    private Float deffHome_19_20;
    private Float offAway_19_20;
    private Float deffAway_19_20;
    private Integer goalsScoredHome_15_16;
    private Integer goalsScoredAway_15_16;
    private Integer goalsScoredHome_16_17;
    private Integer goalsScoredAway_16_17;
    private Integer goalsScoredHome_17_18;
    private Integer goalsScoredAway_17_18;
    private Integer goalsScoredHome_18_19;
    private Integer goalsScoredAway_18_19;
    private Integer goalsScoredHome_19_20;
    private Integer goalsScoredAway_19_20;
    private Integer roundMatchsPlayed;
    private Integer seasonsPlayed;
    private Integer shortRoundMatchsPlayed;
    private Integer shortSeasonsPlayed;

    public TeamsStrengths(){ }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Float getOffHome_15_16() {
        return offHome_15_16;
    }

    public void setOffHome_15_16(Float offHome_15_16) {
        this.offHome_15_16 = offHome_15_16;
    }

    public Float getDeffHome_15_16() {
        return deffHome_15_16;
    }

    public void setDeffHome_15_16(Float deffHome_15_16) {
        this.deffHome_15_16 = deffHome_15_16;
    }

    public Float getOffAway_15_16() {
        return offAway_15_16;
    }

    public void setOffAway_15_16(Float offAway_15_16) {
        this.offAway_15_16 = offAway_15_16;
    }

    public Float getDeffAway_15_16() {
        return deffAway_15_16;
    }

    public void setDeffAway_15_16(Float deffAway_15_16) {
        this.deffAway_15_16 = deffAway_15_16;
    }

    public Float getOffHome_16_17() {
        return offHome_16_17;
    }

    public void setOffHome_16_17(Float offHome_16_17) {
        this.offHome_16_17 = offHome_16_17;
    }

    public Float getDeffHome_16_17() {
        return deffHome_16_17;
    }

    public void setDeffHome_16_17(Float deffHome_16_17) {
        this.deffHome_16_17 = deffHome_16_17;
    }

    public Float getOffAway_16_17() {
        return offAway_16_17;
    }

    public void setOffAway_16_17(Float offAway_16_17) {
        this.offAway_16_17 = offAway_16_17;
    }

    public Float getDeffAway_16_17() {
        return deffAway_16_17;
    }

    public void setDeffAway_16_17(Float deffAway_16_17) {
        this.deffAway_16_17 = deffAway_16_17;
    }

    public Float getOffHome_17_18() {
        return offHome_17_18;
    }

    public void setOffHome_17_18(Float offHome_17_18) {
        this.offHome_17_18 = offHome_17_18;
    }

    public Float getDeffHome_17_18() {
        return deffHome_17_18;
    }

    public void setDeffHome_17_18(Float deffHome_17_18) {
        this.deffHome_17_18 = deffHome_17_18;
    }

    public Float getOffAway_17_18() {
        return offAway_17_18;
    }

    public void setOffAway_17_18(Float offAway_17_18) {
        this.offAway_17_18 = offAway_17_18;
    }

    public Float getDeffAway_17_18() {
        return deffAway_17_18;
    }

    public void setDeffAway_17_18(Float deffAway_17_18) {
        this.deffAway_17_18 = deffAway_17_18;
    }

    public Float getOffHome_18_19() {
        return offHome_18_19;
    }

    public void setOffHome_18_19(Float offHome_18_19) {
        this.offHome_18_19 = offHome_18_19;
    }

    public Float getDeffHome_18_19() {
        return deffHome_18_19;
    }

    public void setDeffHome_18_19(Float deffHome_18_19) {
        this.deffHome_18_19 = deffHome_18_19;
    }

    public Float getOffAway_18_19() {
        return offAway_18_19;
    }

    public void setOffAway_18_19(Float offAway_18_19) {
        this.offAway_18_19 = offAway_18_19;
    }

    public Float getDeffAway_18_19() {
        return deffAway_18_19;
    }

    public void setDeffAway_18_19(Float deffAway_18_19) {
        this.deffAway_18_19 = deffAway_18_19;
    }

    public Float getOffHome_19_20() {
        return offHome_19_20;
    }

    public void setOffHome_19_20(Float offHome_19_20) {
        this.offHome_19_20 = offHome_19_20;
    }

    public Float getDeffHome_19_20() {
        return deffHome_19_20;
    }

    public void setDeffHome_19_20(Float deffHome_19_20) {
        this.deffHome_19_20 = deffHome_19_20;
    }

    public Float getOffAway_19_20() {
        return offAway_19_20;
    }

    public void setOffAway_19_20(Float offAway_19_20) {
        this.offAway_19_20 = offAway_19_20;
    }

    public Float getDeffAway_19_20() {
        return deffAway_19_20;
    }

    public void setDeffAway_19_20(Float deffAway_19_20) {
        this.deffAway_19_20 = deffAway_19_20;
    }

    public Integer getGoalsScoredHome_15_16() {
        return goalsScoredHome_15_16;
    }

    public void setGoalsScoredHome_15_16(Integer goalsScoredHome_15_16) {
        this.goalsScoredHome_15_16 = goalsScoredHome_15_16;
    }

    public Integer getGoalsScoredAway_15_16() {
        return goalsScoredAway_15_16;
    }

    public void setGoalsScoredAway_15_16(Integer goalsScoredAway_15_16) {
        this.goalsScoredAway_15_16 = goalsScoredAway_15_16;
    }

    public Integer getGoalsScoredHome_16_17() {
        return goalsScoredHome_16_17;
    }

    public void setGoalsScoredHome_16_17(Integer goalsScoredHome_16_17) {
        this.goalsScoredHome_16_17 = goalsScoredHome_16_17;
    }

    public Integer getGoalsScoredAway_16_17() {
        return goalsScoredAway_16_17;
    }

    public void setGoalsScoredAway_16_17(Integer goalsScoredAway_16_17) {
        this.goalsScoredAway_16_17 = goalsScoredAway_16_17;
    }

    public Integer getGoalsScoredHome_17_18() {
        return goalsScoredHome_17_18;
    }

    public void setGoalsScoredHome_17_18(Integer goalsScoredHome_17_18) {
        this.goalsScoredHome_17_18 = goalsScoredHome_17_18;
    }

    public Integer getGoalsScoredAway_17_18() {
        return goalsScoredAway_17_18;
    }

    public void setGoalsScoredAway_17_18(Integer goalsScoredAway_17_18) {
        this.goalsScoredAway_17_18 = goalsScoredAway_17_18;
    }

    public Integer getGoalsScoredHome_18_19() {
        return goalsScoredHome_18_19;
    }

    public void setGoalsScoredHome_18_19(Integer goalsScoredHome_18_19) {
        this.goalsScoredHome_18_19 = goalsScoredHome_18_19;
    }

    public Integer getGoalsScoredAway_18_19() {
        return goalsScoredAway_18_19;
    }

    public void setGoalsScoredAway_18_19(Integer goalsScoredAway_18_19) {
        this.goalsScoredAway_18_19 = goalsScoredAway_18_19;
    }

    public Integer getGoalsScoredHome_19_20() {
        return goalsScoredHome_19_20;
    }

    public void setGoalsScoredHome_19_20(Integer goalsScoredHome_19_20) {
        this.goalsScoredHome_19_20 = goalsScoredHome_19_20;
    }

    public Integer getGoalsScoredAway_19_20() {
        return goalsScoredAway_19_20;
    }

    public void setGoalsScoredAway_19_20(Integer goalsScoredAway_19_20) {
        this.goalsScoredAway_19_20 = goalsScoredAway_19_20;
    }

    public Integer getRoundMatchsPlayed() {
        return roundMatchsPlayed;
    }

    public void setRoundMatchsPlayed(Integer roundMatchsPlayed) {
        this.roundMatchsPlayed = roundMatchsPlayed;
    }

    public Integer getSeasonsPlayed() {
        return seasonsPlayed;
    }

    public void setSeasonsPlayed(Integer seasonsPlayed) {
        this.seasonsPlayed = seasonsPlayed;
    }

    public Integer getShortRoundMatchsPlayed() {
        return shortRoundMatchsPlayed;
    }

    public void setShortRoundMatchsPlayed(Integer shortRoundMatchsPlayed) {
        this.shortRoundMatchsPlayed = shortRoundMatchsPlayed;
    }

    public Integer getShortSeasonsPlayed() {
        return shortSeasonsPlayed;
    }

    public void setShortSeasonsPlayed(Integer shortSeasonsPlayed) {
        this.shortSeasonsPlayed = shortSeasonsPlayed;
    }
}
