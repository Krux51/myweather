
package example.com.myweather;

import java.util.HashMap;
import java.util.Map;
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@SerializedNameOrder({
//    "temp",
//    "feels_like",
//    "temp_min",
//    "temp_max",
//    "pressure",
//    "humidity"
//})
public class Main {

    @SerializedName("temp")
    private Double temp;
    @SerializedName("feels_like")
    private Double feelsLike;
    @SerializedName("temp_min")
    private Double tempMin;
    @SerializedName("temp_max")
    private Double tempMax;
    @SerializedName("pressure")
    private Integer pressure;
    @SerializedName("humidity")
    private Integer humidity;
    @Expose
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("temp")
    public Double getTemp() {
        return temp;
    }

    @SerializedName("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @SerializedName("feels_like")
    public Double getFeelsLike() {
        return feelsLike;
    }

    @SerializedName("feels_like")
    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    @SerializedName("temp_min")
    public Double getTempMin() {
        return tempMin;
    }

    @SerializedName("temp_min")
    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    @SerializedName("temp_max")
    public Double getTempMax() {
        return tempMax;
    }

    @SerializedName("temp_max")
    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    @SerializedName("pressure")
    public Integer getPressure() {
        return pressure;
    }

    @SerializedName("pressure")
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    @SerializedName("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @SerializedName("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//}

}
