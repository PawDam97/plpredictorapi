package pl.plpredictorapi.api;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.plpredictorapi.repos.entites.Weights;
import pl.plpredictorapi.services.WeightsServices;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
class WeightsApiTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private WeightsServices weightsServices;
    @MockBean
    private WeightsApi weightsApi;




    @Test
   public void testWeightsById() throws Exception{
        Weights weights = new Weights();
        weights.setWeightsId(1);
        weights.setS2015_16((float) 1.1);
        weights.setS2016_17((float) 2);
        weights.setS2017_18((float) 1.5);
        weights.setS2018_19((float) 2);
        weights.setS2019_20((float) 1.8);
        weights.setS2020_21((float) 1);
        when(weightsServices.getById(anyInt())).thenReturn(weights);
        mockMvc.perform(MockMvcRequestBuilders.get("/Weights/1"))
                //.andExpect(jsonPath("$.weightsId", Matchers.is("1")))
                .andExpect((status().isOk()));
    }
}