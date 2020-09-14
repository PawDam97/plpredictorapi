package pl.plpredictorapi.jsons.nextfixtures;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;
import pl.plpredictorapi.jsons.Api;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "api"
})
public class NextFixturesTable {
    @JsonProperty("api")
    private ApiLeague apiLeague;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("api")
    public ApiLeague getApi() {
        return apiLeague;
    }

    @JsonProperty("api")
    public void setApi(ApiLeague apiLeague) {
        this.apiLeague = apiLeague;
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
        return new ToStringBuilder(this).append("api", apiLeague).append("additionalProperties", additionalProperties).toString();
    }

}
