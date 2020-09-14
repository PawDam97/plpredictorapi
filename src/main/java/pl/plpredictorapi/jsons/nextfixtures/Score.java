package pl.plpredictorapi.jsons.nextfixtures;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "halftime",
        "fulltime",
        "extratime",
        "penalty"
})
public class Score {
    @JsonProperty("halftime")
    private String halftime;
    @JsonProperty("fulltime")
    private String fulltime;
    @JsonProperty("extratime")
    private Integer extratime;
    @JsonProperty("penalty")
    private Integer penalty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("halftime")
    public String getHalftime() { return halftime; }
    @JsonProperty("halftime")
    public void setHalftime(String halftime) { this.halftime = halftime; }
    @JsonProperty("fulltime")
    public String getFulltime() { return fulltime; }
    @JsonProperty("fulltime")
    public void setFulltime(String fulltime) { this.fulltime = fulltime; }
    @JsonProperty("extratime")
    public Integer getExtratime() { return extratime; }
    @JsonProperty("extratime")
    public void setExtratime(Integer extratime) { this.extratime = extratime; }
    @JsonProperty("penalty")
    public Integer getPenalty() { return penalty; }
    @JsonProperty("penalty")
    public void setPenalty(Integer penalty) { this.penalty = penalty; }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() { return additionalProperties; }
    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("halftime", halftime).append("fulltime", fulltime).append("extratime", extratime).append("penalty", penalty).append("additionalProperties", additionalProperties).toString();
    }
}
