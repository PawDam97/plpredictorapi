
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
    "yellow",
    "second_yellow",
    "red"
})
public class Cards {

    @JsonProperty("yellow")
    private Integer yellow;
    @JsonProperty("second_yellow")
    private Integer secondYellow;
    @JsonProperty("red")
    private Integer red;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yellow")
    public Integer getYellow() {
        return yellow;
    }

    @JsonProperty("yellow")
    public void setYellow(Integer yellow) {
        this.yellow = yellow;
    }

    @JsonProperty("second_yellow")
    public Integer getSecondYellow() {
        return secondYellow;
    }

    @JsonProperty("second_yellow")
    public void setSecondYellow(Integer secondYellow) {
        this.secondYellow = secondYellow;
    }

    @JsonProperty("red")
    public Integer getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(Integer red) {
        this.red = red;
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
