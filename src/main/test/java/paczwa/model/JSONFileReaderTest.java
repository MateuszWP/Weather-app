package paczwa.model;

import org.json.JSONException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class JSONFileReaderTest {

    @Test
    void shouldThrowIOExceptionWhenURLIsNotValid(){
        assertThrows(IOException.class, () -> JSONFileReader.readJsonFromUrl("sdasaddsa"));
    }

}
