package cmps121.homework2weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import cmps121.homework2weather.Response.*;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchWeather(View view){
        Toast.makeText(getApplicationContext(),"Fetching data", Toast.LENGTH_SHORT).show();
        Log.i("weatherHere", "here");
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://luca-teaching.appspot.com/")	//go to luca's site
                .addConverterFactory(GsonConverterFactory.create())	//parse Gson string
                .client(httpClient)	//add logging
                .build();

        GetWeatherApiService service = retrofit.create(GetWeatherApiService.class);

        Call<WeatherResponse> weatherResponseCall =  service.theWeatherResponse();

        weatherResponseCall.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Response<WeatherResponse> response) {
                try {
                    Log.i("result", response.body().getResponse().getResult().toString());
                } catch (java.lang.NullPointerException e){
                    Log.i("result", "result was null");
                    Toast.makeText(getApplicationContext(),"Server might be down. No data found.", Toast.LENGTH_SHORT).show();
                    return;
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error loading data. Please try again", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    if(response.body().getResponse().getResult().equals("ok")){
                        Log.i("error message", "valid 200 ");

                    }
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error loading data. Please try again", Toast.LENGTH_SHORT).show();
                    return;
                }

                try{
                    String fahrString = response.body().getResponse().getConditions().getTempF().toString();
                    String city = response.body().getResponse().getConditions().getObservationLocation().getCity();
                    String state = response.body().getResponse().getConditions().getObservationLocation().getState();
                    String humidity = response.body().getResponse().getConditions().getRelativeHumidity();
                    String weather = response.body().getResponse().getConditions().getWeather();
                    String lat = response.body().getResponse().getConditions().getObservationLocation().getLatitude();
                    Log.i("WeatherHere", "succesful call");
                    Log.i("WeatherHere", fahrString);

                    TextView Temp = (TextView) findViewById(R.id.TempView);
                    TextView City = (TextView) findViewById(R.id.CityView);
                    TextView State = (TextView) findViewById(R.id.StateView);
                    TextView Hum = (TextView) findViewById(R.id.HumView);
                    TextView Weather = (TextView) findViewById(R.id.WeatherView);
                    TextView Lat = (TextView) findViewById(R.id.LatView);

                    Temp.setText(fahrString + "°F");
                    City.setText(city);
                    State.setText(state);
                    Hum.setText(humidity);
                    Weather.setText(weather);
                    Lat.setText(lat);

                    Log.i("WeatherHere", response.body().getResponse().getResult());
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error loading data. Please try again", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getApplicationContext(),"Success!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {
                Log.i("weatherHereFailure", "some error");
            }
        });
    }

    public interface GetWeatherApiService {
        @GET("weather/default/get_weather")
        Call <WeatherResponse> theWeatherResponse();
    };
}