package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.LastFixture;
import pl.plpredictorapi.repos.entites.TableLive;
import pl.plpredictorapi.repos.entites.TeamsStrengths;
import pl.plpredictorapi.services.LastFixtureServices;

@RestController
@RequestMapping("/lastFixture")
public class LastFixtureApi {
    @Autowired
    private LastFixtureServices lastFixtureServices;

    public LastFixtureApi(LastFixtureServices lastFixtureServices){ this.lastFixtureServices = lastFixtureServices; }

    @GetMapping("/lastFixture")
    public Iterable<LastFixture> list(){
        return lastFixtureServices.list();
    }

    @GetMapping("/lastFixture/{fixtureId}")
    public LastFixture get(@PathVariable Integer fixtureId){
        return lastFixtureServices.get(fixtureId);
    }

    @GetMapping("/saveFixture")
    public void saveLastFixture(){
        lastFixtureServices.saveLastFixture();
    }

    @GetMapping("/delete")
    public void deleteLastFixtures(){
        lastFixtureServices.delete();
    }
}
