package pl.plpredictorapi.jsons.playerStats;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "player_id",
    "player_name",
    "firstname",
    "lastname",
    "position",
    "nationality",
    "team_id",
    "team_name",
    "games",
    "goals",
    "shots",
    "penalty",
    "cards"
})
public class Topscorer {

    @JsonProperty("player_id")
    private Integer playerId;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("position")
    private String position;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("games")
    private Games games;
    @JsonProperty("goals")
    private Goals goals;
    @JsonProperty("shots")
    private Shots shots;
    @JsonProperty("penalty")
    private Penalty penalty;
    @JsonProperty("cards")
    private Cards cards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("player_id")
    public Integer getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("player_name")
    public String getPlayerName() {
        return playerName;
    }

    @JsonProperty("player_name")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("team_id")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("games")
    public Games getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(Games games) {
        this.games = games;
    }

    @JsonProperty("goals")
    public Goals getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    @JsonProperty("shots")
    public Shots getShots() {
        return shots;
    }

    @JsonProperty("shots")
    public void setShots(Shots shots) {
        this.shots = shots;
    }

    @JsonProperty("penalty")
    public Penalty getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    @JsonProperty("cards")
    public Cards getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(Cards cards) {
        this.cards = cards;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
