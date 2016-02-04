package cmps121.homework2weather.Response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conditions {

    @SerializedName("wind_gust_mph")
    @Expose
    private String windGustMph;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("observation_location")
    @Expose
    private ObservationLocation observationLocation;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
    @SerializedName("relative_humidity")
    @Expose
    private String relativeHumidity;
    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("dewpoint_c")
    @Expose
    private Integer dewpointC;
    @SerializedName("windchill_c")
    @Expose
    private String windchillC;
    @SerializedName("pressure_mb")
    @Expose
    private String pressureMb;
    @SerializedName("windchill_f")
    @Expose
    private String windchillF;
    @SerializedName("dewpoint_f")
    @Expose
    private Integer dewpointF;
    @SerializedName("wind_mph")
    @Expose
    private Double windMph;

    /**
     * 
     * @return
     *     The windGustMph
     */
    public String getWindGustMph() {
        return windGustMph;
    }

    /**
     * 
     * @param windGustMph
     *     The wind_gust_mph
     */
    public void setWindGustMph(String windGustMph) {
        this.windGustMph = windGustMph;
    }

    /**
     * 
     * @return
     *     The tempF
     */
    public Double getTempF() {
        return tempF;
    }

    /**
     * 
     * @param tempF
     *     The temp_f
     */
    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    /**
     * 
     * @return
     *     The observationLocation
     */
    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    /**
     * 
     * @param observationLocation
     *     The observation_location
     */
    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    /**
     * 
     * @return
     *     The tempC
     */
    public Double getTempC() {
        return tempC;
    }

    /**
     * 
     * @param tempC
     *     The temp_c
     */
    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    /**
     * 
     * @return
     *     The relativeHumidity
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * 
     * @param relativeHumidity
     *     The relative_humidity
     */
    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    /**
     * 
     * @return
     *     The weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }

    /**
     * 
     * @return
     *     The dewpointC
     */
    public Integer getDewpointC() {
        return dewpointC;
    }

    /**
     * 
     * @param dewpointC
     *     The dewpoint_c
     */
    public void setDewpointC(Integer dewpointC) {
        this.dewpointC = dewpointC;
    }

    /**
     * 
     * @return
     *     The windchillC
     */
    public String getWindchillC() {
        return windchillC;
    }

    /**
     * 
     * @param windchillC
     *     The windchill_c
     */
    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    /**
     * 
     * @return
     *     The pressureMb
     */
    public String getPressureMb() {
        return pressureMb;
    }

    /**
     * 
     * @param pressureMb
     *     The pressure_mb
     */
    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    /**
     * 
     * @return
     *     The windchillF
     */
    public String getWindchillF() {
        return windchillF;
    }

    /**
     * 
     * @param windchillF
     *     The windchill_f
     */
    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    /**
     * 
     * @return
     *     The dewpointF
     */
    public Integer getDewpointF() {
        return dewpointF;
    }

    /**
     * 
     * @param dewpointF
     *     The dewpoint_f
     */
    public void setDewpointF(Integer dewpointF) {
        this.dewpointF = dewpointF;
    }

    /**
     * 
     * @return
     *     The windMph
     */
    public Double getWindMph() {
        return windMph;
    }

    /**
     * 
     * @param windMph
     *     The wind_mph
     */
    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

}
