
package com.hsbc.interview.jsonmodel;

import java.util.ArrayList;
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
 * JSON data property mapper pojo
 * @author digvijayanand
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cod",
    "calctime",
    "cnt",
    "list"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("cod")
    private String cod;
    @JsonProperty("calctime")
    private Double calctime;
    @JsonProperty("cnt")
    private Integer cnt;
    @JsonProperty("list")
    private java.util.List<com.hsbc.interview.jsonmodel.List> list = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    public Data withCod(String cod) {
        this.cod = cod;
        return this;
    }

    @JsonProperty("calctime")
    public Double getCalctime() {
        return calctime;
    }

    @JsonProperty("calctime")
    public void setCalctime(Double calctime) {
        this.calctime = calctime;
    }

    public Data withCalctime(Double calctime) {
        this.calctime = calctime;
        return this;
    }

    @JsonProperty("cnt")
    public Integer getCnt() {
        return cnt;
    }

    @JsonProperty("cnt")
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public Data withCnt(Integer cnt) {
        this.cnt = cnt;
        return this;
    }

    @JsonProperty("list")
    public java.util.List<com.hsbc.interview.jsonmodel.List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<com.hsbc.interview.jsonmodel.List> list) {
        this.list = list;
    }

    public Data withList(java.util.List<com.hsbc.interview.jsonmodel.List> list) {
        this.list = list;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cod");
        sb.append('=');
        sb.append(((this.cod == null)?"<null>":this.cod));
        sb.append(',');
        sb.append("calctime");
        sb.append('=');
        sb.append(((this.calctime == null)?"<null>":this.calctime));
        sb.append(',');
        sb.append("cnt");
        sb.append('=');
        sb.append(((this.cnt == null)?"<null>":this.cnt));
        sb.append(',');
        sb.append("list");
        sb.append('=');
        sb.append(((this.list == null)?"<null>":this.list));
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
        result = ((result* 31)+((this.cnt == null)? 0 :this.cnt.hashCode()));
        result = ((result* 31)+((this.cod == null)? 0 :this.cod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.list == null)? 0 :this.list.hashCode()));
        result = ((result* 31)+((this.calctime == null)? 0 :this.calctime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return ((((((this.cnt == rhs.cnt)||((this.cnt!= null)&&this.cnt.equals(rhs.cnt)))&&((this.cod == rhs.cod)||((this.cod!= null)&&this.cod.equals(rhs.cod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.list == rhs.list)||((this.list!= null)&&this.list.equals(rhs.list))))&&((this.calctime == rhs.calctime)||((this.calctime!= null)&&this.calctime.equals(rhs.calctime))));
    }

}
