
package com.tayyarah.api.hotel.tbo.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "BlockRoomResult"
})
public class HotelBlockResponse {

    @JsonProperty("BlockRoomResult")
    @Valid
    private com.tayyarah.api.hotel.tbo.model.BlockRoomResult BlockRoomResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelBlockResponse() {
    }

    /**
     * 
     * @param BlockRoomResult
     */
    public HotelBlockResponse(com.tayyarah.api.hotel.tbo.model.BlockRoomResult BlockRoomResult) {
        this.BlockRoomResult = BlockRoomResult;
    }

    /**
     * 
     * @return
     *     The BlockRoomResult
     */
    @JsonProperty("BlockRoomResult")
    public com.tayyarah.api.hotel.tbo.model.BlockRoomResult getBlockRoomResult() {
        return BlockRoomResult;
    }

    /**
     * 
     * @param BlockRoomResult
     *     The BlockRoomResult
     */
    @JsonProperty("BlockRoomResult")
    public void setBlockRoomResult(com.tayyarah.api.hotel.tbo.model.BlockRoomResult BlockRoomResult) {
        this.BlockRoomResult = BlockRoomResult;
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
