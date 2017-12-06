package com.tayyarah.api.bus.esmart.model;
/*Created By Vimal Susai Raj S 
 * Date : 19-5-2017*/
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class BoardingPoint {

@JsonProperty("time")
private String time;
@JsonProperty("location")
private String location;
@JsonProperty("id")
private String id;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("time")
public String getTime() {
return time;
}

@JsonProperty("time")
public void setTime(String time) {
this.time = time;
}

@JsonProperty("location")
public String getLocation() {
return location;
}

@JsonProperty("location")
public void setLocation(String location) {
this.location = location;
}

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
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
