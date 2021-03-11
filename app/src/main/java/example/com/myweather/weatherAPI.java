package example.com.myweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface weatherAPI {
    @GET("weather")
    Call<example> getweather(@Query("q") String city, @Query("appid") String apikey);
}
