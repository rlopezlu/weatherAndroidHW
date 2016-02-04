package cmps121.homework2weather.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObservationLocation {

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("elevation")
    @Expose
    private String elevation;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country_iso3166")
    @Expose
    private String countryIso3166;
    @SerializedName("latitude")
    @Expose
    private String latitude;

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The full
     */
    public String getFull() {
        return full;
    }

    /**
     * 
     * @param full
     *     The full
     */
    public void setFull(String full) {
        this.full = full;
    }

    /**
     * 
     * @return
     *     The elevation
     */
    public String getElevation() {
        return elevation;
    }

    /**
     * 
     * @param elevation
     *     The elevation
     */
    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The countryIso3166
     */
    public String getCountryIso3166() {
        return countryIso3166;
    }

    /**
     * 
     * @param countryIso3166
     *     The country_iso3166
     */
    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

}
