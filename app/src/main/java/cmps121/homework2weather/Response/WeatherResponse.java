package cmps121.homework2weather.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WeatherResponse {

    @SerializedName("response")
    @Expose
    private Response response;

    /**
     * 
     * @return
     *     The response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

}
