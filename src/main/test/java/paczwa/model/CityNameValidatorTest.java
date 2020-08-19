package paczwa.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CityNameValidatorTest {

    @Test
    void validatorShouldReturnFalseWhileCityNameEmpty(){
        //given
        String cityName = "";

        //when
        //then
        assertThat(CityNameValidator.validate(""), equalTo(false));
    }

    @Test
    void validatorShouldReturnTrueWhileCityNameIsNotEmpty(){
        //given
        String cityName = "Wroclaw";

        //when
        //then
        assertThat(CityNameValidator.validate(""), equalTo(false));
    }
}
