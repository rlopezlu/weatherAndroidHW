package cmps121.homework2weather.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("conditions")
    @Expose
    private Conditions conditions;
    @SerializedName("result")
    @Expose
    private String result;

    /**
     * 
     * @return
     *     The conditions
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * 
     * @param conditions
     *     The conditions
     */
    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    /**
     * 
     * @return
     *     The result
     */
    public String getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    public void setResult(String result) {
        this.result = result;
    }

}
