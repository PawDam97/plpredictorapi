package pl.plpredictorapi.jsons.nextfixtures;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results",
        "fixtures"
})
public class ApiLeague {

    @JsonProperty("results")
    private Integer results;
    @JsonProperty("fixtures")
    private List<List<Fixture>> fixtures = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public Integer getResults() { return results; }

    @JsonProperty("results")
    public void setResults(Integer results) { this.results = results; }

    @JsonProperty("fixtures")
    public List<List<Fixture>> getFixtures() { return fixtures; }

    @JsonProperty("fixtures")
    public void setFixtures(List<List<Fixture>> fixtures) { this.fixtures = fixtures; }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() { return additionalProperties; }
    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("results", results).append("fixtures", fixtures).append("additionalProperties", additionalProperties).toString();
    }
}
