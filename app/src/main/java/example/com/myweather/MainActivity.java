package example.com.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.internal.$Gson$Preconditions;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
EditText et;
TextView tv;
String url = "api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
String apikey ="6b5437bf711750880f28fdbac95c0571";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);
        tv = findViewById(R.id.tv);
    }
    public void getweather(View v){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        weatherAPI myapi = retrofit.create(weatherAPI.class);
        Call<example> example = myapi.getweather(et.getText().toString().trim(),apikey);
        example.enqueue(new Callback<example>() {
            @Override
            public void onResponse(Call<example> call, Response<example> response) {
                if(response.code()==404){
                    Toast.makeText(MainActivity.this,"Please Enter valid city",Toast.LENGTH_LONG).show();
                }
                else if(!(response.isSuccessful())){
                    Toast.makeText(MainActivity.this,response.code(),Toast.LENGTH_LONG).show();
                }
                example mydata=response.body();
                Main main=mydata.getMain();
                Double temp=main.getTemp();
                Integer temperature=(int)(temp-273.15);
                tv.setText(String.valueOf(temperature)+"c");

            }

            @Override
            public void onFailure(Call<example> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }
}