package paczwa.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WeatherTest {

    @Test
    void convertSpeedFromMeterPerSecond(){
        //given()
        Weather weather = new Weather();
        double windSpeed = 10;

        //when
        double windAfterConvert = weather.convertMeterPerSecondToKilometerPerSecond(windSpeed);

        //then
        assertThat(windAfterConvert, equalTo(36.0));
    }
}
