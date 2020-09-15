package pl.plpredictorapi.services;

import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.plpredictorapi.jsons.PremieshipTable;
import pl.plpredictorapi.jsons.Standing;
import pl.plpredictorapi.repos.TableLiveRepository;
import pl.plpredictorapi.repos.entites.TableLive;

@Service
public class TableLiveServices {
private TableLiveRepository tableLiveRepository;
    public TableLiveServices(TableLiveRepository tableLiveRepository) {
        this.tableLiveRepository = tableLiveRepository;
    }

    public Iterable<TableLive> list() {
        return tableLiveRepository.findAll();
    }

    public Iterable<TableLive> save(List<TableLive> tableLiveList) {
        return tableLiveRepository.saveAll(tableLiveList);
    }


    public void savePremiershipTable(){
	    RestTemplate template = new RestTemplate();
	    HttpHeaders httpHeaders = new HttpHeaders();
	    httpHeaders.add("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
	    httpHeaders.add("x-rapidapi-key", "ad53fe4823msh08e98e190c82629p19577djsn5a6af4d40f2c");
	    HttpEntity<String> entity = new HttpEntity<>("body", httpHeaders);
	    ResponseEntity<PremieshipTable> exchange =
			    template.exchange("https://api-football-v1.p.rapidapi.com/v2/leagueTable/2790", HttpMethod.GET, entity,
					    PremieshipTable.class);
	    List<Standing> leagueTable = exchange.getBody().getApi().getStandings().get(0);

	    Float ligueAvgGoalScoredHome = getLigueAvgGoalsScoredHome(leagueTable);
	    Float ligueAvgGoalScoredAway = getLigueAvgGoalsScoredAway(leagueTable);
	    Float ligueAvgGoalLostHome = getLigueAvgGoalsLostHome(leagueTable);
	    Float ligueAvgGoalLostAway = getLigueAvgGoalsLostAway(leagueTable);

	    for(Standing standing : leagueTable){
		    TableLive tl;
		    List<TableLive> existing = tableLiveRepository.getByName(standing.getTeamName());
		    if(!existing.isEmpty()){
		    	tl = existing.get(0);
		    }else{
		    	tl = new TableLive();
		    }

			tl.setApiId(standing.getTeamId());
		    tl.setClubName(standing.getTeamName());
		    tl.setPosition(standing.getRank());
		    tl.setWins(standing.getAll().getWin().floatValue());
		    tl.setDraws(standing.getAll().getDraw().floatValue());
		    tl.setLosses(standing.getAll().getLose().floatValue());
		    tl.setGoalsScored(standing.getAll().getGoalsFor().floatValue());
		    tl.setGoalsLost(standing.getAll().getGoalsAgainst().floatValue());
		    tl.setGoalsDifference(tl.getGoalsScored() - tl.getGoalsLost());
		    tl.setGoalsScoredHome(standing.getHome().getGoalsFor().floatValue());
		    tl.setGoalsLostHome(standing.getHome().getGoalsAgainst().floatValue());
		    tl.setGoalsScoredAway(standing.getAway().getGoalsFor().floatValue());
		    tl.setGoalsLostAway(standing.getAway().getGoalsAgainst().floatValue());
		    tl.setPoints(standing.getPoints().floatValue());
		    tl.setLeague(standing.getGroup());
		    tl.setMatchesPlayedHome(standing.getHome().getMatchsPlayed().floatValue());
		    tl.setMatchesPlayedAway(standing.getAway().getMatchsPlayed().floatValue());
		    tl.setLigueAvgGoalsScoredHome(ligueAvgGoalScoredHome);
		    tl.setLigueAvgGoalsScoredAway(ligueAvgGoalScoredAway);
		    tl.setLigueAvgGoalsLostHome(ligueAvgGoalLostHome);
		    tl.setLigueAvgGoalsLostAway(ligueAvgGoalLostAway);
			tl.calculateOffHome();
			tl.calculateOffAway();
			tl.calculateDeffHome();
			tl.calculateDeffAway();

		    System.out.println(tl.toString());

		    tableLiveRepository.save(tl);
	    }



	    /*
	    Takim zapytaniem wyświetlisz w konsoli całego jsona którego możesz wkleić w http://www.jsonschema2pojo.org/
	    żeby wygenerował ci klasy na które ci to zmapuje

	    ResponseEntity<String> exchange =
			    template.exchange("https://api-football-v1.p.rapidapi.com/v2/leagueTable/524", HttpMethod.GET, entity,
					    String.class);
	    System.out.println("AAAA "+exchange.getBody());
	    */

    }


    private Float getLigueAvgGoalsScoredHome(List<Standing> standings){
    	Float allgoals = 0f;
    	Float allMatch = 0f;
    	for(Standing standing : standings){
		    allgoals += standing.getHome().getGoalsFor();
		    allMatch += standing.getHome().getMatchsPlayed();
	    }
    	return allgoals/allMatch;
    }

	private Float getLigueAvgGoalsScoredAway(List<Standing> standings){
		Float allgoals = 0f;
		Float allMatch = 0f;
		for(Standing standing : standings){
			allgoals += standing.getAway().getGoalsFor();
			allMatch += standing.getAway().getMatchsPlayed();
		}
		return allgoals/allMatch;
	}

	private Float getLigueAvgGoalsLostHome(List<Standing> standings){
		Float allgoals = 0f;
		Float allMatch = 0f;
		for(Standing standing : standings){
			allgoals += standing.getHome().getGoalsAgainst();
			allMatch += standing.getHome().getMatchsPlayed();
		}
		return allgoals/allMatch;
	}

	private Float getLigueAvgGoalsLostAway(List<Standing> standings){
		Float allgoals = 0f;
		Float allMatch = 0f;
		for(Standing standing : standings){
			allgoals += standing.getAway().getGoalsAgainst();
			allMatch += standing.getAway().getMatchsPlayed();
		}
		return allgoals/allMatch;
	}
}
