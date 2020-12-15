
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
    "appearences",
    "minutes_played"
})
public class Games {

    @JsonProperty("appearences")
    private Integer appearences;
    @JsonProperty("minutes_played")
    private Integer minutesPlayed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("appearences")
    public Integer getAppearences() {
        return appearences;
    }

    @JsonProperty("appearences")
    public void setAppearences(Integer appearences) {
        this.appearences = appearences;
    }

    @JsonProperty("minutes_played")
    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    @JsonProperty("minutes_played")
    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
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
