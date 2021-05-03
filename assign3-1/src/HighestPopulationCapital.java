import java.util.*;

public class HighestPopulationCapital {
    public List<String> highestPopulationCapital() {
        ReadCsv p2 = new ReadCsv();
        ReadText p = new ReadText();
        Map<Double, String> sortedMap = new TreeMap<>();

        List<City> Cities = p.readCitiesFromTxt("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\assign3-1\\src\\Cities.txt");
        List<Continent> continents = p2.readContinentFromCsv("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\assign3-1\\src\\CapitalCountryContinent.csv");
        Map<Double, String> hm4 = new HashMap<>();
        List<String> values7 = new ArrayList<>();
        for (int y = 0; y < Cities.size(); y++) {
            hm4.put(Cities.get(y).getPopulation(), Cities.get(y).getName());

        }
        sortedMap = new TreeMap<>(hm4);

        List<String> targetList = new ArrayList<>(sortedMap.values());



        for (int i =0; i<targetList.size(); i++) {
            for (int j = 0; j < continents.size(); j++) {
                if (targetList.get(i).equals(continents.get(j).getCapitalCity())) {
                    values7.add(continents.get(j).getCapitalCity());
                    break;
                }

            }

        }
        return values7;
    }
}
