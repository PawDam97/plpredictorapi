package pl.plpredictorapi.jsons.nextfixtures;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "team_id",
        "team_name",
        "logo",
})
public class HomeTeam {
    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("logo")
    private String logo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("team_id")
    public Integer getTeamId() { return teamId; }
    @JsonProperty("team_id")
    public void setTeamId(Integer teamId) { this.teamId = teamId; }
    @JsonProperty("team_name")
    public String getTeamName() { return teamName; }
    @JsonProperty("team_name")
    public void setTeamName(String teamName) { this.teamName = teamName; }
    @JsonProperty("logo")
    public String getLogo() { return logo; }
    @JsonProperty("logo")
    public void setLogo(String logo) { this.logo = logo; }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() { return additionalProperties; }
    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("team_id", teamId).append("team_name", teamName).append("logo", logo).append("additionalProperties", additionalProperties).toString();
    }
}
