package pl.plpredictorapi.jsons.nextfixtures;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fixture_id",
        "league_id",
        "league",
        "event_date",
        "event_timestamp",
        "firstHalfStart",
        "secondHalfStart",
        "round",
        "status",
        "statusShort",
        "elapsed",
        "venue",
        "referee",
        "homeTeam",
        "awayTeam",
        "goalsHomeTeam",
        "goalsAwayTeam",
        "score"
})
public class Fixture {
    @JsonProperty("fixture_id")
    private Integer fixtureId;
    @JsonProperty("league_id")
    private Integer leagueId;
    @JsonProperty("league")
    private League league;
    @JsonProperty("event_date")
    private String eventDate;
    @JsonProperty("event_timestamp")
    private String eventTimestamp;
    @JsonProperty("firstHalfStart")
    private String firstHalfStart;
    @JsonProperty("secondHalfStart")
    private String secondHalfStart;
    @JsonProperty("round")
    private String round;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusShort")
    private String statusShort;
    @JsonProperty("elapsed")
    private Integer elapsed;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("referee")
    private String referee;
    @JsonProperty("homeTeam")
    private HomeTeam homeTeam;
    @JsonProperty("awayTeam")
    private AwayTeam awayTeam;
    @JsonProperty("goalsHomeTeam")
    private Integer goalsHomeTeam;
    @JsonProperty("goalsAwayTeam")
    private Integer goalsAwayTeam;
    @JsonProperty("score")
    private Score score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("fixture_id")
    public Integer getFixtureId() { return fixtureId; }
    @JsonProperty("fixture_id")
    public void setFixtureId(Integer fixtureId) { this.fixtureId = fixtureId; }
    @JsonProperty("league_id")
    public Integer getLeagueId() { return leagueId; }
    @JsonProperty("league_id")
    public void setLeagueId(Integer leagueId) { this.leagueId = leagueId; }
    @JsonProperty("league")
    public League getLeague() { return league; }
    @JsonProperty("league")
    public void setLeague(League league) { this.league = league; }
    @JsonProperty("event_date")
    public String getEventDate() { return eventDate; }
    @JsonProperty("event_date")
    public void setEventDate(String eventDate) { this.eventDate = eventDate; }
    @JsonProperty("event_timestamp")
    public String getEventTimestamp() { return eventTimestamp; }
    @JsonProperty("event_timestamp")
    public void setEventTimestamp(String eventTimestamp) { this.eventTimestamp = eventTimestamp; }
    @JsonProperty("firstHalfStart")
    public String getFirstHalfStart() { return firstHalfStart; }
    @JsonProperty("firstHalfStart")
    public void setFirstHalfStart(String firstHalfStart) { this.firstHalfStart = firstHalfStart; }
    @JsonProperty("secondHalfStart")
    public String getSecondHalfStart() { return secondHalfStart; }
    @JsonProperty("secondHalfStart")
    public void setSecondHalfStart(String secondHalfStart) { this.secondHalfStart = secondHalfStart; }
    @JsonProperty("round")
    public String getRound() { return round; }
    @JsonProperty("round")
    public void setRound(String round) { this.round = round; }
    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String status) { this.status = status; }
    @JsonProperty("statusShort")
    public String getStatusShort() { return statusShort; }
    @JsonProperty("statusShort")
    public void setStatusShort(String statusShort) { this.statusShort = statusShort; }
    @JsonProperty("elapsed")
    public Integer getElapsed() { return elapsed; }
    @JsonProperty("elapsed")
    public void setElapsed(Integer elapsed) { this.elapsed = elapsed; }
    @JsonProperty("venue")
    public String getVenue() { return venue; }
    @JsonProperty("venue")
    public void setVenue(String venue) { this.venue = venue; }
    @JsonProperty("referee")
    public String getReferee() { return referee; }
    @JsonProperty("referee")
    public void setReferee(String referee) { this.referee = referee; }
    @JsonProperty("homeTeam")
    public HomeTeam getHomeTeam() { return homeTeam; }
    @JsonProperty("homeTeam")
    public void setHomeTeam(HomeTeam homeTeam) { this.homeTeam = homeTeam; }
    @JsonProperty("awayTeam")
    public AwayTeam getAwayTeam() { return awayTeam; }
    @JsonProperty("awayTeam")
    public void setAwayTeam(AwayTeam awayTeam) { this.awayTeam = awayTeam; }
    @JsonProperty("goalsHomeTeam")
    public Integer getGoalsHomeTeam() { return goalsHomeTeam; }
    @JsonProperty("goalsHomeTeam")
    public void setGoalsHomeTeam(Integer goalsHomeTeam) { this.goalsHomeTeam = goalsHomeTeam; }
    @JsonProperty("goalsAwayTeam")
    public Integer getGoalsAwayTeam() { return goalsAwayTeam; }
    @JsonProperty("goalsAwayTeam")
    public void setGoalsAwayTeam(Integer goalsAwayTeam) { this.goalsAwayTeam = goalsAwayTeam; }
    @JsonProperty("score")
    public Score getScore() { return score; }
    @JsonProperty("score")
    public void setScore(Score score) { this.score = score; }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() { return additionalProperties; }
    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fixture_id", fixtureId).append("league_id", leagueId).append("league", league).append("event_date", eventDate).append("event_timestamp", eventTimestamp).append("firstHalfStart", firstHalfStart).append("secondHalfStart", secondHalfStart).append("round", round).append("status", status).append("statusShort", statusShort).append("elapsed", elapsed).append("venue", venue).append("referee", referee).append("homeTeam", homeTeam).append("awayTeam", awayTeam).append("goalsHomeTeam", goalsHomeTeam).append("goalsAwayTeam", goalsAwayTeam).append("score", score).append("additionalProperties", additionalProperties).toString();
    }
}
