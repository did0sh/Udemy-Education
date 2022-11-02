package section10_Generics.generics_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String name;
    private List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (team != null && !league.contains(team)) {
            league.add(team);
            System.out.println("Team: " + team + " was successfully added to the league.");
            return true;
        } else  {
            System.out.println("Team: " + team + " already exists or is null.");
            return false;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T team: league) {
            System.out.println(team);
        }
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }
}
