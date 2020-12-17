package pl.plpredictorapi.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.plpredictorapi.repos.entites.Weights;
import pl.plpredictorapi.services.WeightsServices;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeightsApiTest {

    @Mock
    private WeightsServices weightsServices;
    @InjectMocks
    private WeightsApi api;


    @Test
    public void testWeightsById() throws Exception{
        MockitoAnnotations.initMocks(this);
        Weights weights = new Weights();
        weights.setWeightsId(1);
        weights.setS2015_16((float) 1.1);
        weights.setS2016_17((float) 2);
        weights.setS2017_18((float) 1.5);
        weights.setS2018_19((float) 2);
        weights.setS2019_20((float) 1.8);
        weights.setS2020_21((float) 1);
        when(weightsServices.getById(anyInt())).thenReturn(weights);
        Weights actual = api.get(1);
        assertEquals(1f, actual.getS2020_21(),0f);
    }
}