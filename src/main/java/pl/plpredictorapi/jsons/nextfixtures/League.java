package pl.plpredictorapi.jsons.nextfixtures;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "country",
        "logo",
        "flag"
})
public class League {
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("flag")
    private String flag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String name) { this.name = name; }
    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String country) { this.country = country; }
    @JsonProperty("logo")
    public String getLogo() { return logo; }
    @JsonProperty("logo")
    public void setLogo(String logo) { this.logo = logo; }
    @JsonProperty("flag")
    public String getFlag() { return flag; }
    @JsonProperty("flag")
    public void setFlag(String flag) { this.flag = flag; }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() { return additionalProperties; }
    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("country", country).append("logo", logo).append("flag", flag).append("additionalProperties", additionalProperties).toString();
    }
}
