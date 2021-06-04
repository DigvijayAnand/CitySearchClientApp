
package com.hsbc.interview.jsonmodel;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * JSON Wind property mapper pojo
 * @author digvijayanand
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "deg",
    "var_beg",
    "var_end"
})
@Generated("jsonschema2pojo")
public class Wind {

    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Integer deg;
    @JsonProperty("var_beg")
    private Integer varBeg;
    @JsonProperty("var_end")
    private Integer varEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Wind withSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    @JsonProperty("deg")
    public Integer getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Wind withDeg(Integer deg) {
        this.deg = deg;
        return this;
    }

    @JsonProperty("var_beg")
    public Integer getVarBeg() {
        return varBeg;
    }

    @JsonProperty("var_beg")
    public void setVarBeg(Integer varBeg) {
        this.varBeg = varBeg;
    }

    public Wind withVarBeg(Integer varBeg) {
        this.varBeg = varBeg;
        return this;
    }

    @JsonProperty("var_end")
    public Integer getVarEnd() {
        return varEnd;
    }

    @JsonProperty("var_end")
    public void setVarEnd(Integer varEnd) {
        this.varEnd = varEnd;
    }

    public Wind withVarEnd(Integer varEnd) {
        this.varEnd = varEnd;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Wind withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Wind.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("speed");
        sb.append('=');
        sb.append(((this.speed == null)?"<null>":this.speed));
        sb.append(',');
        sb.append("deg");
        sb.append('=');
        sb.append(((this.deg == null)?"<null>":this.deg));
        sb.append(',');
        sb.append("varBeg");
        sb.append('=');
        sb.append(((this.varBeg == null)?"<null>":this.varBeg));
        sb.append(',');
        sb.append("varEnd");
        sb.append('=');
        sb.append(((this.varEnd == null)?"<null>":this.varEnd));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.varBeg == null)? 0 :this.varBeg.hashCode()));
        result = ((result* 31)+((this.varEnd == null)? 0 :this.varEnd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.speed == null)? 0 :this.speed.hashCode()));
        result = ((result* 31)+((this.deg == null)? 0 :this.deg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wind) == false) {
            return false;
        }
        Wind rhs = ((Wind) other);
        return ((((((this.varBeg == rhs.varBeg)||((this.varBeg!= null)&&this.varBeg.equals(rhs.varBeg)))&&((this.varEnd == rhs.varEnd)||((this.varEnd!= null)&&this.varEnd.equals(rhs.varEnd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.speed == rhs.speed)||((this.speed!= null)&&this.speed.equals(rhs.speed))))&&((this.deg == rhs.deg)||((this.deg!= null)&&this.deg.equals(rhs.deg))));
    }

}
