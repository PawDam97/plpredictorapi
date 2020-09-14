
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
    "matchsPlayed",
    "win",
    "draw",
    "lose",
    "goalsFor",
    "goalsAgainst"
})
public class All {

    @JsonProperty("matchsPlayed")
    private Integer matchsPlayed;
    @JsonProperty("win")
    private Integer win;
    @JsonProperty("draw")
    private Integer draw;
    @JsonProperty("lose")
    private Integer lose;
    @JsonProperty("goalsFor")
    private Integer goalsFor;
    @JsonProperty("goalsAgainst")
    private Integer goalsAgainst;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("matchsPlayed")
    public Integer getMatchsPlayed() {
        return matchsPlayed;
    }

    @JsonProperty("matchsPlayed")
    public void setMatchsPlayed(Integer matchsPlayed) {
        this.matchsPlayed = matchsPlayed;
    }

    @JsonProperty("win")
    public Integer getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Integer win) {
        this.win = win;
    }

    @JsonProperty("draw")
    public Integer getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    @JsonProperty("lose")
    public Integer getLose() {
        return lose;
    }

    @JsonProperty("lose")
    public void setLose(Integer lose) {
        this.lose = lose;
    }

    @JsonProperty("goalsFor")
    public Integer getGoalsFor() {
        return goalsFor;
    }

    @JsonProperty("goalsFor")
    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    @JsonProperty("goalsAgainst")
    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    @JsonProperty("goalsAgainst")
    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
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
        return new ToStringBuilder(this).append("matchsPlayed", matchsPlayed).append("win", win).append("draw", draw).append("lose", lose).append("goalsFor", goalsFor).append("goalsAgainst", goalsAgainst).append("additionalProperties", additionalProperties).toString();
    }

}
