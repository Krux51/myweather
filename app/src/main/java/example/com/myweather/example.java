package example.com.myweather;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class example {
    @SerializedName("main")
    Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
