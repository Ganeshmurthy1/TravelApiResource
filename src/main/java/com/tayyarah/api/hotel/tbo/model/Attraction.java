
package com.tayyarah.api.hotel.tbo.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Key",
    "Value"
})
public class Attraction {

    @JsonProperty("Key")
    private String Key;
    @JsonProperty("Value")
    private String Value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attraction() {
    }

    /**
     * 
     * @param Value
     * @param Key
     */
    public Attraction(String Key, String Value) {
        this.Key = Key;
        this.Value = Value;
    }

    /**
     * 
     * @return
     *     The Key
     */
    @JsonProperty("Key")
    public String getKey() {
        return Key;
    }

    /**
     * 
     * @param Key
     *     The Key
     */
    @JsonProperty("Key")
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 
     * @return
     *     The Value
     */
    @JsonProperty("Value")
    public String getValue() {
        return Value;
    }

    /**
     * 
     * @param Value
     *     The Value
     */
    @JsonProperty("Value")
    public void setValue(String Value) {
        this.Value = Value;
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
