package pl.plpredictorapi.repos.entites;

import javax.persistence.*;

@Entity
@Table(name = "weights")
public class Weights {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer weightsId;
    private Float S2015_16;
    private Float S2016_17;
    private Float S2017_18;
    private Float S2018_19;
    private Float S2019_20;
    private Float S2020_21;



    public Weights(){
    }
    public Weights(Integer weights_id, float s2015_16, float s2016_17, float s2017_18, float s2018_19, float s2019_20, float s2020_21) {
        this.weightsId = weights_id;
        this.S2015_16 = s2015_16;
        this.S2016_17= s2016_17;
        this.S2017_18 = s2017_18;
        this.S2018_19 = s2018_19;
        this.S2019_20 = s2019_20;
        this.S2020_21 = s2020_21;
    }

    public Integer getWeightsId() {
        return weightsId;
    }

    public void setWeightsId(Integer weightsId) {
        weightsId = weightsId;
    }

    public Float getS2015_16() {
        return S2015_16;
    }

    public void setS2015_16(Float s2015_16) {
        S2015_16 = s2015_16;
    }

    public Float getS2016_17() {
        return S2016_17;
    }

    public void setS2016_17(Float s2016_17) {
        S2016_17 = s2016_17;
    }

    public Float getS2017_18() {
        return S2017_18;
    }

    public void setS2017_18(Float s2017_18) {
        S2017_18 = s2017_18;
    }

    public Float getS2018_19() {
        return S2018_19;
    }

    public void setS2018_19(Float s2018_19) {
        S2018_19 = s2018_19;
    }

    public Float getS2019_20() {
        return S2019_20;
    }

    public void setS2019_20(Float s2019_20) {
        S2019_20 = s2019_20;
    }

    public Float getS2020_21() {
        return S2020_21;
    }

    public void setS2020_21(Float s2020_21) {
        S2020_21 = s2020_21;
    }
}
