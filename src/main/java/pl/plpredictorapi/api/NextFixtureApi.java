package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.NextFixture;
import pl.plpredictorapi.services.NextFixtureServices;

@RestController
@RequestMapping("/nextFixture")
public class NextFixtureApi {
    @Autowired
    private NextFixtureServices nextFixtureServices;

    public NextFixtureApi(NextFixtureServices nextFixtureServices){ this.nextFixtureServices = nextFixtureServices; }

    @GetMapping("/nextFixture")
    public Iterable<NextFixture> list(){
        return nextFixtureServices.list();
    }

    @GetMapping("/saveFixture")
    public void saveNextFixture(){
        nextFixtureServices.saveNextFixture();
    }

    @GetMapping("/delete")
    public void deleteNextFixtures(){
        nextFixtureServices.delete();
    }
}
