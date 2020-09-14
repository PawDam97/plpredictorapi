
package pl.plpredictorapi.jsons;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rank",
    "team_id",
    "teamName",
    "logo",
    "group",
    "forme",
    "status",
    "description",
    "all",
    "home",
    "away",
    "goalsDiff",
    "points",
    "lastUpdate"
})
public class Standing {

    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("teamName")
    private String teamName;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("group")
    private String group;
    @JsonProperty("forme")
    private String forme;
    @JsonProperty("status")
    private String status;
    @JsonProperty("description")
    private String description;
    @JsonProperty("all")
    private All all;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("away")
    private Away away;
    @JsonProperty("goalsDiff")
    private Integer goalsDiff;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("team_id")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("teamName")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("teamName")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("forme")
    public String getForme() {
        return forme;
    }

    @JsonProperty("forme")
    public void setForme(String forme) {
        this.forme = forme;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("all")
    public All getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(All all) {
        this.all = all;
    }

    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    @JsonProperty("away")
    public Away getAway() {
        return away;
    }

    @JsonProperty("away")
    public void setAway(Away away) {
        this.away = away;
    }

    @JsonProperty("goalsDiff")
    public Integer getGoalsDiff() {
        return goalsDiff;
    }

    @JsonProperty("goalsDiff")
    public void setGoalsDiff(Integer goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("lastUpdate")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("lastUpdate")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rank", rank).append("teamId", teamId).append("teamName", teamName).append("logo", logo).append("group", group).append("forme", forme).append("status", status).append("description", description).append("all", all).append("home", home).append("away", away).append("goalsDiff", goalsDiff).append("points", points).append("lastUpdate", lastUpdate).append("additionalProperties", additionalProperties).toString();
    }

}
