package pl.plpredictorapi.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.plpredictorapi.entites.PlayerStatsOne;
import pl.plpredictorapi.services.PlayerOneServices;


import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlayerOneApiTest {
    @Mock
    private PlayerOneServices playerOneServices;
    @InjectMocks
    private PlayerOneApi api;

    @Test
    void TestAllPlayersOne() throws Exception{
        MockitoAnnotations.initMocks(this);
        PlayerStatsOne playerStatsOne = new PlayerStatsOne();
        playerStatsOne.setPlayerId(1);
        playerStatsOne.setAssists(10);
        playerStatsOne.setCleanSheets(0);
        playerStatsOne.setClub("Manchester City");
        playerStatsOne.setGoals(8);
        playerStatsOne.setLeague("PL");
        playerStatsOne.setName("Test");
        playerStatsOne.setPosition(3);
        playerStatsOne.setRedCards(0);
        playerStatsOne.setSurname("Testowo");
        playerStatsOne.setYellowCards(7);
        when(playerOneServices.get(anyInt())).thenReturn(playerStatsOne);
        PlayerStatsOne actual = api.get(1);
        assertEquals(8, actual.getGoals(),0f);
    }
}