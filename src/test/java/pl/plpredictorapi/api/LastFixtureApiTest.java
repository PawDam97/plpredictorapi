package pl.plpredictorapi.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.plpredictorapi.entites.LastFixture;
import pl.plpredictorapi.services.LastFixtureServices;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LastFixtureApiTest {
    @Mock
    private LastFixtureServices services;
    @InjectMocks
    private LastFixtureApi api;

    @Test
    void saveLastFixtureTest() {
       List<LastFixture> lastFixtureList = new ArrayList<>();
        LastFixture lastFixture = new LastFixture();
        lastFixtureList.add(lastFixture);
        services.saveLastFixture();
    }

    @Test
    void deleteLastFixtures() {
	    api.deleteLastFixtures();
	    verify(services, atLeastOnce()).delete();

    }
    @Test
    public void getLastFixtureById() throws Exception{
        MockitoAnnotations.initMocks(this);
       LastFixture lastFixture = new LastFixture();
       lastFixture.setId(1);
       lastFixture.setRoundNumber("12");
       lastFixture.setHomeTeam("Arsenal Londyn");
       lastFixture.setDate("13.12.2020");
       lastFixture.setFixtureId(23);
       lastFixture.setAwayTeam("Aston Villa");
       lastFixture.setHalftime("2:0");
       lastFixture.setFulltime("3:0");
        when(services.get(anyInt())).thenReturn(lastFixture);
        LastFixture actual = api.get(1);
        assertEquals("3:0", actual.getFulltime());
    }
}